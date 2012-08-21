package com.kimddochi.service.impl.common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.inject.Inject;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

import utils.GeneratorUUID;

import com.kimddochi.dto.common.FileInfo;
import com.kimddochi.service.face.common.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Inject private FileSystemResource fsResource;

	@Override
	public void save(FileInfo fileInfo)
	{
		//TODO: 업로드 파일이 존재할 경우
		if(!fileInfo.getFileData().isEmpty())
		{
			String filename = fileInfo.getFileData().getOriginalFilename();
			String imgExt = filename.substring(filename.lastIndexOf(".")+1, filename.length());

			//TODO: 파일 저장 경로가 존재하지 않을경우 경로 만들기
			File savePath = new File(fsResource.getPath() + fileInfo.getFilePath());
			if(!savePath.exists()) savePath.mkdirs();

			//TODO: 확장자 체크
			if(imgExt.equalsIgnoreCase("JPG") || imgExt.equalsIgnoreCase("JPEG") || imgExt.equalsIgnoreCase("GIF"))
			{
				try 
				{
					//TODO: 시스템 파일 생성
					String copyFileName = GeneratorUUID.getRandomUUID();
					File copyFile = File.createTempFile(copyFileName, ".tmp", savePath);

					// transferTo메소드에서는 this.fileItem.write(copyFile) 밖에 실행되는 것이 없음.
					//					fileInfo.getFileData().transferTo(copyFile);

					//TODO: 파일정보 저장
					fileInfo.setIdx(GeneratorUUID.getRandomUUID());
					fileInfo.setFilePath(savePath.getPath());
					fileInfo.setOriginalFileName(filename);
					fileInfo.setSystemFileName(copyFile.getName());
					fileInfo.setContentType(fileInfo.getFileData().getContentType());
					fileInfo.setFileSize(fileInfo.getFileData().getSize());

					//TODO: 파일 정보 DB 입력
					//##########################################
				}
				catch (Exception e){
					throw new RuntimeException(e);
				}
			}
			//TODO: 업로드파일이 2개 이상일 경우 zip파일로 업로드
			else if(imgExt.equalsIgnoreCase("ZIP"))
			{
				try
				{
					// Create an instance of ZipFile to read a zip file
					ZipFile zip = new ZipFile(new File(filename));

					//
					// Here we start to iterate each entries inside
					// sample.zip
					//
					for (Enumeration<? extends ZipEntry> e = zip.entries(); e.hasMoreElements(); ) {
						//
						// Get ZipEntry which is a file or a directory
						//
						ZipEntry entry = (ZipEntry) e.nextElement();

						//
						// Get some information about the entry such as
						// file name, its size.
						//
						System.out.println("File name: " + entry.getName()
								+ "; size: " + entry.getSize()
								+ "; compressed size: "
								+ entry.getCompressedSize());
						System.out.println("");

						//
						// Now we want to get the content of this entry.
						// Get the InputStream, we read through the input
						// stream until all the content is read.
						//
						InputStream is = zip.getInputStream(entry);
						InputStreamReader isr = new InputStreamReader(is);

						char[] buffer = new char[1024];
						while (isr.read(buffer, 0, buffer.length) != -1) {
							String s = new String(buffer);
							//
							// Here we just print out what is inside the
							// buffer.
							//
							System.out.println(s.trim());
						}
					}
				} catch (ZipException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


			}
			else
			{
				System.err.println("File type error! ");
			}
		}

	}

}

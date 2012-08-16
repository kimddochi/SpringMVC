package com.kimddochi.service.impl;

import java.io.File;
import java.util.Random;

import javax.inject.Inject;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

import utils.GeneratorUUID;

import com.kimddochi.dto.common.FileInfo;
import com.kimddochi.service.face.FileService;

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
					fileInfo.setFilePath(savePath.getPath());
					fileInfo.setOriginalFileName(filename);
					fileInfo.setSystemFileName(copyFile.getName());
					fileInfo.setContentType(fileInfo.getFileData().getContentType());
					fileInfo.setFileSize(fileInfo.getFileData().getSize());

					//TODO: 파일 정보 DB 입력
					//##########################################
				}
				catch (Exception e)
				{
					throw new RuntimeException(e);
				}
			}
			//TODO: 업로드파일이 2개 이상일 경우 zip파일로 업로드
			else if(imgExt.equalsIgnoreCase("ZIP"))
			{
				System.err.println("File type error! ");
			}
			else
			{
				System.err.println("File type error! ");
			}
		}

	}

}

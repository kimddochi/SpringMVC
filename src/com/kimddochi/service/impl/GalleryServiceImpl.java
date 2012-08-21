package com.kimddochi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimddochi.dto.common.FileInfo;
import com.kimddochi.service.face.GalleryService;
import com.kimddochi.service.face.common.FileService;

@Service
public class GalleryServiceImpl implements GalleryService {
	
	private final String path = "gallery";
	
	@Autowired FileService fileService;
	
	@Override
	public void save(FileInfo fileInfo) {
		
		fileInfo.setFilePath(path);
		this.fileService.save(fileInfo);
		
	}

}

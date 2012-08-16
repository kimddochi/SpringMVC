package com.kimddochi.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utils.GeneratorUUID;

import com.kimddochi.dto.common.FileInfo;
import com.kimddochi.service.face.FileService;
import com.kimddochi.service.face.GalleryService;

@Service
public class GalleryServiceImpl implements GalleryService {
	
	private final String path = "gallery";
	
	@Autowired FileService fileService;
	
	@Override
	public void save(FileInfo fileInfo) {
		
		fileInfo.setIdx(GeneratorUUID.getRandomUUID());
		fileInfo.setFilePath(path);
		this.fileService.save(fileInfo);
		
	}

}

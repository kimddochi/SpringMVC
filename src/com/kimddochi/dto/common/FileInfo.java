package com.kimddochi.dto.common;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileInfo {
	
	private String idx              = "";		// 파일 index
	private CommonsMultipartFile fileData   = null;
	private String filePath          = "";
	private String originalFileName = "";		// 실제 파일의 이름
	private String systemFileName   = "";		// 저장된 파일의 이름
	private String contentType      = "";		// 파일의 타입
	private long fileSize            = 0;		// 파일 용량
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public CommonsMultipartFile getFileData() {
		return fileData;
	}
	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getSystemFileName() {
		return systemFileName;
	}
	public void setSystemFileName(String systemFileName) {
		this.systemFileName = systemFileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

}

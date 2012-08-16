package com.kimddochi.controller.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kimddochi.dto.common.FileInfo;
import com.kimddochi.service.face.GalleryService;

@Controller
@RequestMapping("/mng/gallery")
public class MngGalleryController {

	@Autowired GalleryService galleryService;
	
	@RequestMapping("/L")
	public String getList(){
		return "/manager/galleryList";
	}
	
	@RequestMapping("/W")
	public String write(){
		return "/manager/galleryWrite";
	}
	
	@RequestMapping("/S")
	public String save(FileInfo fileInfo){
		
		this.galleryService.save(fileInfo);
		
		return "redirect:./L";
	}
	
}
package com.kimddochi.controller.kor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/kor/gallery")
public class GalleryController {

	@RequestMapping("/L")
	public String getList(){
		return "/kor/galleryList";
	}
	
}
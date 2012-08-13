package com.kimddochi.controller.kor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/kor/bbs")
public class BbsController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String home(@PathVariable String name, ModelMap model) {
		model.addAttribute("movie", name);
		return "home";
	}
	
	@RequestMapping("/L")
	public String getList(){
		return "/kor/community/bbsList";
	}
	
}
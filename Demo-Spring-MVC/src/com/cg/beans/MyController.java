package com.cg.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/getMsg")
//@SessionAttributes("message")
public class MyController {

	@RequestMapping(method=RequestMethod.GET)
//	@ResponseBody
	public Object getMessage(ModelMap map){
		
		map.addAttribute("message","Hello, World!");
	
		
		return "displayMessage";
	}
//	
//	@RequestMapping(method=RequestMethod.GET)
////	@ResponseBody
//	public Object getMessage1(ModelMap map){
//		
//		map.addAttribute("message","Hello, World1111!");
//		return "displayMessage";
//	}
	
	
	
}

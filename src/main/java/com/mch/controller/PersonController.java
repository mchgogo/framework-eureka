package com.mch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;





@Slf4j
@Controller
@RequestMapping(value="person")
public class PersonController {
	
	 @RequestMapping("/index")
	  public String index(){
	    return "index";
	  }

}

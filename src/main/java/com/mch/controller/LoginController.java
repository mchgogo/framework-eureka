package com.mch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;



/**
 * 测试
 * @author dell
 *
 */

@Slf4j
@Controller
@RequestMapping(value="login")
public class LoginController {
	
	 @RequestMapping("/index")
	  public String login(){
	    return "index";
	  }

}

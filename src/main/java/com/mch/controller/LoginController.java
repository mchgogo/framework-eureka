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
@RequestMapping(value="Login")
public class LoginController {
	
	 @RequestMapping("/login")
	  public String login(){
	    return "index";
	  }

}

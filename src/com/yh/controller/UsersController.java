package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
}

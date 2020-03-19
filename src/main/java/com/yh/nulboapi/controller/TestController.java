package com.yh.nulboapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.nulboapi.service.UserService;

@Controller
public class TestController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {
		System.out.println("===================TEST===============");
		userService.getUserList(null);
		return "index";
	}
}

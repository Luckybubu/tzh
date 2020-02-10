package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Admin {
	
	@RequestMapping("admin.do")
	public  String adminList() {
		System.out.println(1);
		return "index";
	}
	
}

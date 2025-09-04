package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class mainController {
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("확인");
		
		return "main" ;
	};
	
	@RequestMapping("/index")
	public String index() {
		return"index";
	};
	

}

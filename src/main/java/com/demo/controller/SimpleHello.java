package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SimpleHello {

	@GetMapping("/add")
	public int add()
	
	{
		int x=4;
		int y=6;
		return x+y;
	}
	{
		

	}

}

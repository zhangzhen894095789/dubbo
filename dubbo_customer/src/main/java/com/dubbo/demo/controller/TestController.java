package com.dubbo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.demo.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testDubbo")
	@ResponseBody
	public String sayDubbo(){
		String str = testService.testSayDubbo();
		return str;
	}

	@RequestMapping("/testSay/{name}")
	@ResponseBody
	public String sayHello(@PathVariable String name){
		String str = testService.say(name);
		return str;
	}
}

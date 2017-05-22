package com.dubbo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.demo.service.TestService;
import com.dubbo.demo.service.TestService2;
@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestService2 testService2;
	
	@RequestMapping("/testDubbo")
	@ResponseBody
	public String sayDubbo(){
		String str = testService.testSayDubbo();
		return str;
	}

	@RequestMapping("/testSay/{name}")
	@ResponseBody
	public String sayHello(@PathVariable("name") String cname){
		String str = testService.say(cname);
		return str;
	}
	
	@ResponseBody
	public String sayDubbo2(){
		String str = testService2.testSayDubbo2();
		return str;
	}

	@RequestMapping("/testSay/{name}")
	@ResponseBody
	public String sayHello2(@PathVariable("name") String cname){
		String str = testService2.say2(cname);
		return str;
	}
}

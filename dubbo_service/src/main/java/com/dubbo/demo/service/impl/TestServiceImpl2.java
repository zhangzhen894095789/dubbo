package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.TestService2;

public class TestServiceImpl2 implements TestService2{

	public String testSayDubbo2() {
		System.out.println("---testSayDubbo2----服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Dubbo2 say:Hello!!!!!");
		return stringBuffer.toString();
	}

	public String say2(String name) {
		System.out.println("----say2---服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name+" say2:Hello!!!!!");
		return stringBuffer.toString();
	}

}

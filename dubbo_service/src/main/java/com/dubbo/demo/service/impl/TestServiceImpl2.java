package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.TestService2;

public class TestServiceImpl2 implements TestService2{

	public String testSayDubbo2() {
		System.out.println("---testSayDubbo----服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Dubbo say:Hello!!!!!");
		return stringBuffer.toString();
	}

	public String say2(String name) {
		System.out.println("----say---服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name+" say:Hello!!!!!");
		return stringBuffer.toString();
	}

}

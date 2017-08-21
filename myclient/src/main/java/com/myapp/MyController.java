package com.myapp;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dto.MyClientBean1;

/**
 * 类MyController.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午4:28:51
 */
@RestController
public class MyController {
	@Resource
	private MyClient myClient;
	
	@RequestMapping("/hello")
	public MyClientBean1 hello(){
		MyClientBean1 bean= myClient.hello("test-test-test");
		System.out.println("result: name:"+bean.getName()+" info:"+bean.getInfo());
		return bean;
	}
}

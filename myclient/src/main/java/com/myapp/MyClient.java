package com.myapp;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapp.dto.MyClientBean1;

/**
 * 类MyClient.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午4:33:54
 */

@FeignClient(name="myservice-p2")
public interface MyClient {
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	MyClientBean1 hello(@RequestParam("name") String name);
}

package com.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapp.dto.MyServiceBean1;

/**
 * 类MyService.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午2:50:47
 */

//@RequestMapping("/myservice")
public interface MyService {
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	MyServiceBean1 hello(@RequestParam("name") String name);
}

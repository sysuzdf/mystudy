package com.myapp.impl;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.myapp.MyService;
import com.myapp.config.MyConfig;
import com.myapp.dto.MyServiceBean1;

/**
 * 类MyServiceImpl.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午2:53:40
 */
@RestController
public class MyServiceImpl implements MyService{
	
	@Resource
	private MyConfig myConfig;

	/* (non-Javadoc)
	 * @see com.myapp.MyService#hello(java.lang.String)
	 */
	@Override
	public MyServiceBean1 hello(String name) {
		MyServiceBean1 bean=new MyServiceBean1();
		bean.setName(name);
		bean.setInfo(myConfig.getInfo());
		return bean;
	}

}

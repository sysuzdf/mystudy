package com.myapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类MyConfig.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午3:05:26
 */
@Component
@ConfigurationProperties(prefix="myConfig")
public class MyConfig {
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}

package com.myapp.dto;

import java.io.Serializable;

/**
 * 类MyServiceBean1.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午2:51:19
 */

public class MyServiceBean1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String info;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	
}

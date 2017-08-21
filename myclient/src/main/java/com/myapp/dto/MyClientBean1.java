package com.myapp.dto;

import java.io.Serializable;

/**
 * 类MyClientBean1.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月14日 下午4:30:25
 */
public class MyClientBean1 implements Serializable{
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

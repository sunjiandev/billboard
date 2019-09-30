package com.sunjiandev.billboard.entity;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 10:00
 * Description:
 */
public class BaseData {
	private String data;

	public BaseData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BaseData{" +
				"data='" + data + '\'' +
				'}';
	}
}

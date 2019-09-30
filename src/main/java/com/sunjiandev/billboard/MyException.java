package com.sunjiandev.billboard;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 15:22
 * Description:
 */
public class MyException extends RuntimeException{
	private final String code;
	private final String msg;

	public MyException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}

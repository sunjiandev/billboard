package com.sunjiandev.billboard.entity;

import org.springframework.util.StringUtils;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 9:59
 * Description:
 */
public class BaseResult<T> {
	private int tag;
	private int code;
	private String reason;
	private T data;

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BaseResult{" +
				"tag=" + tag +
				", code=" + code +
				", reason='" + reason + '\'' +
				", data=" + data +
				'}';
	}
}

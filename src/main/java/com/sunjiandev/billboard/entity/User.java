package com.sunjiandev.billboard.entity;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/29 20:22
 * Description:
 */
public class User {
	private String username;
	private String password;
	private String nickname;
	private int age;
	private int sex;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", nickname='" + nickname + '\'' +
				", age=" + age +
				", sex=" + sex +
				'}';
	}
}

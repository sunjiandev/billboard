package com.sunjiandev.billboard.service;

import com.sunjiandev.billboard.entity.User;
import com.sunjiandev.billboard.mapper.LoginMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 10:13
 * Description:
 */
@Service
public class LoginService {

	@Autowired
	private LoginMapper loginMapper;

	public User login(String username, String password) {
		return loginMapper.login(username, password);
	}

	public User queryUserExist(String username) {
		return loginMapper.queryUserExist(username);
	}

	public void register(String username, String password,  int age, int sex, String nickname) {
		loginMapper.register(username, password, age, sex, nickname);
	}

	public List<User> getAllUser() {
		return loginMapper.getAllUser();
	}
}

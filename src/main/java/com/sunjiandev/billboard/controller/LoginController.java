package com.sunjiandev.billboard.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sunjiandev.billboard.BaseUtils;
import com.sunjiandev.billboard.entity.User;
import com.sunjiandev.billboard.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 9:43
 * Description:
 */
@RestController
@RequestMapping(value = "/init")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String username, String password) {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {

			return BaseUtils.returnJson(2, 200, "用户名密码不能为空", "");
		} else {

			User login = loginService.login(username, password);

			if (login != null) {

				return BaseUtils.returnJson(1, 200, "登录成功", "");
			} else {
				return BaseUtils.returnJson(2, 200, "该用户尚未注册", "");
			}

		}
	}

	@RequestMapping("/register")
	public String register(String username, String password) {
		User user = loginService.queryUserExist(username);
		if (user != null) {
			return BaseUtils.returnJson(2, 200, "该用户名已存在", "");
		} else {
			loginService.register(username, password, 23, 1, username);
			return BaseUtils.returnJson(1, 200, "注册成功", "");
		}
	}

	@RequestMapping("/getAllUser")
	public String getAllUser() {


		List<User> allUser = loginService.getAllUser();

		String jsonString = JSON.toJSONString(allUser);

		JSONArray array = JSON.parseArray(jsonString);

		return BaseUtils.returnJson(1, 200, "", array);

	}
}

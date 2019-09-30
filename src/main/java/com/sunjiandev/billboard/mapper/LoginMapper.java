package com.sunjiandev.billboard.mapper;

import com.sunjiandev.billboard.entity.User;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 10:13
 * Description:
 */
@Repository
public interface LoginMapper {
	User login(String username, String password);

	User queryUserExist(String username);

	void register(String username, String password, int age, int sex, String nickname);

	List<User> getAllUser();
}

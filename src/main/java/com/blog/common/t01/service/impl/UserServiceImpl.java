package com.blog.common.t01.service.impl;

import com.blog.common.t01.pojo.User;
import com.blog.common.t01.service.IUserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.common.t01.dao.IUserDao;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}

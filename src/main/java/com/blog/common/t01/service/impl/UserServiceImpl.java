package com.blog.common.t01.service.impl;

import com.blog.common.t01.pojo.User;
import com.blog.common.t01.service.IUserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.common.t01.dao.IUserDao;
/**
 * 
 * 功能说明：用户管理 业务逻辑层
 *
 * @date 2017-4-21
 * @author chenwq
 * @email chenwqEmail@163.com
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}

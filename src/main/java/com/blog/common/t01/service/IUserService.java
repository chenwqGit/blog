/**
 * 
 */
package com.blog.common.t01.service;

import com.blog.common.t01.pojo.User;

/**
 * 
 * 功能说明：用户管理 service层接口
 *
 * @date 2017-4-21
 * @author chenwq
 * @email chenwqEmail@163.com
 *
 */
public interface IUserService {
	public User getUserById(int userId);
}

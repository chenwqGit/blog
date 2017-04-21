package com.blog.common.t01.dao;

import com.blog.common.t01.pojo.User;
/**
 * 
 * 功能说明：用户管理 DAO层接口
 *
 * @date 2017-4-21
 * @author chenwq
 * @email chenwqEmail@163.com
 *
 */
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
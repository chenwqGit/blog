package com.blog.common.t01.dao;

import com.blog.common.t01.pojo.User;
/**
 * 
 * @author CWQ
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
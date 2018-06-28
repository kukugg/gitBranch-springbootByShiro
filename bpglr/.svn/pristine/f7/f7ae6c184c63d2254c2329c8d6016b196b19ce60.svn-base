package com.bpglr.index.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bpglr.index.model.UserInfo;

public interface UserInfoDao {
    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    //用户名查询用户信息sys登陆用 用 准确查询 
    UserInfo findByUserName(@Param("username")  String username);
    
    //查询所有用户列表
    List<UserInfo> getAllUserList(@Param("username") String username);
    
    //状态重置为0
    void deleteByBatch(@Param("ids") List<Long> ids); 
}
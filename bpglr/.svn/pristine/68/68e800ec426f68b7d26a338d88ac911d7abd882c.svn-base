package com.bpglr.index.dao;

import java.util.List;

import com.bpglr.index.model.SysUserRole;

public interface SysUserRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
    
    //根据用户id删除角色关系
    int deleteRoleyUserId(Long userId);
    
    //批量插入
    void insertByBatch(List<SysUserRole> sysUserRoles);

}
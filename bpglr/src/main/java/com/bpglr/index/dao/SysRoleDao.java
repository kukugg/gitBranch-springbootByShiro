package com.bpglr.index.dao;

import java.util.List;
import java.util.Map;

import com.bpglr.index.model.SysRole;
import com.bpglr.index.model.UserInfo;

public interface SysRoleDao {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    //根据用户获得角色集合
    List<SysRole> findSysRoleByUserInfo(UserInfo userInfo);
    
    //获得所有角色
    List<SysRole> getAllSysRole(Map<String, Object> params);
    
    //批量删除角色
    void deleteBatchIds(Long[] roleIds);
    
    //批量删除角色用户关系
    void deleteBatchRoleAndUser(Long[] roleIds);
    
    //批量删除角色菜单关系
    void deleteBatchRoleAndMenu(Long[] roleIds);
    
}
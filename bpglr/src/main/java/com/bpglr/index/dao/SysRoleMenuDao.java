package com.bpglr.index.dao;

import java.util.List;

import com.bpglr.index.model.SysRoleMenu;

public interface SysRoleMenuDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
    
    // 根据roleid 删除角色关系
    int deleteByRoleId(Long roleId);
    
    //批量插入
    void insertByBatch(List<SysRoleMenu> sysRoleMenus);
    
    //根据角色id寻找菜单id
    List<Long> getSysMenuIdsByRoleId(Long roleId);
    
    
}
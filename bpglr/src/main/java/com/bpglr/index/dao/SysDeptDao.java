package com.bpglr.index.dao;

import java.util.List;
import java.util.Map;

import com.bpglr.index.model.SysDept;

public interface SysDeptDao {
    int deleteByPrimaryKey(Long deptId);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
    
    //部门列表 treetabl递归查询
    List<SysDept> getAllDeptList(Map<String, Object> params);
    
    //根据id查询部门信息
    List<SysDept> findDeptByDeptId(Map<String, Object> params);
    
    //删除部门，状态重置为-1
    int updateByDeptId(Long deptId);
    
}
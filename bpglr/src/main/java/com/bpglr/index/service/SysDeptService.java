package com.bpglr.index.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bpglr.index.dao.SysDeptDao;
import com.bpglr.index.model.SysDept;

/**
 * @Title:SysDeptService
 * @Description:部门管理	
 * @Author hjp	
 * @Date 2018年6月13日
 */
@Service
public class SysDeptService {
	
	@Autowired
	private SysDeptDao sysDeptDao;
	
	/**
	 * @Title: getAllDeptList   
	 * @Description: 部门treetable  
	 * @param    
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月13日
	 */
	public List<SysDept> getAllDeptList(Map<String, Object> params) {
		List<SysDept> deptList = sysDeptDao.getAllDeptList(params);
		return deptList;
	}
	
	/**
	 * @Title: selectDepteTree   
	 * @Description: 部门树加载 递归  
	 * @param @return   
	 * @return R    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月13日
	 */
	public List<SysDept> selectDepteTree(Map<String, Object> params) {
		List<SysDept> deptList = sysDeptDao.getAllDeptList(params);
		return deptList;
	}
	
	/**
	 * @Title: save   
	 * @Description:  保存部门 
	 * @param @param sysDept   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月13日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void save(SysDept sysDept) {
		sysDeptDao.insert(sysDept);
	}
	
	/**
	 * @Title: selectDepteTree   
	 * @Description: 根据部门id查询部门信息 
	 * @param @return   
	 * @return R    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月13日
	 */
	public List<SysDept> findDeptByDeptId(Map<String, Object> params) {
		List<SysDept> deptList = sysDeptDao.findDeptByDeptId(params);
		return deptList;
	}
	
	/**
	 * @Title: update   
	 * @Description:  修改部门 
	 * @param @param sysDept   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月13日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void update(SysDept sysDept) {
		sysDeptDao.updateByPrimaryKeySelective(sysDept);
	}
	
	/**
	 * @Title: delete   
	 * @Description: 删除部门 状态重置为-1  
	 * @param @param deptId   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月14日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void delete(Long deptId) {
		sysDeptDao.updateByDeptId(deptId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	


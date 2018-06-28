package com.bpglr.index.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bpglr.index.dao.SysMenuDao;
import com.bpglr.index.model.SysMenu;
import com.bpglr.utils.Constant;

/**
 * @Title:SysMenuService
 * @Description:菜单管理	
 * @Author hjp	
 * @Date 2018年6月7日
 */
@Service
public class SysMenuService {
	
	@Autowired
	private SysMenuDao sysMenuDao;

	/**
	 * @Title: queryListParentId   
	 * @Description:   根据根菜单提取用户子菜单
	 * @param @param parentId 父菜单ID
	 * @param @param menuIdList 用户菜单ID
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	public List<SysMenu> querysysMenusList(Long parentId, List<Long> menuIds) {
		List<SysMenu> sysMenus = queryListParentId(parentId);
		if (menuIds == null) {
			return sysMenus;
		}
		
		List<SysMenu> userSysMenus = new ArrayList<>();
		for (SysMenu menu : sysMenus) {
			if (menuIds.contains(menu.getMenuId())) {
				userSysMenus.add(menu);
			}
		}
		return userSysMenus;
		
	};

	
	/**
	 * @Title: queryListParentId   
	 * @Description:   根据父菜单，查询子菜单
	 * @param @param parentId
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	public List<SysMenu> queryListParentId(Long parentId) {
		return sysMenuDao.queryListParentId(parentId);
	};
	
	
	/**
	 * @Title: queryNotButtonList   
	 * @Description:   获取所有的菜单列表
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	public List<SysMenu> findAllMenu() {
		List<SysMenu> menus = sysMenuDao.findAllMenu();
		return menus ;
	}
	/**
	 * @Title: findUserMenuList   
	 * @Description:   获取用户菜单列表
	 * @param @param userId
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	public List<SysMenu> findUserMenuList(Long userId) {
		
		List<Long> menuIds = queryAllMenuId(userId);
			
		return getAllMenuList(menuIds);
	};

	/**
	 * @Title: delete   
	 * @Description:  删除菜单 
	 * @param @param menuId   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void delete(Long menuId) {
		sysMenuDao.deleteByPrimaryKey(menuId);
	};
	
	/**
	 * @Title: queryAllMenuId   
	 * @Description: 查询用户所有菜单id   
	 * @param @param userId
	 * @param @return   
	 * @return List<Long>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	public List<Long> queryAllMenuId(Long userId) {
		return sysMenuDao.queryAllMenuId(userId);
	}
	
	/**
	 * @Title: getAllMenuList   
	 * @Description: 获得用户所属菜单列表  
	 * @param @param menuIds
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	private List<SysMenu> getAllMenuList(List<Long> menuIds) {
		
		//查询根菜单列表
		List<SysMenu> sysMenus = querysysMenusList(0L, menuIds);
		
		List<SysMenu> menuTreeList = getMenuTreeList(sysMenus,menuIds);
		return menuTreeList;
	}
	
	/**
	 * @Title: getMenuTreeList   
	 * @Description:   递归获得子菜单
	 * @param @param menuList
	 * @param @param menuIds
	 * @param @return   
	 * @return List<SysMenu>    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月7日
	 */
	private List<SysMenu> getMenuTreeList(List<SysMenu> menuList, List<Long> menuIds) {
		List<SysMenu> subMenuList = new ArrayList<SysMenu>();
		
		for (SysMenu sysMenu : menuList) {
			//获得目录
			if (sysMenu.getType() == Constant.MenuType.CATALOG.getValue()) {
				sysMenu.setList(getMenuTreeList(querysysMenusList(sysMenu.getMenuId(), menuIds), menuIds));
			}
			subMenuList.add(sysMenu);
		}
		
		return subMenuList;
	}
	
	/**
	 * @Title: selectById   
	 * @Description:  根据id查找菜单 
	 * @param @param menuId
	 * @param @return   
	 * @return SysMenu    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月26日
	 */
	public SysMenu selectById(Long menuId) {
		return sysMenuDao.selectByPrimaryKey(menuId);
	}
	
	/**
	 * @Title: insert   
	 * @Description: 保存菜单  
	 * @param @param sysMenu   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月26日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void insert(SysMenu sysMenu) {
		sysMenuDao.insertSelective(sysMenu);
	}
	
	/**
	 * @Title: update   
	 * @Description: 更新菜单  
	 * @param @param sysMenu   
	 * @return void    
	 * @throws   
	 * @Author hjp
	 * @Date 2018年6月26日
	 */
	@Transactional(rollbackFor = Exception.class)
	public void update(SysMenu sysMenu) {
		sysMenuDao.updateByPrimaryKeySelective(sysMenu);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

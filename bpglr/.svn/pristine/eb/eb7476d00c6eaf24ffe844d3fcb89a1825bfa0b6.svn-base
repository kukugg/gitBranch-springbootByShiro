package com.bpglr.test.service;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bpglr.test.dao.MytestDao;
import com.bpglr.test.model.Mytest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * @Title:MytestService
 * @Description: 测试类逻辑实现类	
 * @Author hjp	
 * @Date 2018年5月30日
 */

@Service
@Transactional
public class MytestService {
	
	

	@Autowired
	private MytestDao mytestDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(MytestService.class);
	
	public PageInfo<Mytest> findAllUser(Map<String, Object> params) {
		
		
		int pageNum = 1;
		int pageSize = 10;
		if (params.get("pageNum") != null) {
			pageNum = Integer.parseInt(params.get("pageNum")+"");
		}
		if (params.get("pageSize") != null) {
			pageSize = Integer.parseInt(params.get("pageSize")+"");
		}
		PageHelper.startPage(pageNum, pageSize);
		List<Mytest> resultList = null;
		try {
			 resultList = mytestDao.findAllList(params);
		} catch (Exception e) {
			LOGGER.error("查询出错：",e);
		}
		PageInfo<Mytest> result = new PageInfo<Mytest>(resultList);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

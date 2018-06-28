package com.bpglr.test.dao;

import java.util.List;
import java.util.Map;


import com.bpglr.test.model.Mytest;

public interface MytestDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(Mytest record);

    int insertSelective(Mytest record);

    Mytest selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Mytest record);

    int updateByPrimaryKey(Mytest record);
    
    //测试类增加 查询分页
    List<Mytest> findAllList(Map<String, Object> params);
}
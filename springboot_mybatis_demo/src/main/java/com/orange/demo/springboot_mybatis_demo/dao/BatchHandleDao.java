package com.orange.demo.springboot_mybatis_demo.dao;

import com.orange.demo.springboot_mybatis_demo.model.BatchData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BatchHandleDao {
    /**
     * 根据批次删除
     * @param map 批次号+类型
     * */
    int deleteBatch(HashMap<String, Object> map);

    /**
     * 根据批次查询
     * */
    List<BatchData> getBatchByBatch(@Param("batch") String batch, @Param("type") Integer type);
}

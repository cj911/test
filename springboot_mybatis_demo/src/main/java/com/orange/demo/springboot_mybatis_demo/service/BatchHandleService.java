package com.orange.demo.springboot_mybatis_demo.service;



import com.orange.demo.springboot_mybatis_demo.model.BatchData;

import java.util.List;

public interface BatchHandleService {

    /**
     * 根据批次删除
     * @param type 类型
     * @param batch 批次号
     * */
    boolean deleteBatch(String batch, Integer type);

    /**
     * 根据批次查询
     * @param type 类型
     * @param batch 批次
     * */
    List<BatchData> findBatchByBatch(String batch, Integer type);
}


package com.orange.demo.springboot_mybatis_demo.service;

import com.orange.demo.springboot_mybatis_demo.dao.BatchHandleDao;
import com.orange.demo.springboot_mybatis_demo.model.BatchData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BatchHandleServiceImpl implements BatchHandleService {
    @Autowired
    private BatchHandleDao batchHandleDao;

    @Override
    public boolean deleteBatch(String batch, Integer type) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("batch",batch);
        map.put("type",type);
        int i = batchHandleDao.deleteBatch(map);
        return i != 0;
    }

    @Override
    public List<BatchData> findBatchByBatch(String batch, Integer type) {
        List<BatchData> dataList = batchHandleDao.getBatchByBatch(batch, type);
        if (dataList != null && !dataList.isEmpty()){
            return dataList;
        }
        return null;
    }
}

package com.shuyun.bize.impl;

import com.shuyun.bize.ITableModelBize;
import com.shuyun.dao.TableModelMapper;
import com.shuyun.po.TableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iTableModelBize")
public class ITableModelBizeImpl implements ITableModelBize {
    @Autowired
    private TableModelMapper tableModelMapper;
    
    public int delete(String id) {
        return tableModelMapper.delete(id);
    }

    
    public int insert(TableModel record) {
        return tableModelMapper.insert(record);
    }

    
    public TableModel findById(String id) {
        return tableModelMapper.findById(id);
    }

    
    public int update(TableModel record) {
        return tableModelMapper.update(record);
    }
}

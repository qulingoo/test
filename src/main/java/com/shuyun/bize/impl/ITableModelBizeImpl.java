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
    @Override
    public int delete(String id) {
        return tableModelMapper.delete(id);
    }

    @Override
    public int insert(TableModel record) {
        return tableModelMapper.insert(record);
    }

    @Override
    public TableModel findById(String id) {
        return tableModelMapper.findById(id);
    }

    @Override
    public int update(TableModel record) {
        return tableModelMapper.update(record);
    }
}

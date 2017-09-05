package com.qlk.bize.impl;

import com.qlk.bize.ITableModelBize;
import com.qlk.dao.TableModelMapper;
import com.qlk.po.TableModel;
import org.springframework.beans.factory.annotation.Autowired;

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

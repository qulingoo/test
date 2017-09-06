package com.shuyun.bize;

import com.shuyun.po.TableModel;

public interface ITableModelBize {
    int delete(String id);

    int insert(TableModel record);

    TableModel findById(String id);

    int update(TableModel record);

}
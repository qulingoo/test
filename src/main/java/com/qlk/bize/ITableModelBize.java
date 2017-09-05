package com.qlk.bize;

import com.qlk.po.TableModel;

public interface ITableModelBize {
    int delete(String id);

    int insert(TableModel record);

    TableModel findById(String id);

    int update(TableModel record);

}
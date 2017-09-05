package com.qlk.dao;

import com.qlk.po.TableModel;

public interface TableModelMapper {
    int delete(String id);

    int insert(TableModel record);

    TableModel findById(String id);

    int update(TableModel record);

}
package com.shuyun.dao;

import com.shuyun.po.TableModel;
import org.springframework.stereotype.Component;

@Component
public interface TableModelMapper {
    int delete(String id);

    int insert(TableModel record);

    TableModel findById(String id);

    int update(TableModel record);

}
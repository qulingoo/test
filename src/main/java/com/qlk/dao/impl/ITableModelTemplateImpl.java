package com.qlk.dao.impl;

import com.qlk.dao.ITableModelDao;
import com.qlk.po.TableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ITableModelTemplateImpl implements ITableModelDao {
    @Autowired
    private DataSource dataSource;

    @Override
    public int insert(TableModel tableModel) {
        String query = "insert into TableModel (id, tableNameEng, role) values (?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Object[] args = new Object[] {tableModel.getId(), tableModel.getTableNameEng(), tableModel.getTableNameChn()};

        int out = jdbcTemplate.update(query, args);

        if(out !=0){
            System.out.println("Employee saved with id="+tableModel.getId());
        }else {
            System.out.println("Employee save failed with id="+tableModel.getId());
        }
        return 0;
    }

    @Override
    public int update(TableModel tableModel) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public TableModel findById(String id) {
        return null;
    }

    @Override
    public TableModel findById(int id) {
        return null;
    }
}

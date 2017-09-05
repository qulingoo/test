package com.qlk.dao.model.impl;

import com.qlk.dao.model.ITableModelDao;
import com.qlk.po.TableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component("iTableModelDao")
public class ITableModelTemplateDaoImpl implements ITableModelDao {
    @Autowired
    private DataSource dataSource;

    @Override
    public int insert(TableModel tableModel) {
        String insert = "insert into TABLE_MODEL (ID,TABLE_NAME_CHN,TABLE_NAME_ENG, DESCRIBES) values (?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Object[] args = new Object[]{tableModel.getId(), tableModel.getTableNameChn(), tableModel.getTableNameEng(), tableModel.getDescribes()};

        int out = jdbcTemplate.update(insert, args);
        return out;
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
    public TableModel findById(String id) {
        return null;
    }

}

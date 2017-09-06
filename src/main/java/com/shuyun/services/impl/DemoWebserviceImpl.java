package com.shuyun.services.impl;

import com.shuyun.dao.TableModelMapper;
import com.shuyun.po.TableModel;
import com.shuyun.services.DemoWebservice;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService(endpointInterface = "com.shuyun.services.DemoWebservice")
public class DemoWebserviceImpl implements DemoWebservice {
    @Autowired
    private TableModelMapper tableModelMapper;

    @Override
    public int insert(TableModel tableModel) {
        return tableModelMapper.insert(tableModel);
    }

    @Override
    public String queryBaseTxById(String id) {
        return null;
    }
}

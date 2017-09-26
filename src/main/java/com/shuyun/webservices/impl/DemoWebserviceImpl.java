package com.shuyun.webservices.impl;

import com.shuyun.dao.TableModelMapper;
import com.shuyun.po.TableModel;
import com.shuyun.webservices.DemoWebservice;

import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService(endpointInterface = "com.shuyun.services.DemoWebservice")
public class DemoWebserviceImpl implements DemoWebservice {
    @Autowired
    private TableModelMapper tableModelMapper;

    
    public int insert(TableModel tableModel) {
        return tableModelMapper.insert(tableModel);
    }

    
    public String queryBaseTxById(String id) {
        return null;
    }
}

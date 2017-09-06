package com.shuyun.services;

import com.shuyun.po.TableModel;

import javax.jws.WebService;

@WebService
public interface DemoWebservice {

    public int insert(TableModel tableModel);

    public String queryBaseTxById(String id);
}
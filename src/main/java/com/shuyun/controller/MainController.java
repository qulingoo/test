package com.shuyun.controller;

import com.shuyun.bize.ITableModelBize;
import com.shuyun.po.TableModel;
import com.shuyun.webservices.DemoWebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class MainController {
    @Autowired
   private  ITableModelBize iTableModelBize;
    @Autowired
    @Qualifier("demoClient")
    private DemoWebservice demo;
    @ResponseBody
    @RequestMapping("/main/hello")
    public String main() {
        TableModel tableModel = new TableModel();
        tableModel.setId(UUID.randomUUID().toString());
        tableModel.setTableNameChn("测试");
        tableModel.setTableNameEng("test");
        tableModel.setDescribes("123123123");
        return iTableModelBize.insert(tableModel)+"";
    }
    @ResponseBody
    @RequestMapping("/main/hello1")
    public String hello1() {
        TableModel tableModel = new TableModel();
        tableModel.setId(UUID.randomUUID().toString());
        tableModel.setTableNameChn("测试");
        tableModel.setTableNameEng("test");
        tableModel.setDescribes("123123123");
        return demo.insert(tableModel)+"";
    }

}

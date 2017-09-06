package com.shuyun.test;


import com.shuyun.po.TableModel;
import com.shuyun.webservices.DemoWebservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class CxfTest {
    public static void  main(String args[]) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8080/test/services/demo?wsdl");
        QName SERVICE_NAME = new QName("http://impl.services.shuyun.com/", "DemoWebserviceImplService");
        Service service = Service.create(wsdlURL, SERVICE_NAME);
        DemoWebservice client = service.getPort(DemoWebservice.class);
        TableModel tableModel = new TableModel();
        tableModel.setId(UUID.randomUUID().toString());
        tableModel.setTableNameChn("测试");
        tableModel.setTableNameEng("test");
        tableModel.setDescribes("123123123");
        int result = client.insert(tableModel);
        System.out.println(result);
    }

}

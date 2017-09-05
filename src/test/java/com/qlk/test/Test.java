package com.qlk.test;

import com.qlk.dao.model.ITableModelDao;
import com.qlk.po.TableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class Test {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml", "spring-mvc.xml"});
        ITableModelDao iTableModelDao = (ITableModelDao) context.getBean("iTableModelDao");
        TableModel model = new TableModel();
        model.setId(UUID.randomUUID().toString());
        model.setDescribes("123");
        model.setTableNameChn("abc");
        model.setTableNameEng("abc");
        iTableModelDao.insert(model);
    }

}

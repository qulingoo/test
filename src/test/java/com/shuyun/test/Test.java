package com.shuyun.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml", "spring-mvc.xml"});
        
    }

}

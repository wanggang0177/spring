package com.test.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.aop.service.Service;


public class TestAop 
{
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringAop.xml");
        Service service = (Service) context.getBean("service");
        service.add("test add 。。。");
        service.del("test del 。。。");
	}
}

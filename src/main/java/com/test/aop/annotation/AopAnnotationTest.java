package com.test.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopAnnotationTest 
{
	public static void main(String[] args) 
	{
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringAopAnnotation.xml");
        MyService service = (MyService) context.getBean("myService");
        service.service1("test service1 。。。");
        
        
        service.service2("test service2 。。。");
	
	}
}

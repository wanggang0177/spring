package com.test.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIocAnnotation 
{

	public static void main(String[] args) 
	{
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringIocAnnotation.xml");
        Stu obj = (Stu) context.getBean("stu");
        System.out.println(obj.toString());
	}
}

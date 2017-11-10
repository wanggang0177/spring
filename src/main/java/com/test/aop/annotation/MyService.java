package com.test.aop.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyService 
{

	public void service1(String s1)
	{
		System.out.println("service1  start ..." + s1);
	}
	
	public void service2(String s1)
	{
		System.out.println("service2  start ..." + s1);
	}
	
	public void service3(String s1)
	{
		System.out.println("service3  start ..." + s1);
	}
}

package com.test.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //定义一个切面  实则切面也是一个bean,所以切面类也需要@Component
public class MyLog 
{

	@Pointcut("execution(* com.test.aop.annotation.MyService.*(..))")
	private void pointCut()
	{
		
	}
	
	
	@Before(value = "pointCut() && args(name)")
	public void beforeMethod(String... name)
	{
		System.out.println("beforeMethod...." + name);
	}
	
	@After(value = "pointCut()")
	public void afterMethod()
	{
		System.out.println("afterMethod....");
	}
}

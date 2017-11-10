package com.test.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	// 前置通知
	public void startTransaction(JoinPoint joinPoint) 
	{
		System.out.println("begin transaction " + Arrays.asList(joinPoint.getArgs()));
	}

	// 后置通知
	public void commitTransaction(JoinPoint joinPoint) 
	{
		System.out.println("commit transaction " + Arrays.asList(joinPoint.getArgs()));
	}

	// 环绕通知
	public void around(ProceedingJoinPoint joinPoint) throws Throwable 
	{
		System.out.println("begin transaction" + Arrays.asList(joinPoint.getArgs()));

		joinPoint.proceed();

		System.out.println("commit transaction");
	}
}

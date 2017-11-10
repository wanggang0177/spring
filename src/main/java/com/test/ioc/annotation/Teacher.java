package com.test.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher 
{
	@Value("teacher")
	String name;
	@Value("4")
	int classNum;
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", classNum=" + classNum + "]";
	}
}

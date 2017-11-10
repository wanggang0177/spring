package com.test.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Stu 
{
	
	public Stu()
	{
		
	}
	
	@Value("111")
	int age;
	@Value("wangg")
	String name;
	@Autowired //默认按照byType匹配的方式进行注入   @Autowired可以结合 @Qualifier("beanName")来使用,则可以达到byName的效果
	Teacher teacher;
	
	@Override
	public String toString() 
	{
		return "Stu [age=" + age + ", name=" + name + "\t" +teacher.toString()+"]";
	}
}

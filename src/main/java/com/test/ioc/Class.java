package com.test.ioc;

public class Class {

	//班级名
	String className;
	//几年级
	int classNum;
	
	public Class()
	{
		
	}
	
	public Class(String className,int classNum)
	{
		this.className = className;
		this.classNum = classNum;
	}

	@Override
	public String toString() 
	{
		return "Class [className=" + className + ", classNum=" + classNum + "]";
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
}

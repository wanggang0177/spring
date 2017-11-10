package com.test.ioc;

public class Teacher {

	String name;
	int num;
	Class classObj;
	
	public Teacher()
	{
		
	}
	
	public Teacher(String name,int num,Class classObj)
	{
		this.name = name;
		this.num = num;
		this.classObj = classObj;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", num=" + num + ", classObj=" + classObj.toString() + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Class getClassObj() {
		return classObj;
	}
	public void setClassObj(Class classObj) {
		this.classObj = classObj;
	}
	
}

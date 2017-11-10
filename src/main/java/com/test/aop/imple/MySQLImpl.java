package com.test.aop.imple;

import com.test.aop.dao.Dao;

public class MySQLImpl implements Dao
{

	public void add(String str) 
	{
		System.out.println("【MySQLImpl：】 加入" + str);
	}

	public void del(String str) 
	{
		System.out.println("【MySQLImpl：】 删除" + str);
	}

}

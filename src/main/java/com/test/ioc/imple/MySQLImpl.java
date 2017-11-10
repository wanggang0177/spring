package com.test.ioc.imple;

import com.test.ioc.dao.Dao;

public class MySQLImpl implements Dao
{

	public void add(String str) 
	{
		System.out.println("【MySQLImpl：】 加入" + str);
	}

}

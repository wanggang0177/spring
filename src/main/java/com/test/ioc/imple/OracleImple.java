package com.test.ioc.imple;

import com.test.ioc.dao.Dao;

public class OracleImple implements Dao
{

	public void add(String str) 
	{
		System.out.println("【OracleImple：】 加入" + str);
	}

}

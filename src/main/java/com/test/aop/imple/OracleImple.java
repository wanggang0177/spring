package com.test.aop.imple;

import com.test.aop.dao.Dao;

public class OracleImple implements Dao
{

	public void add(String str) 
	{
		System.out.println("【OracleImple：】 加入" + str);
	}

	public void del(String str) 
	{
		System.out.println("【OracleImple：】 删除" + str);
		
	}

}

package com.test.aop.service;

import com.test.aop.dao.Dao;

public class Service 
{
	Dao dao;
	public void add(String str) 
	{
		dao.add(str);
	}
	
	public void del(String str) 
	{
		dao.del(str);
	}
	
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}

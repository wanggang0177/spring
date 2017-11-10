package com.test.ioc.service;

import com.test.ioc.dao.Dao;

public class Service 
{
	Dao dao;
	public void add(String str) 
	{
		dao.add(str);
	}
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}

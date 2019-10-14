package com.woniu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;

public class DeptDAOImpl extends HibernateDaoSupport implements IDeptDAO {
	public List<Dept> findAll() {
		return (List<Dept>) this.getHibernateTemplate().find("from Dept");
	}

	public void save(Dept dept) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dept);
	}

}

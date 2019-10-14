package com.woniu.service.impl;

import java.util.List;


import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;

public class DeptServiceImpl implements IDeptService {
	private IDeptDAO deptDAO;
	
	
	public void setDeptDAO(IDeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}


	public List<Dept> getAllDepts() {
		// TODO Auto-generated method stub
		return deptDAO.findAll();
	}


	public void addDept(Dept dept) {
		// TODO Auto-generated method stub
		deptDAO.save(dept);
	}

}

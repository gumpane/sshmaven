package com.woniu.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;

public class DeptAction extends ActionSupport {
	private IDeptService deptService;
	private List<Dept> depts;
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public String list(){
		depts = deptService.getAllDepts();
		return SUCCESS;
	}
	public String save(){
		deptService.addDept(dept);
		return SUCCESS;
	}
}

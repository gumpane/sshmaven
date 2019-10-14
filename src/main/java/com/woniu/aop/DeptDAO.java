package com.woniu.aop;

import org.springframework.stereotype.Repository;

@Repository("deptDAO")
public class DeptDAO {
	public void delete(){
		System.out.println("in deptDAO del...");
	}
}

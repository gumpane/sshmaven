package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {
	List<Dept> getAllDepts();

	void addDept(Dept dept);
}

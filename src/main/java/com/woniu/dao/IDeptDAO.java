package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDAO {
	List<Dept> findAll();

	void save(Dept dept);
}

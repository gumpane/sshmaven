package com.woniu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.aop.DeptDAO;
import com.woniu.aop.DeptDAO;
import com.woniu.aop.IUserDAO;

import junit.framework.TestCase;

public class TestAOP extends TestCase {
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDAO ud = (IUserDAO) ac.getBean("userDAOProxy");
		ud.save();
	}
	
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptDAO ud = (DeptDAO) ac.getBean("deptDAO");
		ud.delete();
	}
}

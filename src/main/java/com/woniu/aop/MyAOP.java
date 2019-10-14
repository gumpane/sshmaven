package com.woniu.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAOP implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("in ����֪ͨ...");
		//����Ŀ�귽��
		Object obj = invocation.proceed();
		System.out.println("out ����֪ͨ...");
		return obj;
	}

}

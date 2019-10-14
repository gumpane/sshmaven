package com.woniu.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAOP implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("in 环绕通知...");
		//调用目标方法
		Object obj = invocation.proceed();
		System.out.println("out 环绕通知...");
		return obj;
	}

}

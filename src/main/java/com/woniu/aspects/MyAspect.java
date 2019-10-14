package com.woniu.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAspect {
	@Pointcut("execution(* com.woniu.aop.*.*(..))")
	public void mycut(){}
	@Before("mycut()")
	public void before1(JoinPoint joinPoint){
		System.out.println("in 注解 前置通知");
	}
	@Around("mycut()")
	public Object around1(ProceedingJoinPoint joinPoint ){
		System.out.println("in 环绕通知");
		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("out 环绕通知");
		return obj;
	}
}

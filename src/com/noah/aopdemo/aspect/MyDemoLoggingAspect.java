package com.noah.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	//this is where we add all of our related advices for logging
	
	//let's start with an @Before advice
	
//	@Before("execution(* add*(com.noah.aopdemo.Account, ..))")
	//如果要只跑某個DAO裡的方法 需打出package + class name + method name
	//如果要跑add開頭則使用 add*()
	
	@Pointcut("execution(* com.noah.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}
	//create pointcut for getter
	@Pointcut("execution(* com.noah.aopdemo.dao.*.get*(..))")
	private void getter() {
	}
	//create pointcut for setter
	@Pointcut("execution(* com.noah.aopdemo.dao.*.set*(..))")
	private void setter() {
	}
	//create pointcut include package .. exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void excludeGetterAndSetter() {
	}
	@Before("excludeGetterAndSetter()")//any method in package
	public void beforeAddAccountAdvice() {
		System.out.println("執行 @Before advice on addAccount");
	}
	@Before("excludeGetterAndSetter()")
	public void before() {
		System.out.println("執行 API Analytics");
	}
}

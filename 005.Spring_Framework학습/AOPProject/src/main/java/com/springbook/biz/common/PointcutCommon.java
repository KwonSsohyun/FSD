package com.springbook.biz.common;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutCommon {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}

	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	
}

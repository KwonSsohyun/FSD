package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
//	public void getPointcut(){}
	
//	@AfterReturning(pointcut="getPointcut()", returning="returnObj")
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
		}
		
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : " + returnObj.toString());
	}
	
}

package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class UserController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인  화면으로 이동");
		
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
		

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("로그인  인증 처리");
		
		UserVO user = userDAO.getUser(vo);
		
		if(userDAO.getUser(vo) != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		else return "login.jsp";
				
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		
		// 1. 브라우저와 연결된 세션 객체를 강제 종료한다.
//		HttpSession session = request.getSession();
		session.invalidate();
		return "login.jsp";
		

	}

}

package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService; // = new UserServiceImpl();
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인  화면으로 이동");
		
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
		

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo , HttpSession session) {
		System.out.println("로그인  인증 처리");
		
//		if(vo.getId() == null || vo.getId().equals("")) {
//			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
//		}
		
		UserVO user = userService.getUser(vo);
		
		if(user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do?btnCnt=1";
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

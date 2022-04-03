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
	private UserService userService;
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("test1234");
		return "login.jsp";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(UserVO vo, HttpSession session) {
		System.out.println("로그인 인증 처리...");

		if (userService.getUser(vo) != null) {
			session.setAttribute("userId", userService.getUser(vo).getId());
			session.setAttribute("userName", userService.getUser(vo).getName());
			return "getBoardList.do";
		} else {
			return "login.jsp?error=1";
		}
	}

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
}

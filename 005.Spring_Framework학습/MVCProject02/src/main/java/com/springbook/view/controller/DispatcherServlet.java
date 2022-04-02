package com.springbook.view.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import com.springbook.view.user.LoginController;


public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	public DispatcherServlet() {
		System.out.println("객체 생성");
	}
	
	
	public void init() throws ServletException {
		System.out.println("init() 호출");
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1. 클라이언트의 요청 path 정보를 추출한다.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		
		// 2. HandlerMapping 을 통해 path에 해당하는 Controller를 검색한다.
		Controller ctrl = handlerMapping.getController(path); // new LoginController()
		
		
		// 3. 검색된 Controller를 실행한다.
		String viewName = ctrl.handleRequest(request, response);
		
		
		// 4. ViewResolver를 통해 viewName에 해당하는 화면을 검색한다.
		String view = null;
		if(!viewName.contains(".do")) { 
			view = viewResolver.getView(viewName);
			
		} else {
			view = viewName;
		}
		
		
		// 5. 검색된 화면으로 이동한다.
		response.sendRedirect(view);
		
		
		
	}
	
	
}

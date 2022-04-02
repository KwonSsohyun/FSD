package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    	System.out.println("LoginCheckFilter 초기화...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
    	System.out.println("LoginCheckFilter 수행...");
		/*
		 * 1. getSession(), getSession(true) 
		 * - HttpSession이 존재하면 현재 HttpSession을 반환하고
		 * 존재하지 않으면 새로이 세션을 생성함.
		 * 2. getSession(false) 
		 * - HttpSession이 존재하면 현재 HttpSession을 반환하고
		 * 존재하지 않으면 새로이 생성하지 않고 그냥 null을 반환함.
		 */
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(false);

        boolean login = false;
        if (session != null) {
            if (!session.getAttribute("MEMBER").equals("")) {
                login = true;
            }
        }
        if (login) {
            chain.doFilter(request, response);
        } else {
//RequestDispatcher : 현재 request에 담고 있는 정보를 저장하고 있다가 
//그 다음페이지, 다음페이지에서도 해당 정보를 볼 수 있게 저장하는 기능을한다.
            RequestDispatcher dispatcher = request.getRequestDispatcher("/18_01_loginForm.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    public void destroy() {
    }
}
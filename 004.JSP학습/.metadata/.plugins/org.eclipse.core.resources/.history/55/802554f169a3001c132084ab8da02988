package com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter {
	/* protected FilterConfig filterConfig; */
	
	//필터 객체가 생성될 때 호출되는 메소드이다. 
	//필터 객체는 웹 애플리케이션 서비스가 올라가면서(웹서버가 시작될 때 )
	//한번만 되어 생성되어 한번만 호출되며, init( )메소드에는 주로 초기화 기능을 구현한다.
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter01 초기화...");
		//this.filterConfig = filterConfig;
	}

	//doFilter( ) 메소드는 필터링 설정한 서블릿을 실행할 때마다 호출되는 메소드로서 
	//실제 필터링 기능을 구현하는 메소드 임.
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)	throws IOException, ServletException {
		System.out.println("Filter01.jsp 수행...");
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		request.setAttribute("name", "김고은");

		if (name == null || name.equals("")) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			String message = "입력된 name 값은 null입니다.";
			writer.println(message);
			return;
		}
		//1. request 파라미터를 이용해 요청의 필터 작업 수행
        //2. 체인의 다음 필터 처리
		//3. response를 이용해 응답의 필터링 작업 
		filterChain.doFilter(request, response);
	}

	//필터 객체가 삭제 될 때 호출되는 메소드임. 
	//주로 자원 해제 기능을 구현한다.
	@Override
	public void destroy() {
		System.out.println("Filter01 해제...");
		//this.filterConfig = null;
	}
}
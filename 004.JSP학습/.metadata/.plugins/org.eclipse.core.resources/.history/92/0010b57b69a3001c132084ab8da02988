package com.filter;

import javax.servlet.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LogFileFilter implements Filter  {
	
	PrintWriter writer;

	public void init(FilterConfig filterConfig) throws ServletException {	
		System.out.println("Filter02_2 초기화...");
		String realpath = "C:\\log\\";
		File f = new File(realpath);
		if(!f.exists()) {
			f.mkdirs();
		}
		String filename = filterConfig.getInitParameter("filename");
        if(filename==null) throw new ServletException("로그 파일의 이름을 찾을 수 없습니다.");
        try {
            writer = new PrintWriter(new FileWriter(realpath+filename, true), true);
        } catch (IOException e) {
            throw new ServletException("로그 파일을 열 수 없습니다.");
        }
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)	throws IOException, ServletException {			
		System.out.println("Filter02_2 수행...");
		writer.printf("현재일시 : %s \n",  getCurrentTime());
		String clientAddr = request.getRemoteAddr();
		writer.printf("클라이언트 주소 : %s \n", clientAddr);
       
        filterChain.doFilter(request, response);    

        String contentType = response.getContentType();
        writer.printf("문서의 콘텐츠 유형 : %s \n", contentType);
        writer.println("----------------------------------------------");
        destroy( );
	}

	public void destroy( ){
		System.out.println("Filter02_2 해제..");
		writer.println("destroy( )메소드 호출. 강제 해제");
		writer.close();
	}

	private String getCurrentTime() {
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return formatter.format(calendar.getTime());
	}
}

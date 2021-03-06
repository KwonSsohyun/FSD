package com.hi;

import java.util.Scanner;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Ex03 {

	public static void main(String[] args) {
		String sql = "insert into dept (deptno, dname, loc) values (";
		
		Scanner sc = new Scanner(System.in);
		String input= null;
		
		// 3번의 입력 (만약 여러개 하고 싶으면 해당 java → 몇번이고 run 시켜서 입력하면됨)
		System.out.println("deptno 입력 >");
		input = sc.nextLine();
		sql = sql + input +",'";
		
		System.out.println("dname 입력 >");
		input = sc.nextLine();
		sql = sql + input +"','";
		
		System.out.println("loc 입력 >");
		input = sc.nextLine();
		sql = sql + input +"')";
		
		// 쿼리문장 잘 입력되나 코드 확인
		// System.out.println(sql); 
		// ▶ insert into dept (deptno, dname, loc) values (70,'dfsd','sdf')
		//   쿼리문장의 문자열은 '' 으로 감싸야한다.
		
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		
		try {
			DriverManager.deregisterDriver(driver);
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			System.out.println("성공");
			// ▶▶ 그럼 이제 데이터베이스 → "ex01.sql" 파일로 가서
			//    ▶ select * from dept; → 해당문장 실행해보면 잘 적용되는것을 볼 수 있다.
			//                            해당 문장 드래그 마우스 우클릭 → "Execute Selected Text" 클릭
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 연결을 하고 쓰는 부분 IO가 일어나는 부분만 닫아준다.
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

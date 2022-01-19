package com.hi;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Ex02 {

	public static void main(String[] args) { // 데이터베이스 연동
		// 자바연동
		// String sql = "insert into dept (deptno, dname, loc) values (70, 'HH', 'II')"; // 쿼리문장을 오라클데베에 날리면 된다. // 신규추가
		// String sql = "update dept set dname='한글' where deptno=70"; // 기존문장 수정
		String sql = "delete from dept where deptno=70"; // 기존문장 삭제
		
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		// 드라이버클래스 객체 생성
		OracleDriver driver = new OracleDriver();
		// 데이터 베이스 연결
		Connection conn = null;
		// 쿼리문장 날릴려고
		Statement stmt = null;
		
		try {
			// Oracle 드라이버 등록
			DriverManager.registerDriver(driver);
			// 데이터 베이스 연결
			conn = DriverManager.getConnection(url);
			// System.out.println(conn); // 데이터베이스 연결 확인
			stmt = conn.createStatement(); 
			stmt.executeUpdate(sql); // 만드는건 이거씀! (받고할 필요가 없음)
			// ▶▶ 그럼 이제 데이터베이스 → "ex01.sql" 파일로 가서
			//    ▶ select * from dept; → 해당문장 실행해보면 잘 적용되는것을 볼 수 있다.
			//                            해당 문장 드래그 마우스 우클릭 → "Execute Selected Text" 클릭
			
			System.out.println("완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null){ conn.close(); }
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 	
		
		
		
		
		
	}

}

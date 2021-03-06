package com.hi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;
// https://docs.oracle.com/cd/E11882_01/appdev.112/e13995/oracle/jdbc/OracleDriver.html

public class Ex01 {

	public static void main(String[] args) {
		// 드라이버에 있는 클래스 사용 가능
		String url ="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		String sql = "select * from dept where deptno<50 order by deptno desc"; // 쿼리문장 (조합해서 원하는 내가 원하는것으로 추출할것이냐)
		// String sql = "select * from emp"; // emp 테이블
		oracle.jdbc.driver.OracleDriver driver;
		driver = new OracleDriver();
		Connection conn = null;
		java.sql.Statement stmt = null;
		java.sql.ResultSet rs = null;
					
		try {
			// 쿼리주고 받으니 IO 작업
			java.sql.DriverManager.deregisterDriver(driver);
			conn = DriverManager.getConnection(url);
			
			// System.out.println(conn); // 데이터베이션 커넥션 받아냄 (오라클데이터베이스에 접속함)
			
			stmt = conn.createStatement();
			stmt.executeQuery(sql); // 쿼리문자 날림 // 집합이라 set 구조 // 받아야해서 .executeQuery (select 쓰니)
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { // 가로 레코드 있냐없냐? // 커서이동
				// System.out.println(rs.getObject(1)); // 해당 가로 레코드를 뽑아줌 // 여기서는 0부터 안셈 1부터
				// 그니까 컬럼이 몇개인지 알아야 한다.
				System.out.print(rs.getObject(1) + "\t");
				System.out.print(rs.getObject(2) + "\t");
				System.out.println(rs.getObject(3) + "\t");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null) { rs.close();}
				if(conn!=null) { stmt.close();}
				if(conn!=null) { conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

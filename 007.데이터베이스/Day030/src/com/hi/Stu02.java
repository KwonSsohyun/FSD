package com.hi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Stu02 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		// 확인후 데이터베이스 연동
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.9.0)");
		String input = null;
		
		
		while(true) {
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			input = sc.nextLine();
			
			if(input.equals("0")) break;
			if(input.equals("1")) { // 1. 보기 ------------------------------
				
				System.out.println("-----------------------------------");
				System.out.println("학번\t 이름\t 국어\t 영어\t 수학");
				System.out.println("-----------------------------------");
				String sql = "select * from stu01 order by num asc"; // num가 오름차순으로 출력
				// System.out.println(sql);
				// 쿼리문장 확인 후 데이터베이스 연동
				///////////////////////////////////////////////////////////////////////////
				try {
					DriverManager.registerDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();  // 여기까지는 1.보기 / 2.입력 공통
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						System.out.print(rs.getObject(1) + "\t");
						System.out.print(rs.getObject(2) + "\t");
						System.out.print(rs.getObject(3) + "\t");
						System.out.print(rs.getObject(4) + "\t");
						System.out.println(rs.getObject(5));
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						// 필요할때만 열어서 사용 (했다 끊었다 했다 끊었다) 
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				System.out.println("-----------------------------------");
				
				
				
			} else if(input.equals("2")) { // 2. 입력  -----------------------
				System.out.println("학번 > ");
				String num = sc.nextLine();
				
				System.out.println("이름 > ");
				String name = sc.nextLine();
				
				System.out.println("국어 > ");
				String kor = sc.nextLine();
				
				System.out.println("영어 > ");
				String eng = sc.nextLine();
				
				System.out.println("수학 > ");
				String math = sc.nextLine();
				
				String sql = "insert into stu01 values ("+num+", '"+name+"',"+ kor +","+ eng +","+ math +")";
				
				// System.out.println(sql);
				// 쿼리문장 확인 후 데이터베이스 연동
				///////////////////////////////////////////////////////////////////////////
				try {
					DriverManager.registerDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement(); // 여기까지는 1.보기 / 2.입력 공통
					stmt.executeUpdate(sql); // 입력이니까 익스큐트업데이트
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			
		}
		
	}

}

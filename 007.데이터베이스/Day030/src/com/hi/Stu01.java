package com.hi;

import java.util.Scanner;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Stu01 {

	public static void main(String[] args) {
		
		// 학생성적관리프로그램 (ver 0.9.0)
		// 1.보기(day29→Ex01)  2.입력(day30→Ex03)  3.수정  4.삭제  0.종료  >  
		// 1.보기  2.입력  3.수정  4.삭제  0.종료  >  
		
		String sql;
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scan = new Scanner(System.in);
		int su;
		String data;
		
		while(true) {
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			su = Integer.parseInt(scan.nextLine());
			
			if(su == 0) { break; } // 0. 종료
			if(su == 1) { // 1. 보기
				System.out.println("-----------------------------------");
				System.out.println("학번\t 이름\t 국어\t 영어\t 수학");
				System.out.println("-----------------------------------");
				sql = "select * from stu01";
				try {
					DriverManager.deregisterDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					stmt.executeQuery(sql);
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						System.out.print(rs.getObject(1) + "\t");
						System.out.print(rs.getObject(2) + "\t");
						System.out.print(rs.getObject(3) + "\t");
						System.out.print(rs.getObject(4) + "\t");
						System.out.println(rs.getObject(5));
					}
					
					System.out.println("-----------------------------------");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs!=null) { rs.close();}
						if(stmt!=null) { stmt.close();}
						if(conn!=null) { conn.close();}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				continue;
			} else if(su ==2) { // 2. 입력
				sql = "insert into stu01 values(";
				
				System.out.println("학번 > ");
				data = scan.nextLine();
				sql = sql + data + ",";
				
				System.out.println("이름 > ");
				data = scan.nextLine();
				sql = sql +"'"+ data + "',";
				
				System.out.println("국어 > ");
				data = scan.nextLine();
				sql = sql + data + ",";
				
				System.out.println("영어 > ");
				data = scan.nextLine();
				sql = sql + data + ",";
				
				System.out.println("수학 > ");
				data = scan.nextLine();
				sql = sql + data + ")";
				
				// System.out.println(sql);
				
				try {
					DriverManager.deregisterDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					
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
				
				continue;
			} else if(su ==3) { // 3. 수정
				sql = "update stu01 set ";
				
				System.out.println("학번 > ");
				data = scan.nextLine();
				int suu = Integer.parseInt(data);
				sql = sql + "num = " + data + ",";
				
				System.out.println("이름 > ");
				data = scan.nextLine();
				sql = sql + "name = " + "'" + data + "',";
				
				System.out.println("국어 > ");
				data = scan.nextLine();
				sql = sql + "kor = " +data + ",";
				
				System.out.println("영어 > ");
				data = scan.nextLine();
				sql = sql + "eng = " +data + ",";
				
				System.out.println("수학 > ");
				data = scan.nextLine();
				sql = sql + "math = " + data ;
				
				sql = sql + " where num = " + suu ;
				
				 System.out.println(sql);
				
				try {
					DriverManager.deregisterDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					
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
				
				continue;
				
			} else if(su ==4) { // 4. 삭제
				
				sql = "delete from stu01 where";
				
				System.out.println("삭제할 학번 > ");
				data = scan.nextLine();
				sql = sql + " " + "num" + "=" + data;
				// System.out.println(sql);
				
				try {
					DriverManager.deregisterDriver(driver);
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
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

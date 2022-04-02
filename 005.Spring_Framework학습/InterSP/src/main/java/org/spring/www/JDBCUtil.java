package org.spring.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			String user = "root";
			String pw = "1111";
			
			String url = "jdbc:mariadb://localhost:3306/swork";
			Class.forName("org.mariadb.jdbc.Driver");
			
//		 	String url = "jdbc:mysql://localhost:3306/swork";
//			Class.forName("com.mysql.jdbc.Driver"); 
			
//		 	String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			Class.forName("oracle.jdbc.driver.OracleDriver"); 
        	return DriverManager.getConnection(url, user, pw);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if(stmt !=null) {
				try {
					if(!stmt.isClosed()) stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					stmt = null;
				}
		}
		
		if(conn !=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if(rs !=null) {
			try {
				if(!rs.isClosed()) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		
		if(stmt !=null) {
				try {
					if(!stmt.isClosed()) stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					stmt = null;
				}
		}
		
		if(conn !=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}


}

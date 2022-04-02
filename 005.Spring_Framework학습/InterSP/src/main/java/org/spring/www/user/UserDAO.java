package org.spring.www.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.spring.www.JDBCUtil;
import org.spring.www.UserVO;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = "select * from users where id=? and password=?";
     
    public UserVO login(UserVO vo) {
    	UserVO user = null;
		try {
			System.out.println("===> JDBC로 getUser() 기능 처리");
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();			
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return user;
    }
		
}

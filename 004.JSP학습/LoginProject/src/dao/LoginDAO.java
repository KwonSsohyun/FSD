package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vo.Member;
import static db.JdbcUtil.*;

public class LoginDAO {
	
	private static LoginDAO loginDAO;
	private Connection con;
	
	private LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static LoginDAO getInstance(){
		if(loginDAO == null){
			loginDAO = new LoginDAO();
		}
		return loginDAO;
	}
	
	public void setConnection(Connection con){
		this.con = con;
	}
	
	public Member selectLoginMember(String id, String passwd) {
		// TODO Auto-generated method stub
		Member loginMember = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement("SELECT * FROM member WHERE MEMBER_ID = ? AND MEMBER_PW = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			if(rs.next()){
				loginMember = new Member();
				
				loginMember.setAge(rs.getInt("MEMBER_AGE"));
				loginMember.setEmail(rs.getString("MEMBER_EMAIL"));
				loginMember.setGender(rs.getString("MEMBER_GENDER"));
				loginMember.setId(rs.getString("MEMBER_ID"));
				loginMember.setName(rs.getString("MEMBER_NAME"));
				loginMember.setPasswd(rs.getString("MEMBER_PW"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return loginMember;
	}
	
}





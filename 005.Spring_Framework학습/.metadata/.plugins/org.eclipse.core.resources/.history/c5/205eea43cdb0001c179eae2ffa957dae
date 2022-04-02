package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

// DAO (Data Access Object)


// @Repository("userDAO")
public class UserDAO {
	
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null; 
	
	
	// SQL ��ɾ��
	// private final String USER_GET = "select * from users where id=? and password=?"; 
	private final String USER_INSERT = "insert into users values(?,?,?,?)";
	private final String USER_UPDATE = "update users set password=?, name=?, role=? where id=?";
	private final String USER_DELETE = "delete from users where id=?";
	private final String USER_GETLIST = "select * from users";
	private final String USER_GET = "select * from users where id=?";
	
	
	// CRUD ����� �޼��� ����
	// ���̺�� : users
	// �÷���    ��     id | password | name | role  
	// ---------------------------------------------------------
	// 1. ȸ������
	public void insertUser(UserVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT); // insert into users values(?,?,?,?)
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	// ---------------------------------------------------------
	// 2. ȸ������ ���� - id����
	public void updateUser(UserVO vo) {
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_UPDATE); // update users set password=?, name=?, role=? where id=?
			stmt.setString(1, vo.getPassword());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getRole());
			stmt.setString(4, vo.getId());
			int a;
			a = stmt.executeUpdate();
			
			System.out.println(a);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	// ---------------------------------------------------------	
	// 3. ȸ������ - id����
	public void deleteUser(UserVO vo) {
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_DELETE); // delete from users where id=?
			stmt.setString(1, vo.getId());
			stmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	// ---------------------------------------------------------	
	// 4. ȸ�� ��� ���� 
	//    �÷���    ��     id | password | name | role 
	public List<UserVO> getUserList(){
		
		List<UserVO> userList = new ArrayList<UserVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GETLIST); // select * from users
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				UserVO user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
				userList.add(user);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return userList;
	}
	// ---------------------------------------------------------	
	// 5. �α����� ���̵��� ������ �����ֱ� (������ ���̵� ������ �����ֱ�)
	//    �÷���    ��     id | password | name | role 
	public UserVO getUser(UserVO vo){
		
		UserVO user = null;
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET); // select * from users where id=?
			stmt.setString(1, vo.getId());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return user;
	}
	
	// ---------------------------------------------------------	
	// ȸ�� ���
	//	public UserVO getUser(UserVO vo) {
	//		
	//		UserVO user = null;
	//		
	//		try {
	//			System.out.println("==> JDBC�� getUser() ��� ó��");
	//			conn = JDBCUtil.getConnection();
	//			stmt = conn.prepareStatement(USER_GET);
	//			stmt.setString(1, vo.getId());
	//			stmt.setString(2, vo.getPassword());
	//			rs = stmt.executeQuery();
	//			
	//			if(rs.next()) {
	//				user = new UserVO();
	//				user.setId(rs.getString("ID"));
	//				user.setPassword(rs.getString("PASSWORD"));
	//				user.setName(rs.getNString("NAME"));
	//				user.setRole(rs.getString("ROLE"));
	//			}
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} finally {
	//			JDBCUtil.close(rs, stmt, conn);
	//		}
	//		return user;
	//	}
}

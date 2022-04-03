package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAOMybatis {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public UserVO getUser(UserVO vo) {
			System.out.println("===> JDBC로 getUser() 기능 처리");
			return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
	}
	
	public List<UserVO> getUserList(UserVO vo) {
			System.out.println("===> JDBC로 getUserList() 기능 처리");
			return mybatis.selectList("UserDAO.getUserList", vo);		
	}
	
	
	public int insertUser(UserVO vo) {
		System.out.println("===> JDBC로 insertUser() 기능 처리");
		return mybatis.insert("UserDAO.insertUser", vo);
	}
	
	public int updateUser(UserVO vo) {
		System.out.println("===> JDBC로 updateUser() 기능 처리");
		return mybatis.update("UserDAO.updateUser", vo);
	}
	
	public int deleteUser(UserVO vo) {
		System.out.println("===> JDBC로 deleteUser() 기능 처리");
		return mybatis.delete("UserDAO.deleteUser", vo);
	}
	
}

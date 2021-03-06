package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAOMybatis {
	
	@Autowired
	public SqlSessionTemplate mybatis;
	
	public void inserUser(UserVO vo) {
		mybatis.insert("UserDAO.insertUser" , vo);
	}
	
	public void updateUser(UserVO vo) {
		mybatis.update("UserDAO.updateUser", vo);
	}
	
	public void deleteUser(UserVO vo) {
		mybatis.delete("UserDAO.deleteUser" , vo);
	}
	
	public List<UserVO> selectList(){
		return mybatis.selectList("UserDAO.selectList");
	}
	
	public UserVO select(UserVO vo) {
		return (UserVO) mybatis.selectOne("UserDAO.select" , vo);
	}
}

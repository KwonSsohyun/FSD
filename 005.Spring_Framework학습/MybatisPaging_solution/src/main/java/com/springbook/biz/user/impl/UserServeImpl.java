package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServeImpl implements UserService{
	@Autowired
	private UserDAOMybatis userDAO;
//	private UserDAO userDAO;


	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		return userDAO.getUserList(vo);
	}

	@Override
	public int insertUser(UserVO vo) {
		return userDAO.insertUser(vo);
	}

	@Override
	public int updateUser(UserVO vo) {
		return userDAO.updateUser(vo);
	}

	@Override
	public int deleteUser(UserVO vo) {
		return userDAO.deleteUser(vo);
	}


}

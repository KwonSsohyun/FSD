package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

// ��ü ���� - �����������̳ʿ� ��Ƴ��´�.
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAOMybatis userDAO; // = new UserDAOMybatis();

	// ----------------------------------------------
	
	@Override
	public boolean insertUser(UserVO vo) {
		// 1. ȸ������
		userDAO.inserUser(vo);
		return true;
	}

	@Override
	public void updateUser(UserVO vo) {
		// 2. ȸ������ ���� - id����
		userDAO.updateUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		// 3. ȸ������ - id����
		userDAO.deleteUser(vo);
	}

	@Override
	public List<UserVO> getUserList() {
		// 4. ȸ�� ��� ����
		return userDAO.selectList();
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// 5. �α����� ���̵��� ������ �����ֱ� (������ ���̵� ������ �����ֱ�)
		return userDAO.select(vo);
	}

	@Override
	public void insertUser1(UserVO vo) {
		// TODO Auto-generated method stub
		
	}



}

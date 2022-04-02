package com.springbook.biz.user;

import java.util.List;

public interface UserService {
	// CRUD 기능의 메소드 구현
	// 회원 등록
	
	public boolean insertUser(UserVO vo);
	void insertUser1(UserVO vo);
	void updateUser(UserVO vo);
	void deleteUser(UserVO vo);
	// List<UserVO> getUserList(UserVO vo);
	List<UserVO> getUserList();
	UserVO getUser(UserVO vo);
	
	
	
	
	// public UserVO getUser(UserVO vo);
}

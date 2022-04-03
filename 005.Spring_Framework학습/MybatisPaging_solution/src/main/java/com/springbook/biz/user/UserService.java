package com.springbook.biz.user;

import java.util.List;

public interface UserService {

	UserVO getUser(UserVO vo);
	
	List<UserVO> getUserList(UserVO vo);
	
	int insertUser(UserVO vo);
	
	int updateUser(UserVO vo);
	
	int deleteUser(UserVO vo);

}
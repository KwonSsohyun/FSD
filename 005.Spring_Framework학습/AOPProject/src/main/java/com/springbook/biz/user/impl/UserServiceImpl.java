package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

// 객체 생성 - 스프링컨테이너에 담아놓는다.
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO; // = new UserDAO();

	// ----------------------------------------------
	
	@Override
	public boolean insertUser(UserVO vo) {
		// 1. 회원가입
		userDAO.insertUser(vo);
		return true;
	}

	@Override
	public void updateUser(UserVO vo) {
		// 2. 회원정보 수정 - id기준
		userDAO.updateUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		// 3. 회원삭제 - id기준
		userDAO.deleteUser(vo);
	}

	@Override
	public List<UserVO> getUserList() {
		// 4. 회원 목록 보기
		return userDAO.getUserList();
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// 5. 로그인한 아이디의 정보만 보여주기 (선택한 아이디 정보만 보여주기)
		return userDAO.getUser(vo);
	}


	public void insertUser1(UserVO vo) {};
	

	
	// public UserVO getUser(UserVO vo) {
	//   return userDAO.getUser(vo);
	// }

	
	// public void setUserDAO(UserDAO userDAO) {
	// 	 this.userDAO = userDAO;
	// }
}

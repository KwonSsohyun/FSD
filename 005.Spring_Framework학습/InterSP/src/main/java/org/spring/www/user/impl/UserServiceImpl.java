package org.spring.www.user.impl;

import org.spring.www.UserVO;
import org.spring.www.user.UserDAO;
import org.spring.www.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserDAO dao;
     
    @Override
    public UserVO login(UserVO vo) {
        return dao.login(vo);
    }
}
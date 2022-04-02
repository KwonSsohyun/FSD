package com.springbook.biz.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("user/userContext.xml");
		
		// 2. Spring 컨테이너로부터 UserServiceImpl 객체를 Lookup 한다.
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. 로그인 기능 테스트
		UserVO vo = new UserVO();
//		vo.setId("test");
//		vo.setPassword("test1234");
//		
//		UserVO user = userService.getUser(vo);
//		
//		if(user != null) {
//			System.out.println(user.getName() + "님 환영합니다.");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		
		// ------------------------------------------------------------------------
		// 테이블명 : users
		// 컬럼명    ▶     id | password | name | role  
		
		// +-------+----------+--------+-------+
		// | id    | password | name   | role  |
		// +-------+----------+--------+-------+
		// | test  | test1234 | 관리자      | Admin |
		// | user1 | user1    | 홍길동      | user  |
		// +-------+----------+--------+-------+
		
		
		// 1. 회원가입 ---------------------------------------------------------------
		//    insert into users values(?,?,?,?);
		//    insertUser
//		vo.setId("topal");
//		vo.setPassword("1234");
//		vo.setName("깡토팔");
//		vo.setRole("user");
		userService.insertUser(vo);
//		System.out.println("성공했습니다.");
		
		
		// 2. 회원정보 수정 - id기준 -----------------------------------------------------
		//    update users set password=?, name=?, role=? where id=?;
		//    → update users set password="test1234", name="관리자", role="Admin" where id="test";
		//    udateUser
//		vo.setId("test");
//		vo.setPassword("abc1234");
//		vo.setName("꽌리짜");
//		vo.setRole("Admin");
		userService.updateUser(vo);
		
		
		// 3. 회원삭제 - id기준 ---------------------------------------------------------
		//    delete from users where id=?;
		//    deleteUser
//		vo.setId("topal");
//		userService.deleteUser(vo);
		
		
		// 4. 회원 목록 보기 ------------------------------------------------------------
		//    select * from users;
		//    getUserList
		List<UserVO> list = new ArrayList<UserVO>();
		list = userService.getUserList();
		
		for(UserVO voo : list) {
			System.out.println(voo.toString());
		}
		
		
		// 5. 로그인한 아이디의 정보만 보여주기 (선택한 아이디 정보만 보여주기) --------------------------
		//    select * from users where id=?;
		//    → select * from users where id="topal";
		//    getUser
		// vo.setId("topal");
		System.out.println("---------------------");
		System.out.println(userService.getUser(vo));
		
		
		// 6. Spring 컨테이너를 종료한다.
		container.close();

	}

}

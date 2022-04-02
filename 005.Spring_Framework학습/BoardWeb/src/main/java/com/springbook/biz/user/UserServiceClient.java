package com.springbook.biz.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("user/userContext.xml");
		
		// 2. Spring �����̳ʷκ��� UserServiceImpl ��ü�� Lookup �Ѵ�.
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
//		vo.setId("test");
//		vo.setPassword("test1234");
//		
//		UserVO user = userService.getUser(vo);
//		
//		if(user != null) {
//			System.out.println(user.getName() + "�� ȯ���մϴ�.");
//		} else {
//			System.out.println("�α��� ����");
//		}
		
		
		// ------------------------------------------------------------------------
		// ���̺�� : users
		// �÷���    ��     id | password | name | role  
		
		// +-------+----------+--------+-------+
		// | id    | password | name   | role  |
		// +-------+----------+--------+-------+
		// | test  | test1234 | ������      | Admin |
		// | user1 | user1    | ȫ�浿      | user  |
		// +-------+----------+--------+-------+
		
		
		// 1. ȸ������ ---------------------------------------------------------------
		//    insert into users values(?,?,?,?);
		//    insertUser
//		vo.setId("topal");
//		vo.setPassword("1234");
//		vo.setName("������");
//		vo.setRole("user");
		userService.insertUser(vo);
//		System.out.println("�����߽��ϴ�.");
		
		
		// 2. ȸ������ ���� - id���� -----------------------------------------------------
		//    update users set password=?, name=?, role=? where id=?;
		//    �� update users set password="test1234", name="������", role="Admin" where id="test";
		//    udateUser
//		vo.setId("test");
//		vo.setPassword("abc1234");
//		vo.setName("����¥");
//		vo.setRole("Admin");
		userService.updateUser(vo);
		
		
		// 3. ȸ������ - id���� ---------------------------------------------------------
		//    delete from users where id=?;
		//    deleteUser
//		vo.setId("topal");
//		userService.deleteUser(vo);
		
		
		// 4. ȸ�� ��� ���� ------------------------------------------------------------
		//    select * from users;
		//    getUserList
		List<UserVO> list = new ArrayList<UserVO>();
		list = userService.getUserList();
		
		for(UserVO voo : list) {
			System.out.println(voo.toString());
		}
		
		
		// 5. �α����� ���̵��� ������ �����ֱ� (������ ���̵� ������ �����ֱ�) --------------------------
		//    select * from users where id=?;
		//    �� select * from users where id="topal";
		//    getUser
		// vo.setId("topal");
		System.out.println("---------------------");
		System.out.println(userService.getUser(vo));
		
		
		// 6. Spring �����̳ʸ� �����Ѵ�.
		container.close();

	}

}

package org.spring.www.user.controller;

import javax.servlet.http.HttpSession;

import org.spring.www.UserVO;
import org.spring.www.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("userService")
public class UserController {
 
    @Autowired // byType으로 자동 주입
    UserService service;
 
    // 로그인 폼을 띄우는 부분
    @RequestMapping(value="/login.do",method=RequestMethod.GET)
    public String loginForm(){
        return "login.jsp"; // /login/loginForm.jsp를 띄움.
    }//end of loginForm
     
    // 로그인 처리하는 부분
    @RequestMapping(value="/login.do",method=RequestMethod.POST)
    public String loginProcess(HttpSession session,UserVO dto){
        String returnURL ="";
         
        // 로그인이 성공하면 UserVO 객체를 반환함.
        UserVO vo = service.login(dto);
         
        if ( vo !=null ){ // 로그인 성공
            session.setAttribute("login", vo); // 세션에 login인이란 이름으로 UserVO 객체를 저장해 놈.
            returnURL ="/getBoardList.do"; // 로그인 성공시 게시글 목록페이지로 바로 이동하도록 하고
        }else { // 로그인에 실패한 경우
            returnURL ="/login.jsp"; // 로그인 폼으로 다시 가도록 함
        }
         
        return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴
    }
 
    // 로그아웃 하는 부분
    @RequestMapping(value="/logout.do")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 전체를 날려버림
//      session.removeAttribute("login"); // 하나씩 하려면 이렇게 해도 됨.
        return "/login.jsp"; // 로그아웃 후 게시글 목록으로 이동하도록...함
    }
}
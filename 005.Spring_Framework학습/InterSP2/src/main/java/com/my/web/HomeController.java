package com.my.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login.action", method=RequestMethod.GET)
	public String loginAction(HttpServletRequest req,
			HttpServletResponse res, HttpSession session) {
		String userId = req.getParameter("userId");

		session.setAttribute("userId", userId);
		return "redirect:/main.do";
	}
	
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String join() {
		return "join";
	}
}

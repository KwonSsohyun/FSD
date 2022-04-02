package com.springbook.view.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class Test {
	@Autowired
	private BoardService boardService;

	@ResponseBody
	@RequestMapping("/test.do")
	public String testView() {
		Date day = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatedNow = sdf.format(day);

		return formatedNow;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/reqAjax1.do")
	public Object reqAjax1(@RequestParam Map<String,Object> map, BoardVO vo, BoardDAO dao) {
		String seq = (String) map.get("seq"); // 2
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		vo.setSeq(Integer.parseInt(seq));
		boardList.add(dao.getBoard(vo));
        
        Map<String, Object> retVal = new HashMap<String, Object>();
        retVal.put("boardList", boardList); 
        retVal.put("code", "OK");
        return retVal;
	}
	
//	@RequestMapping(value="/reqAjax2.do", headers="Accept=*/*",  produces="application/json")
	@ResponseBody
	@RequestMapping(value="/reqAjax2.do")
	public Object reqAjax2(@RequestParam Map<String,Object> map, UserVO vo, UserDAO dao) {
		vo.setId(map.get("id").toString());
		vo.setPassword(map.get("password").toString());
		
		Map<String, Object> retVal = new HashMap<String, Object>();
		
		retVal.put("user", dao.getUser(vo)); 
		retVal.put("code", "OK");
		return retVal;
	}
	
}
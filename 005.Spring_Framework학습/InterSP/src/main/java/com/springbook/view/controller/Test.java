package com.springbook.view.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class Test {

	@ResponseBody
	@RequestMapping("/test.do")
	public String testView() {
//		System.out.println("test맵핑처리");
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
		Date day = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatedNow = sdf.format(day);

		return formatedNow;
	}
	
	
//	@RequestMapping(value="/reqAjax2.do", headers="Accept=*/*",  produces="application/json")
	@RequestMapping(value="/reqAjax2.do")
	@ResponseBody
	public Object reqAjax2(@RequestParam Map<String,Object> map, BoardVO vo, BoardDAO dao) {
		String seq = (String) map.get("seq");
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		vo.setSeq(Integer.parseInt(seq));
		boardList.add(dao.getBoard(vo));
        
        Map<String, Object> retVal = new HashMap<String, Object>();
        retVal.put("boardList", boardList); //bookList란 키로 bookList의 값을 넣어줍니다. (웹에서 bookList키로 추출
        retVal.put("code", "OK");
        return retVal;
	}

}

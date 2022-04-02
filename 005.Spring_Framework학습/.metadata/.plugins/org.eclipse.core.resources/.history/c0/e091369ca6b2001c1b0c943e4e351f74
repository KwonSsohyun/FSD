package com.springbook.view.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 글 등록 화면
	@RequestMapping(value = "/insertBoard.do", method = RequestMethod.GET)
	public String insertView(BoardVO vo) throws IllegalStateException, IOException {
		return "insertBoard.jsp";
	}
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}

	// 글 목록
	@RequestMapping("/getBoardList.do")
	public String getBoardListPost(BoardVO vo, Model model) {
		System.out.println("글 목록 검색 처리");

		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
}

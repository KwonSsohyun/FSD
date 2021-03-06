package com.springbook.biz.board;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardDAO;
 
public class BoardServiceClient {
	
	public static void main(String[] args) throws SQLException {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService) factory.getBean("boardService");

		
		BoardVO vo = new BoardVO();
		vo.setTitle("myBaits 제목");
		vo.setWriter("홍길동");
		vo.setContent("myBatis 내용입니다....");
		boardService.insertBoard(vo);
		
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
	}
		
		
}

package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
 
public class BoardServiceClient {
	
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		//    BoardServicelmpl 클래스임 - @Service("boardService") 객체생성되어있음
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setSeq(0);
//		 vo.setTitle("임시제목");
//		 vo.setWriter("홍길동");
//		 vo.setContent("임시 내용.........");
		System.out.println(vo.getSeq());
		 boardService.insertBoard(vo);
		
		
		// 5. 글 삭제 기능
		// vo.setSeq(2);
		// boardService.deleteBoard(vo);
		
		
		// 6. 글 수정기능
		BoardVO vo1 = new BoardVO();
		// vo1.setTitle("깡토팔");
		// vo1.setContent("헤헷 수정이예용 ㅎㅎㅎ");
		// vo1.setSeq(3);
		// boardService.updateBoard(vo1);
		
		
		// 4. 조회기능 - 내가 원하는 번호만 조회
		//BoardVO bb = boardService.getBoard(vo1);
		//System.out.println(bb);
		//System.out.println(bb.toString());
		
		
		
		// 4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		

		// 맨마지막. Spring 컨테이너 종료
		container.close();
	}
}

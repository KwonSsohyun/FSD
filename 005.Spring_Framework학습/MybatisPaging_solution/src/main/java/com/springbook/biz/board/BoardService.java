package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//CRUD 기능의 메소드 구현
	//글등록
	void insertBoard(BoardVO vo);

	//글수정
	void updateBoard(BoardVO vo);

	//글삭제
	void deleteBoard(BoardVO vo);

	//글상세 조회
	BoardVO getBoard(BoardVO vo);

	//글목록 조회
	List<BoardVO> getBoardList(BoardVO vo);
	
	//게시물 총 갯수
	int countBoard(BoardVO vo);

}
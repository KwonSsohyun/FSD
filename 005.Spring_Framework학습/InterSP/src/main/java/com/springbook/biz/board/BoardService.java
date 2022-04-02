package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//글상세 조회
	BoardVO getBoard(BoardVO vo);

	//글목록 조회
	List<BoardVO> getBoardList(BoardVO vo);

}
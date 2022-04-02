package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	
	// CRUD ����� �޼��� ����
	// �� ���
	void insertBoard(BoardVO vo);
	
	// �� ����
	void updateBoard(BoardVO vo);
	
	// �� ����
	void deleteBoard(BoardVO vo);
	
	// �� �� ��ȸ
	BoardVO getBoard(BoardVO vo);
	
	// �� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);
	

	
}

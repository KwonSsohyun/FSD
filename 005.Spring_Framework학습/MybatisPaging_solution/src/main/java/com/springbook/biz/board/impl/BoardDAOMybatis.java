package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	//CRUD 기능의 메소드 구현
	//글등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===>JDBC로 insertBoard() 기능처리");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	//글수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===>JDBC로 updateBoard() 기능처리");
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	//글삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===>JDBC로 deleteBoard() 기능처리");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	//글상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===>JDBC로 getBoard() 기능처리");
		mybatis.update("BoardDAO.updateCnt", vo);
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	//글목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===>JDBC로 getBoardList() ");
		
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	
	//전체 페이지 수 조회
	public int countBoard(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.countBoard", vo);
	}
	

}

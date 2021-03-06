package com.springbook.biz.board.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.util.SqlSessionFactoryBean;

//@Repository
public class BoardDAO {
	
	// JDBC
	private SqlSession mybatis;
	
	// SQL 
//	private final String BOARD_INSERT = "insert into board(title, writer, content, filename) values( ?, ?, ?, ?)";
//	private final String BOARD_UPDATE = "update board set title=?, writer=?, content=? where seq=?";
//	private final String BOARD_DELETE = "delete from board where seq=?";
//	private final String BOARD_GET = "select * from board where seq=?";
//	private final String BOARD_LIST = "select * from board order by seq desc";
//	
//	private final String BOARD_LIST_T = "select * from board where title like CONCAT('%',?,'%') order by seq desc";
//	private final String BOARD_LIST_C = "select * from board where content like CONCAT('%',?,'%') order by seq desc";
	
	
	
	// CRUD
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	

	
}

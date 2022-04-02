package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;


// DAO(Data Access Object)
@Repository
public class BoardDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	// SQL ��ɾ��
	// private final String BOARD_INSERT = "insert into board(title, writer, content) values(?,?,?)";
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values(?,?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	private final String BOARD_TOTAL = "select count(*) from board";
	
	private final String BOARD_LIST_T = "select * from board where title like CONCAT('%',?,'%') order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like CONCAT('%',?,'%') order by seq desc";
	
	
//	@Autowired
//	public void setSuperDataSource(DataSource dataSource) {
//		super.setDataSource(dataSource);
//	}
	
	
	// CRUD ����� �޼ҵ� ����
	// �� �Խñ� �� ��������
	public int getTotal() {
		System.out.println("===> Spring JDBC�� getTotal() ���ó��");
		return jdbcTemplate.queryForObject(BOARD_TOTAL, Integer.class);
		// return getJdbcTemplate().queryForObject(BOARD_TOTAL, Integer.class);
	}
	
	
	
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC�� insertBoard() ��� ó��");
		jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
		// getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());

	}
	
	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC�� updateBoard() ��� ó��");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
		// getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());

	}
	
	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC�� deleteBoard() ��� ó��");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
		// getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		
		Object[] args = {vo.getSearchKeyword()};
		
		if(vo.getSearchCondition().equals("TITLE")) {
			return (BoardVO) jdbcTemplate.query(BOARD_LIST_T, args, new BoardRowMapper());
		} else if(vo.getSearchCondition().equals("CONTENT")) {
			return (BoardVO) jdbcTemplate.query(BOARD_LIST_C, args, new BoardRowMapper());
		}
		return null;
		
		// return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
		// return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC�� getBoardList() ��� ó��");
		
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
		// return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
	}
	
}



class BoardRowMapper implements RowMapper<BoardVO>{
	
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
		
	}
	
}

















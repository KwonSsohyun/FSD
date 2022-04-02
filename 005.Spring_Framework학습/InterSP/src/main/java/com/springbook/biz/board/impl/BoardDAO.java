package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.spring.www.JDBCUtil;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAO {
	//JDBC관련 변수
	private Connection conn =null;
	private PreparedStatement stmt =null;
	private ResultSet rs =null;
	
	
	//sql명령어들
//	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) "
//			+ "values( (select nvl(max(seq),0)+1 from board), ?, ?, ?)";
	private final String BOARD_INSERT = "insert into board(title, writer, content) "
			+ "values( ?, ?, ?)";
	
	private final String BOARD_UPDATE = "update board set title =?, writer=?, content=? where seq=? ";
	private final String BOARD_DELETE = "delete from board where seq = ?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	private final String BOARD_LIST_T = "select * from board where title like CONCAT('%',?,'%') order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like CONCAT('%',?,'%') order by seq desc";
	
	//CRUD 기능의 메소드 구현
	//글등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===>JDBC로 insertBoard() 기능처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	//글수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===>JDBC로 updateBoard() 기능처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.setInt(4, vo.getSeq());
			stmt.executeUpdate();			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	//글삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===>JDBC로 deleteBoard() 기능처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	//글상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===>JDBC로 getBoard() 기능처리");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			while(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return board;
	}
	
	//글목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===>JDBC로 getBoardList() 기능처리: "+vo.getSearchCondition());
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			if(vo.getSearchCondition()!=null) {
				if(vo.getSearchCondition().equals("TITLE")) {
					System.out.println("TITLE: "+vo.getSearchKeyword());
					stmt = conn.prepareStatement(BOARD_LIST_T);
					stmt.setString(1, vo.getSearchKeyword());
				} else if(vo.getSearchCondition().equals("CONTENT")) {
					System.out.println("CONTENT: "+vo.getSearchKeyword());
					stmt = conn.prepareStatement(BOARD_LIST_C);
					stmt.setString(1, vo.getSearchKeyword());
				}
			}else {
				stmt = conn.prepareStatement(BOARD_LIST);	
			}			
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				boardList.add(board);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardList;
	}

}

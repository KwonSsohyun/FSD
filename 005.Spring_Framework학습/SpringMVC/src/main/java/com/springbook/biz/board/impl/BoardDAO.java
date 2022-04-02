package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

@Repository
public class BoardDAO {
	
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL ��ɾ��
	private final String BOARD_INSERT = "insert into board(title, writer, content)" + "values( ?, ?, ?)";
	private final String BOARD_UPDATE = "update board set title=?, writer=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	private final String BOARD_LIST_T = "select * from board where title like CONCAT('%',?,'%') order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like CONCAT('%',?,'%') order by seq desc";
	
	
	
	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC�� insertBoard() ��� ó��");
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getTitle()); 
			stmt.setString(2, vo.getWriter()); 
			stmt.setString(3, vo.getContent()); 
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC�� updateBoard() ��� ó��");
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE); // "update board set title=?, writer=?, content=? where seq=?"
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.setInt(4, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt,  conn);
		}
	}
	
	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC�� deleteBoard() ��� ó��");
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC�� getBoard() ��� ó��");
		
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,  stmt, conn);
		}
		
		return board;
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			
			System.out.println("conn: "+conn);
			
			if(vo.getSearchCondition().equals("TITLE")) {
				stmt = conn.prepareStatement(BOARD_LIST_T);
			} else if(vo.getSearchCondition().equals("CONTENT")) {
				stmt = conn.prepareStatement(BOARD_LIST_C);
			}
			stmt.setString(1, vo.getSearchKeyword());
			
			// stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
				System.out.println("999: "+rs.getString("TITLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,  stmt, conn);
		}
		return boardList;
	}
	
}

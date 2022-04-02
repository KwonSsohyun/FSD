package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
 
public class BoardServiceClient {
	
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup�Ѵ�.
		//    BoardServicelmpl Ŭ������ - @Service("boardService") ��ü�����Ǿ�����
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. �� ��� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setSeq(100);
		vo.setTitle("�ӽ�����");
		vo.setWriter("������");
		vo.setContent("�ӽ� ����.........");
		// System.out.println(vo.getSeq());
		boardService.insertBoard(vo);
		
		
		// 5. �� ���� ���
		// vo.setSeq(2);
		// boardService.deleteBoard(vo);
		
		
		// 6. �� �������
		BoardVO vo1 = new BoardVO();
		// vo1.setTitle("������");
		// vo1.setContent("���� �����̿��� ������");
		// vo1.setSeq(3);
		// boardService.updateBoard(vo1);
		
		
		// 4. ��ȸ��� - ���� ���ϴ� ��ȣ�� ��ȸ
		//BoardVO bb = boardService.getBoard(vo1);
		//System.out.println(bb);
		//System.out.println(bb.toString());
		
		
		
		// 4. �� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 6. �� �Խñ� �� �������� - select count(*) from board;
		// System.out.println("�� �Խñ� ���� " + boardService.getTotal() + " �� �Դϴ�.");
		
		

		// �Ǹ�����. Spring �����̳� ����
		container.close();
	}
}

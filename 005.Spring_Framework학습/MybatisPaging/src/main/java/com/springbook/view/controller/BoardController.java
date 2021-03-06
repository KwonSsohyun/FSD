package com.springbook.view.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.PageVO;


@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService; // = new BoardServiceImpl();
	
	// 상대 경로 추가시 realPath 추가
	// String realPath = request.getSession().getServletContext().getRealPath("/img");
	String realPath = "F:/swork/SpringFileUpload/src/main/webapp/img/";
	
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}

	// 글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		
		// 파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			File file = new File(realPath + fileName);
			
			if(!file.exists()) {
				file.mkdir();
			}
			uploadFile.transferTo(file);
			vo.setFilename(fileName);
		}
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		
		System.out.println("번호 : " + vo.getSeq());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("작성자 : " + vo.getWriter());
		System.out.println("내용 : " + vo.getContent());
		System.out.println("등록일 : " + vo.getRegDate());
		System.out.println("조회수 : " + vo.getCnt());
		
		
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
		return "getBoard.jsp";  // View 이름 리턴
		
	}
	
	//****** 파일 다운
	@RequestMapping("/download.do")
	public void download(@ModelAttribute("board") BoardVO vo, HttpServletResponse response) throws Exception {
		try {
			String path = realPath+vo.getFilename(); // 경로에 접근할 때 역슬래시('\') 사용
			
        	File file = new File(path);
        	response.setHeader("Content-Disposition", "attachment;filename=" + file.getName()); // 다운로드 되거나 로컬에 저장되는 용도로 쓰이는지를 알려주는 헤더     
        	
        	FileInputStream fileInputStream = new FileInputStream(path); // 파일 읽어오기 
        	OutputStream out = response.getOutputStream();
        	
        	int read = 0;
                byte[] buffer = new byte[1024];
                while ((read = fileInputStream.read(buffer)) != -1) { // 1024바이트씩 계속 읽으면서 outputStream에 저장, -1이 나오면 더이상 읽을 파일이 없음
                    out.write(buffer, 0, read);
                }
			
		} catch (Exception e) {
			throw new Exception("download error");
		}
	}
	
	
	
	
	
	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, PageVO pvo, Model model){ // btnCnt=0
		
		// 초기값 번호 주기
		if(pvo.getBtnCnt() == 0) pvo.setBtnCnt(1); // btnCnt=1
		pvo.setOnePage(5); // onePage=5
		
		System.out.println(pvo.getBtnCnt());
		System.out.println(vo.getBtnCnt());
		
		// 총 갯수 가져오기 
		// select count(*) from board;
		int total = boardService.totalBoard();
		
		
		// 페이징 버튼 생성 갯수 정해주기
		if(total % 5 == 0) {
			pvo.setTotalBtn(total/5);
		} else {
			pvo.setTotalBtn(((total/5)+1));
		}
		
		vo.setBtnCnt(pvo.getBtnCnt());   // 1
		vo.setOnePage(pvo.getOnePage()); // 5
		vo.setTotalBtn(pvo.getTotalBtn());
		
		
		// offset 값만 던지기
		// (btnCnt-1)*onePage
		int btncnt = pvo.getBtnCnt();
		int offset = (btncnt-1)*5;
		vo.setOffset(offset);
		
		// Null check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
				
		
		// Model 정보 저장
		model.addAttribute("ptotalBtn", pvo);
		model.addAttribute("totalBtn", vo);
		model.addAttribute("boardList", boardService.getBoardList(vo)); // Model 정보 저장
		return "getBoardList.jsp";  // View 이름 리턴
		
		
	}
	
	
	
}

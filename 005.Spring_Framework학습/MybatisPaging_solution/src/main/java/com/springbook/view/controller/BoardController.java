package com.springbook.view.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.util.PagingVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//상대 경로 추가 시 realPath 추가
    //String realPath = request.getSession().getServletContext().getRealPath("/img/");
	String realPath = "c:/swork/MybatisPaging/src/main/webapp/img/" ;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("제목", "TITLE");
		return conditionMap;
	}


	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, MultipartHttpServletRequest request) throws IOException{
		//파일 업로드 처리 
		//board테이블에 컬럼추가하기 ALTER TABLE board ADD COLUMN filename varchar(200);
		MultipartFile uploadFile = vo.getUploadFile();
		
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			
			File file = new File(realPath+fileName);
			vo.setFilename(fileName);
			if(!file.exists()) {
				file.mkdirs();
			}
			uploadFile.transferTo(file);
		}
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, HttpSession session) {
		if( vo.getWriter().equals(session.getAttribute("userName").toString()) ){
			boardService.updateBoard(vo);
			return "getBoardList.do";
		}else {
			return "getBoard.do?error=1";
		}
		
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(@ModelAttribute("board") BoardVO vo, HttpSession session) {
		if( vo.getWriter().equals(session.getAttribute("userName").toString()) ) {
			if(vo.getFilename()!=null) {
				System.out.println("파일삭제: "+realPath + vo.getFilename());
				File f = new File(realPath + vo.getFilename());		
				f.delete();
			}
		}
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo));
		System.out.println("77:"+boardService.getBoard(vo).getFilename());
		return "getBoard.jsp";
	}

	// 글 목록
	@RequestMapping("/getBoardList.do")
	public String getBoardListPost(PagingVO pv, BoardVO vo, Model model,@RequestParam(value = "nowPage", required = false) String nowPage) {
		System.out.println("글 목록 검색 처리");
		String cntPerPage = "5";
		if (vo.getSearchCondition() != null) vo.setSearchCondition(vo.getSearchCondition());
		else vo.setSearchCondition("TITLE");
		
		if (vo.getSearchKeyword() != null) vo.setSearchKeyword(vo.getSearchKeyword());
		else vo.setSearchKeyword("");
		System.out.println("000: "+vo.getSearchCondition());
		System.out.println("111: "+vo.getSearchKeyword());

		int total = boardService.countBoard(vo);
		if (nowPage == null)  nowPage = "1";

		pv = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", pv);
		vo.setStart(pv.getStart());
		vo.setListcnt(Integer.parseInt(cntPerPage));

		model.addAttribute("boardList", boardService.getBoardList(vo));
		model.addAttribute("searchKeyword", vo.getSearchKeyword());
		model.addAttribute("searchCondition", vo.getSearchCondition());
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/download.do", method=RequestMethod.GET)
    public void fileDownLoad(@RequestParam(value="filename",defaultValue = "", required=false) String filename, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("파일 다운로드");
		if (!filename.equals("")) {
	        //(2) 요청파일 정보 불러오기
	        File file = new File(realPath+filename);
	
			// 한글은 http 헤더에 사용할 수 없기 때문에 파일명은 영문으로 인코딩하여 헤더에 적용한다
			String fn = new String(file.getName().getBytes(), "iso_8859_1");
			System.out.println("fn: "+fn);
	
			
			//(3) ContentType설정
			byte[] bytes = org.springframework.util.FileCopyUtils.copyToByteArray(file);
			response.setHeader("Content-Disposition", "attachment; filename=\""+ fn + "\"");
			response.setContentLength(bytes.length);
	//			response.setContentType("image/jpeg");
	        
			response.getOutputStream().write(bytes);
	        response.getOutputStream().flush();
	        response.getOutputStream().close();
        }
    }
	
}

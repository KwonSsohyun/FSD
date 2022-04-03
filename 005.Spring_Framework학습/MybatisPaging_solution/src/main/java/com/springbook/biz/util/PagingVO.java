package com.springbook.biz.util;

public class PagingVO {
	
	// 현재페이지, 시작페이지, 끝페이지, 게시글 총 갯수, 한 페이지에 보여지는 글 갯수, 마지막페이지, SQL쿼리에 쓸 offset
	private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start;
	private int cntPage = 5; // 하단에 보여질 페이지 클릭할 수 있는 버튼 수
	
	public PagingVO() {}
	
	public PagingVO(int total, int nowPage, int cntPerPage) {
		setNowPage(nowPage);
		setTotal(total);
		setCntPerPage(cntPerPage);
		calcLastPage(total, cntPerPage);
		calcStartEndPage(nowPage, cntPage);
		calcStartEnd(nowPage, cntPerPage);
	}
	
	// 제일 마지막 페이지 계산
	public void calcLastPage(int total, int cntPerPage) {
		if(total % cntPerPage > 0) {
			setLastPage(total /cntPerPage+1);
		} else {
			setLastPage(total /cntPerPage);
		}
	}
	
	// 시작, 끝 페이지 계산
	public void calcStartEndPage(int nowPage, int cntPage) {
		if(nowPage<=cntPage) {
			setStartPage(1);
		}else {
			if(nowPage%cntPage>0) {
				setStartPage(nowPage/cntPage*cntPage+1);
			}else {
				setStartPage(nowPage/cntPage*cntPage-cntPage+1);
			}
		}
		setEndPage(getStartPage()+cntPage-1);
		
		if (getLastPage() < getEndPage()) {
			setEndPage(getLastPage());
		}
	}
	
	// DB 쿼리에서 사용할 start 값 계산
	public void calcStartEnd(int nowPage, int cntPerPage) {
		if(nowPage<=1) setStart(0);
		else setStart(nowPage * cntPerPage - cntPerPage);
	}
	
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCntPerPage() {
		return cntPerPage;
	}
	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int setCntPage() {
		return cntPage;
	}
	public void getCntPage(int cntPage) {
		this.cntPage = cntPage;
	}
	
	@Override
	public String toString() {
		return "PagingVO [nowPage=" + nowPage + ", startPage=" + startPage + ", endPage=" + endPage + ", total=" + total
				+ ", cntPerPage=" + cntPerPage + ", lastPage=" + lastPage + ", start=" + start + ", cntPage=" + cntPage + "]";
	}
}
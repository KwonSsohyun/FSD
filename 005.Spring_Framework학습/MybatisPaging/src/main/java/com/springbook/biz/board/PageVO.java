package com.springbook.biz.board;

public class PageVO {
	
	private int btnCnt;
	private int onePage;
	private int total;
	private int start;
	private int end;
	private int totalBtn;
	
	
	public int getTotalBtn() {
		return totalBtn;
	}
	public void setTotalBtn(int totalBtn) {
		this.totalBtn = totalBtn;
	}
	public int getOnePage() {
		return onePage;
	}
	public void setOnePage(int onePage) {
		this.onePage = onePage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getBtnCnt() {
		return btnCnt;
	}
	public void setBtnCnt(int btnCnt) {
		this.btnCnt = btnCnt;
	}
	
	
}

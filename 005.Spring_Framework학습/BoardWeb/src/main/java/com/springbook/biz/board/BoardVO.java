package com.springbook.biz.board;

import java.sql.Date;

public class BoardVO {
	private int seq;        // 1                // 3
	private String title;   // �ӽ�����                       // ������
	private String writer;  // ȫ�浿 
	private String content; // �ӽ� ����.........  // ���� �����̿��� ������
	private Date regDate;
	private int cnt;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer="
				+ writer + ", content=" + content + ", regDate=" + regDate + ", cnt=" + cnt + "]";
	}
	
	
}

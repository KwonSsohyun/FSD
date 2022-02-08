package com.hi.bean;

public class StuBean { // ▶▶ 게시판을 위한 클래스
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//////////////////////////////////////////////////
	public int getNum() { // get ▶ 값을 가져오는 기능
		return num;
	}
	public void setNum(int num) { // set ▶ 값을 넣는 기능
		this.num = num;
	}
	//////////////////////////////////////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//////////////////////////////////////////////////
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	//////////////////////////////////////////////////
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	//////////////////////////////////////////////////
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	//////////////////////////////////////////////////
	
	
}

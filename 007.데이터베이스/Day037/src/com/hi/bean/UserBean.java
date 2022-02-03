package com.hi.bean;

public class UserBean { // ▶▶ 로그인을 위한 클래스
	
	// 회원정보
	private String id,pw, name;
	private int num, age;
	private boolean result; // 로그인 여부확인 (디폴트는 false) 
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// ▶▶ getter(값가져오고) & setter(값셋팅)
	///////////////////////////////////////////
	public String getId() { // get ▶ 값을 가져오는 기능
		return id;
	}
	public void setId(String id) { // set ▶ 값을 넣는 기능
		this.id = id;
	}
	///////////////////////////////////////////
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	///////////////////////////////////////////
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	///////////////////////////////////////////
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	///////////////////////////////////////////
	public boolean isResult() { // boolean은 get이 없고 is가 있다.
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	///////////////////////////////////////////
}

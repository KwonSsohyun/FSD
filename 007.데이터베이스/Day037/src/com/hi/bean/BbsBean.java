package com.hi.bean;

import java.sql.Date;

public class BbsBean { // ▶▶ 게시판을 위한 클래스
	
	// ▶▶ java Bean
	//    : 정보를 저장하는 제어하는 용도
	//    : 사용하기로한 목록 필드로 만들어서
	//      get, set 메서드 설정
	//      필드명 첫글자 대문자 (자신없으면 어시스트 사용) 
	
	// 지금 이 방식은 → jar 파일 안만들고, Class파일 만들었다.
	// 디폴트는 동일패키지 안에서만 접근가능
	// private 프라이빗은 해당클래스 안에서만 접근가능
	private int num;
	private String id;
	private String sub;
	private String content;
	private Date nalja;
	
	// 접근제한자를 통해서
	// 캡슐화를 통해서 은닉화
	// 메서드를 통해서 이들을 제어할 수 있도록 함.
	// 필드값을 제어할 수 있도록 한다.
	
	// ▶▶ getter(값가져오고) & setter(값셋팅)
	//    set필드명인데 앞에 대문자   + ctrl + 엔터
	//    get필드명인데 앞에 대문자   + ctrl + 엔터
	//    → ex)
	//    → getNum + ctrl + 엔터
	//    → setNum + ctrl + 엔터
	
	public int getNum() {  // get ▶ 값을 가져오는 기능
		return num;
	}
	public void setNum(int num) {  // set ▶ 값을 넣는 기능
		this.num = num;
	}
	//////////////////////////////////////////////////
	public String getId() {  
		return id;
	}
	public void setId(String id) {  
		this.id = id;
	}
	//////////////////////////////////////////////////
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	//////////////////////////////////////////////////
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//////////////////////////////////////////////////
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	//////////////////////////////////////////////////
	

	
	
	
	
	
	
	
//	public void setNum(int num) { // setNum
//		this.num = num;
//	}
//	
//	public int getNum() {  // getNum
//		return num;
//	}
//	
//	public void setId(String id) {  // setId
//		this.id = id;
//	}
	
	
	
//	// 값을 넣는 기능
//	public void setSub(String sub) {
//		this.sub = sub;
//	}
//	
//	// 값을 빼는 기능
//	public String getSub() {
//		return sub;
//	}
	
	
}

package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// 순서가 없는 자료구조
		// java.util  >>  Interface Set<E>
		
		// java.util  >>  Class HashSet<E>
//		java.util.Set set = new java.util.HashSet();
		java.util.Set set = new java.util.TreeSet();
		
		// .HashSet();
		// 중복나면 false (값 집어넣을때마다 중복값 검사 한다)
		// 인티저객체 해쉬코드 순서에 맞춰 출력
		// 같은 객체면 해쉬코드니까 자연스레 중복에 걸림
		// 순서가 없으니 3번째를 뽑을 수 없다.
		// 중복을 허용하지 않는다.
		// ▶ 1111 -> 순서가 없지 안에는 마구잡이로 뽑히니 걍 한번만 나온다.
		// ▶▶ 네번째  1111  두번째 -> size() 도 3개로 나옴 ㄷㄷ..
		//    4개를 넣는데 말이다... (중복값 검사가 필요없다.) 이걸 쓰면 말이다.
		//    ex) 로또뽑기 - 랜덤수 중복 안되게 뽑기
		//    순서가 있다. (선형) -> 우리눈에는 순서가 없어보이지만, 컴퓨터는 순서가 있다.
//		set.add(1111);
//		set.add("두번째");
//		set.add(1111);
//		set.add("네번째");
		
		// .TreeSet()
		// 오름차순이 된다.
		set.add("A");
		set.add(new Ex10()); 
		set.add(1111);
		set.add("b");
		set.add("c");
		set.add("D");
		
		System.out.println("size : " + set.size());
		
		// 열람만 가능
		// set을 통해서 객체를 받아온거라 새객체여서 수정해도
		// 위에서 수정이 불가
		java.util.Iterator ite = set.iterator();
		
		// 가르킬게 있는지 체크여부 ▶ .hasNext()
		while(ite.hasNext()){
			// 값 확인 ▶ .next()
			System.out.println(ite.next());
		}
		
		// 새롭게 가르키고 싶다면 새객체 찍으면 됨.
//		java.util.Iterator ite2 = set.iterator();
//		
//		while(ite2.hasNext()){
//			System.out.println(ite2.next());
//		}
		/*
		System.out.println(ite.hasNext());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		*/
	}

}

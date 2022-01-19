package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class StringBuffer
		
		// StringBuffer 자기 자신도 같이 바뀌어 버림
		// 새로운객체를 만드는 것이 아닌 자기 자신이 바뀌어버림 (재사용)
		// 메모리 효율 - 다만 중간코드를 보면서 체크해 가면서 써야 한다.
		
		// 반면 String하면 더한 새로운 객체를 만들고, 자기자신은 그대로 있고,
		// 취할때마다 새로운 객체를 찍어냄
		// 자원적인 측면으로 보면 자원낭비
		String msg1 = "java";
		StringBuffer msg2 = new StringBuffer ("java");
		System.out.println(msg2);
//		StringBuffer msg3 = msg2+"Web"; // 오류
//		String msg3 = msg2+"Web";
		
		String msg5 = msg1.concat("Web");
		System.out.println(msg5);
		System.out.println(msg1);
		System.out.println("----------------------------------");
		
		StringBuffer msg3 = msg2.append("Web");
		System.out.println(msg3);
		System.out.println(msg2); // msg2 도 같이 바뀜.
		
		System.out.println("----------------------------------");
		
		// 노 캐릭터라서 아무것도 안나온다.
		// 디폴트가 16 - 16만큼은 무조건 확보함
		StringBuffer msg6 = new StringBuffer(5); // 5개의 공간 선언 (안주면 16디폴트)
		for(int i=0; i<13; i++){ // 5자까지는 들어감 // 6자부터는 안들어가니까 버퍼의 양을 늘림 // 12개까지 들어가다가 // 13에서 또 늘림 26
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		// 5개의 공간이 늘어나면
		// 6번째부터는 6*2 =12 
		// 13번째부터는 13*2 = 26
		// 27번째부터는 26*2 = 52
		// ...
		
		// 글자를 주면 + 16
		// abc + 16
		
		// .trimToSize() 
		// 비어있는 버퍼의 양을 잘라버림
		// 뒤에 남아있는 버퍼는 싸그리 날려버림
		// 14에서 잘리면 다음에 늘리면 그 배수임
		// 더 이상 커지지 않을때 
		msg6.trimToSize();
		System.out.println(msg6.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.hi;

public class Ex10 implements Runnable{

	// 여기도 static해야함 (non-static은 객체마다 가지고 있으니까 : 객체마다 키를 가지고 있는꼴)
	// ▶ 별도의 키를 만듬
	static Object key = new Object();
	
	static int tot;
	int startnum;
	int endnum;
	
	public Ex10(int a, int b){ //생성자
		startnum = a;
		endnum = b;
	}
	
//	// 메서드 동기화 - 하나의 스레드가 점유하는 동안은 다른 쓰레드에서는 진입못함
	// 키 값을 못쓰니 static씀 (안쓰면 각각의 키니까 안됨)
	// static은 객체가 아니라 공간이니까. (=static객체의 this로 가지고 들어감)
//	public static synchronized void work(int i){ // synchronized ▶ 메서드 동기화
//		// 사용하고 있는 동안 이 메서드를 실행못하게 함
//		// 하나의 쓰레드가 점유하는 동안은 다른 쓰레드에서는 진입못함
//		// 이 두개가 한번에 실행되는 보장을 받는다.
//		// 문제가 되는 이것만 싱크로나이즈 함.
//		// 서로 번갈아가면서 일을 할 수 있는 상황이 됨.
//		int sum = tot + i;
//		tot = sum;
//	}
//	
//	public void hap(){ 
//		for(int i=startnum; i<=endnum; i++){
//			// ▶ 동기화 문제
//			// 여기서 한세트로 이뤄져야함
//			// tot += i; 해도 문제는 생김
//			
//			// 쓰레드가 하나가 다 끝나야
//			// 다음 쓰래드 들어올 수 있다.
//			//// int sum = tot + i;
//			//// tot = sum;
//			
//			
//			// 여기는 쓰래드 다 들어올 수 있다.
//			work(i);
//			// i 매개변수 전달
//		}
//	}
// ---------------------------------------------------------------------------------	
	
	// ▶ 동기화 블록
	public void hap(){
		for(int i=startnum; i<=endnum; i++){
			// ------ 못들어오고 대기 ---------
			// 내가 동기화 하고자 하는 부분만 싱크로나이즈 함.
			// 특정 코드 부분만 동기화
			// ▶▶ "하나의 키" 를 가지고, 키를 열고 잠근다. -> 오브젝트를 만듬
			
			// 자바의 모든 클래스는 오브젝트를 갖고 있기때문
			// this는 안됨 -> 각각의 키
			synchronized(key){
				int sum = tot + i;
				tot = sum;
				// 나가면서 키 반납
			}
			
		}
	}
	
	// 런에이블
	@Override
	public void run() {
		hap();
		
	}


	public static void main(String[] args) {
		// 쓰레드 문제상황 (자바 쓰레드 동기화)
		// ▶▶ 두개이상의 쓰래드가 하나의 객체에 접근할 때 생기는 문제
		
		// Ex10 me = new Ex10();
		// 1~100까지 합
		// me.hap(1,100);
		// System.out.println(me.tot);
		

		// 2개의 쓰래드가 병렬로 일을 시킬것임
		// 1~50 쓰레드가 일을함
		// 51~100 다른 쓰레드가 일을함
		//// me.startnum = 1;
		//// me.endnum = 50;
		//// Thread thr1 = new Thread(new Ex10(1, 50));
		
		/// 범위가 크니까 연산이 틀리게 나옴 // 50005000 맞는값임
		//  ▶ 동기화 문제임!
		Thread thr1 = new Thread(new Ex10(1, 5000));
		
		//// me.startnum = 51;
		//// me.endnum = 100;
		//// Thread thr2 = new Thread(new Ex10(51,100));
		Thread thr2 = new Thread(new Ex10(5001,10000));
		
		thr1.start();
		thr2.start();
		
		// 메인도 쓰래드기때문에
		// 메인만 하고 0하고 끝남
		// 조인시키고 메인 끝내야함
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tot);

	}







}

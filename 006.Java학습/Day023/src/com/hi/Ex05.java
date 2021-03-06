package com.hi;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		
		// 쓰래드 우선순위 (확률제어)
		Ex05 thr1 = new Ex05();
		Ex05 thr2 = new Ex05();
		Ex05 thr3 = new Ex05();
		
		// 확률 (표본집단을 늘려줄수록 차이가 보임 : 수행횟수) 몇배만큼 더 수행하지 않는다.
		// 수행할 확률이 높구나 낮구나만 비교할 것.
		// thread 우선순위 1~10 / default = 5 
		// (숫자가 높을수로 우선순위 높고, 낮을수록 우선순위 낮다.)
		// 우선순위 바꿔봄
		// thr1.setPriority(1);
		// thr2.setPriority(5);
		// thr3.setPriority(10);
		thr1.setPriority(Thread.MIN_PRIORITY);  // 1
		thr2.setPriority(Thread.NORM_PRIORITY); // 5
		thr3.setPriority(Thread.MAX_PRIORITY);  // 10

		
		thr1.start();
		thr2.start();
		thr3.start();
		
	}

	@Override
	public void run() {
		
		// 우선순위는 동일한 순위를 가지고 있다.
		int su = this.getPriority();
		
		// 수행의 횟수
		// 쓰래드 출력하는 순서를 보면, 막 다르다는걸 알 수 있다.
		for(int i=0; i<10; i++){
			System.out.println(su + getName() + "run..." + i);
		}
	}
}

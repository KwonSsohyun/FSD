package com.hi;

import java.util.Random;

import javax.swing.JButton;

//연결 ▶ Ex10

public class Ex14 extends Ex10 implements Runnable{
	
	public Ex14(){
		// System.out.println("Ex14");
		
		// Random rand = new Random();  
		// int iValue = rand.nextInt(10);  // 0 <= iValue < 10
//		Random random = new Random();
//		int ran = random.nextInt(16)+1;
//		System.out.println(ran);
		
		
	}

	public static void main(String[] args) {
		Ex14 me2 = new Ex14();
		Thread th = new Thread();
		th.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			Random random = new Random();
			int ran = random.nextInt(16)+1;
			dudu[i] = new JButton("두더지 잡아랏!"+i);
		}
		
	}

}

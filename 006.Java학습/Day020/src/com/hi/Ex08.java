// 문서에 대한 정의
package com.hi;

// 클래스는 여기다.
import java.awt.Frame;
import java.util.Scanner;

public class Ex08{
	
	public static void main(String[] args) {
		
		Frame f = new Frame("권토팔의 여행");
		// 생성자를 통해서도 창 이름 적을 수도 있따.
		
		// 창의 이름
		// f.setTitle("권토팔의 여행");
		
		f.setLocation(200,200);
		// f.setLocation(200-1920,200);
		f.setSize(300,300);
		f.setVisible(true);
		
		// 값을 확인할 수도 있다.
		System.out.println(f.getWidth() + "," + f.getHeight());
		System.out.println(f.isVisible());
		
		Scanner sc = new Scanner(System.in);
		// 여기서 "야옹이의 하루" 적고
		String msg = sc.nextLine();
		System.out.println(f.getWidth() + "," + f.getHeight());
		System.out.println(f.getX() + "," + f.getY());
		// 창 이름이 바뀐걸 볼 수 있다.
		f.setTitle(msg);
	}

}

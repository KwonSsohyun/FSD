
public class Ex04구구단 {
	public static void main(String[] agrs) {

//		for(int dan = 2; dan <= 9 ; dan++) {
//			for(int su = 1; su <= 9 ; su++) {
//				System.out.println(dan + "x" + su + "=" + (dan*su));
//			}
//			System.out.println();
//		}

		
		int dan = 2; // 처음 배정
		while(dan <= 9) {
			int su = 1; // 아래 while문 입장에서는 상위개념이라 su를 쓸 수 있다.
			while(su <= 9) {
				System.out.println(dan + "x" + su + "=" + (dan*su));
				su++; // su가 증가 되서 16번 라인 su로 올라감 (9까지 곱해지고)
			}
			dan++; // 2단... 3단.... 올라감 수가 증가되서 14번 라인으로 올라감
		}
		
		
	}
}

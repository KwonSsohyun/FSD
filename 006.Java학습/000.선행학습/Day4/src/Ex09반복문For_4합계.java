import java.util.Scanner;

public class Ex09반복문For_4합계 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int start = scan.nextInt();
		
		System.out.println("두번째 정수 : ");
		int finish = scan.nextInt();
		
		if(start > finish) {
			int tmp;
			
			tmp = start;
			start = finish;
			finish = tmp;
		}
		
		int sum = 0; // 초기값을 줘야한다. (안그러면 메모리에 쓰래기값들어가서 오류가 날 수있다.)
		
		for(int i = start; i <= finish; i++) {
			sum += i; // sum = sum + i; ▶ 스타트와 피니시 사이의 숫자들이 i이고, sum에 누적시킨다.
		}
		
		System.out.println(start + "부터" + finish + "까지의 합 =" + sum);// 최종결과물 sum (백지상태에서 누적)
	}
}

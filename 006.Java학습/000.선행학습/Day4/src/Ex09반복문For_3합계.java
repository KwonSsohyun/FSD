
public class Ex09반복문For_3합계 {
	public static void main(String[] args) {
		// 1~10 까지의 정수의 합계를 계산하여 결과(55)를 출력.
		
		int sum = 0;
		
		for(int i = 1 ; i <= 10; i++) {
			sum += i; // sum = sum + i; ▶ 1~9의 값이 i에 들어가서, sum에 누적시킨다.
			System.out.println("sum = " + sum + ", i =" + i);
		}
		
		System.out.println("1~10까지의 합 = " + sum);
		
	}
}

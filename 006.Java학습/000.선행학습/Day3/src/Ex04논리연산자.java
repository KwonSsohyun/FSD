
public class Ex04논리연산자 {
	public static void main(String[] args) {
		System.out.println(3 > 4); // false
		System.out.println(3 < 4); // true
		System.out.println(3 > 4 && 3 < 4); // false (처음이 거짓이면, 걍 뒤에가 진실이어도 거짓)
		
		
		
		// 100이 짝수냐? -> true
		System.out.println(100%2==0); // %2==0 (짝수냐?) %2==1(홀수냐?) ▶ %(나눗셈의 나머지)
		
		
		System.out.println(3 < 4 && 100%2==0); // true (둘다 트루면 트루임)
	}
}

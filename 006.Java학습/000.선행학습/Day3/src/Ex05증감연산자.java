
public class Ex05증감연산자 {
	public static void main(String[] args) {
		int i =5, j = 0;
		
		// 더하기가 뒤에 있으면, 뒤에서 한다!!!
		j = i++; // 후의 연산자 ▶ i = 6, j=5
		System.out.println("j = i++; 실행 후 : i = " + i + 
				", j=" + j);
		
		i = 5; j = 0;
		j = ++i; // 전의 연산자 (먼저 1더해서 넘겨줘라) ▶ i = 6, j=6
		System.out.println("j = i++; 실행 후 : i = " + i + 
				", j=" + j);
		
		i = 100;
		System.out.println(i++); // 100 (i만 우선 출력하고, 더하기는 다음에 함!)
		System.out.println(i); // 101
	}
}

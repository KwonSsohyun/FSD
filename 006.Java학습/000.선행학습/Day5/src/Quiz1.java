
public class Quiz1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i =1 ; i <= 20; i++) {
			
			if(i%2 != 0 && i%3 != 0) {  // i%2 ▶ 2의 배수(2로 나눴을때 남는거없음)  i%3 ▶ 3의 배수 (%나눗셈의 나머지 활용)
				System.out.print(i + " + ");
				sum += i;
			}
		}
		System.out.println((char)8 + (char)8 + "=" + sum);	// ("= "+sum)
		// 아스키코드 형변환 (char)8 해서 줘야한다. 아스키코드 8번은 Backspace 이다.
	}

}

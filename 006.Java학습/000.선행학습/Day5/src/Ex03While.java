import java.util.Scanner;

public class Ex03While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; // 누적하려고 sum 만듬 그리고 초기값 0준다. (쓰래기값 없애기 위해)
		
		System.out.println("첫 번째 정수 : ");
		int startNum = scan.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int finishNum = scan.nextInt();
		
		// 루프제어변수 -> 값이 서로 작거나 커도 문제없게 하려고
		int i = startNum;
		// if(startNum > finishNum) 
			// 맞바꾸는 코드
			// int tmp = 
	
		while(i <= finishNum) {
			sum += i;
			i++;
		}
		System.out.println(startNum + "부터" + finishNum + "까지의 합 = " + sum );
	}

}

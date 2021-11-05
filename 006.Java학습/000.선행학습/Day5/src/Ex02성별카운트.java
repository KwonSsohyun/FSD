import java.util.Scanner;

public class Ex02성별카운트 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		
		int m = 0, f = 0; // 여자, 남자 0값 초기화 (쓰래기값 방지)
		int gender;
		
		do {
			System.out.print("성별을 선택하세요.(남=1, 여=2) : "); // 맨 처음에 입력을 받아야 하니까 do while로 쓴다. (무조건 처음은 나오니까)
			gender = inData.nextInt();
			if(gender == 1) ++m; // m++ 이나 ++m 이나 여기선 단독이라 상관없다. 단, 변수로 넘어가거나 함수일때 m++ 이면 처음에는 합 집계 안되고, 다음부터 집계됨
			else if(gender == 2) ++f;
			
		} while(gender != 0); // 0이 아니면 계속 돌아라.
		
		System.out.println("남 : " + m + ", 여 : " + f); // do while안에 넣으면 실시간으로 계속 찍히는데 나는 최종적으로 집계만 볼거니까 밖에 찍는다.

		System.out.println("프로그램 종료!");
	}
}

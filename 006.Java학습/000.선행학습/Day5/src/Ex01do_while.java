import java.util.Scanner;

public class Ex01do_while {

	public static void main(String[] args) {
		// 키보드로 짝수만 입력.
		Scanner evenNum = new Scanner(System.in);
		
		int even, errCnt = 0; //변수 2개 선언함
		
		do {
			System.out.print("짝수만 입력하세요. :"); // 여기는 그냥 콘솔창에 보이고
			even = evenNum.nextInt(); // 사용자가 콘솔에 적고
			
			if(even % 2 == 1 && errCnt == 0) { // 사용자가 홀수를 입력하면~ + 홀수를 입력한 적이 한번도 없다. = 이 두경우가 모두 만족할때 if문 들어옴
				System.out.println("짝수만 입력하라니까!!!"); // Syso 단축어
				System.out.println("한번만 봐줄거야!");
				
				errCnt++; // 1이됬다. 왜이렇게 한거냐면 1번이 됬기때문에 상단에 errCnt == 0 이제 안들어오죠.
				// 왜냐하면 난 한번만 기회를 줄거기 때문에 if문은 한번만 가동시킴
				
				even = 0; // 0을 준 이유는 한번만 봐줄거야라고 했기때문에 0을 강제로 입력해서 짝수로 입력한것처럼 해서 위로 올라가게 하기위함.
				// 그래서 System.out.print("짝수만 입력하세요. :"); 다시 나온거임
			}
			
		} while(even%2==0); // 사용자가 적은값이 짝수일때, do while문 계속 반복
		
		System.out.println("프로그램 종료.");
	}

}

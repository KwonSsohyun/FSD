import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 행 으로 출력하시겠습니까 숫자만 입력해주세요 : ");
		int num = scan.nextInt();
		int cnt = 0;		
		
		for(int i=num; i>=0; i--) { // 전체적 포문 (빈칸에 대한 기준 num)
			for(int x = 0 ; x <= i-1; x++) { // 빈칸 (맨처음 첫줄 >> 사용자값 -1 = 공백수)
				System.out.print('값');
			}
			
			for(int y = 0 ; y < cnt ; y++) {
				System.out.print('*');
			}
			cnt++;
			
			System.out.println(' ');
		}			
	}
}


public class Ex01다른진수 {
	public static void main (String args[]) {
		int octNum = 010; // 10진수로는 8의 의미를 가진다.
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("%d, %d, %d\n", octNum, hexNum, binNum); // printf 문자열출력 
		// 각각 대행하고 맨 마지막 개행한다. octNum>%d  hexNum>%d  binNum>%d\n 각각 문자열로 출력 (끝에 \n이 있어서 개행)
	}
}

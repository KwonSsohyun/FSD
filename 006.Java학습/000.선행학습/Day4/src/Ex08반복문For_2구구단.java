import java.util.Scanner;

public class Ex08반복문For_2구구단 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 단? : ");
		int dan = scan.nextInt();
		
		for(int su = 1; su <= 9 ; su++) {
			System.out.println(dan + "x" + su + "=" + (dan * su));
		}

		
	}
}

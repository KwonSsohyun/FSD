import java.util.Scanner;

public class Ex08�ݺ���For_2������ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ��? : ");
		int dan = scan.nextInt();
		
		for(int su = 1; su <= 9 ; su++) {
			System.out.println(dan + "x" + su + "=" + (dan * su));
		}

		
	}
}

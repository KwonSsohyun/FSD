import java.util.Scanner;

public class Ex02�հݿ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int score = scan.nextInt();
		
		if(score >= 60)
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ��Դϴ�.");
	}
}

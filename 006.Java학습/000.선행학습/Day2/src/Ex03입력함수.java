import java.util.Scanner;

public class Ex03�Է��Լ� {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); // nextLine(), nextlnt(), nextDouble() ȣ���ؼ� ������
		
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		
		System.out.print("���ڿ� �Է� : ");
		String str = scan.nextLine();
		
		System.out.println(num);
		System.out.println(str);
	}
}

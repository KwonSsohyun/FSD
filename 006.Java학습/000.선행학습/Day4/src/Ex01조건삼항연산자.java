import java.util.Scanner;

public class Ex01���ǻ��׿����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = scan.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = scan.nextInt();
		
		// int max = num1 > num2 ? num1 : num2; >> ���׿�����
		
		int max;
		if(num1 > num2) max = num1;
		else max = num2;
		
		System.out.println("ū �� : " + max);

	}

}

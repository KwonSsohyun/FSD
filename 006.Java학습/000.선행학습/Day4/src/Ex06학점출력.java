import java.util.Scanner;

public class Ex06������� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���. : ");
		int score = scan.nextInt();
		
		switch (score/10) { // �� /10 ������ �� �Ѵ� int �����̱� ������ ����� �Ҽ����� �ƴ� ������ ���´�. 97��10 = 9
		// �̷��� ������ ������ 97���̰�, 95���̰� 9������ ������ �Ǳ⶧��
		    case 10 : // 100���� 9������ �ڿ������� ���Եǰ��Ϸ���, break�� �Ⱦ���. �׷��� ������ ���ԵǴϱ�
			case 9 : 
				System.out.println("A����");
				break;
				
			case 8 :
				System.out.println("B����");
				break;
				
			case 7 :
				System.out.println("B����");
				break;
				
			case 6 :
				System.out.println("B����");
				break;
				
			default :
				System.out.println("F����");
				break;
				
		
		}
		
		
	}
}

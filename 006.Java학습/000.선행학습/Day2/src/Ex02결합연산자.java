
public class Ex02���տ����� {
	public static void main (String[] args) {
		String name = "ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + " ");// " " ��ĭ
		System.out.println(" " + 7);
		System.out.println(7 + ""); // ascii(����Ű�ڵ�) 0�����ڴ� null�� �ǹ� "" > �̰� �ƹ��͵� ���¹���
		// "" �� null�� �ǹ��Ѵ�. === (7 + null); �ٵ� �̷��� ������ ������ �ȵ�. �ܵ��̸� null�� �����
		
		System.out.println("" + 7);
		System.out.println("" + ""); // �� �ƹ��͵� ���� println�̶� ���ุ �Ͼ
		
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7); // 77�̶�� ������� ���´�. 
		// "" �ƹ��͵� ���� ���ڿ� 7�� ������ ���ڰ� �ǰ�, �ű� �ڿ� 7�� ������ "���տ�����"��
	}
}

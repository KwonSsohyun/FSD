package com.hi;

class Ball{
	//�� ��ȣ�� �ٲ��� �ʱ� ���� private
	private final int num; // �� �� �ٲٰ� �Ϸ��� private
	boolean marking; // �� ������ ��ŷ��
	String color;
	
	// �ֳ�? �����ڼ����� �߱� ������, �ڵ��⺻�����ڰ� ��������� �ʴ´�.
	public Ball(int num){
		this.num = num;
		marking = true; // �̾Ҵ� ���� false�� �ٲܰ���
		if(num<10){
			color = "�����";
		}else if(num<20){
			color = "�Ķ���";
		}else if(num<30){
			color = "������";
		}else if(num<40){
			color = "�ʷϻ�";
		}else{
			color = "������";
		}
	}
	int showNum(){ //  private �ؼ�
		return num;
	}
	
}

public class Ex12 {

	public static void main(String[] args) {
		String[] note = new String[6]; // ���� ���� ��ȣ�� ���� ��Ʈ
	      // note-> 6���� ������ ���� �迭��ü
	      // note[0]->null
		Ball[] box = new Ball[45]; //��ü�迭 45�� ���� (45���� ���� �� �ִ� ����)
		
		for(int i=0; i<box.length; i++){ //������ ������ŭ ��ü�� ����
			box[i] = new Ball(i+1); //�������� ���� 
			// (i+1) �Ű������� ��������� �Ǵ� �������̱� ������ 
			// Ÿ���� �����ذŴ�.
		}
		
		for(int i=0; i<note.length; i++){
			// ���� ������
			int ran = (int)(Math.random()*45); 
			// Ball ball; ->> �ӽ÷� ��� ������ ������ �ѰŰ�
			Ball ball = box[ran];
			// ���������ϱ� box[ranNum] �� �ش� ����Ű�� �ּҰ��� ball������ ��Ҵ�.
	        // ->> ball = box[ranNum];
			
			// Ȯ��
			// ���� ������ �Ȼ��� ������ Ȯ��
			// ���ϰ� ball���� ���.
			if(ball.marking){
				// �Ȼ̾Ҵ� ���� note�� �ۼ�
				// marking
				note[i] = ball.color+"�� "+ball.showNum();
				ball.marking = false;
			}else{
				// �̾Ҵ� ���� note--;
				i--; // ���̳ʽ� ������ ���������Ǽ� ���� i++������ ������.
				// ���� i�� 1�� ���µ�
				// i-- ������ 0�� �ǰ�
				// ���� ������ ������ i++�Ǽ� �ٽ� 1�� �ȴ�.
			}
		
		}
		
		// ����غ��� �ڵ�
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}

	}

}

package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		
		String bar = "----------------------------------------------------------------";
		// String msg = "";
		int kor, eng, math, sum;
		double avg;
		
		kor = 96;
		eng = 84;
		math = 72;
		sum = kor+eng+math;
		avg = sum*100/3/100.0;
		
		// (�ü�� �δ� ����������)
		// String ���ڿ� �ڷ��� : �ѹ��� ����ϱ� ���ؼ� ����. (�ü���� ��û�ϱ� ������ ���������ٴ� �ѹ��� ��û�ϴ°��� ����)
		String msg = bar + "\n���� : " + kor + "\t| ���� : " + eng + "\t| ���� : " + math + "\n";
		msg += bar + "\n�հ� : " + sum + "\n��� : " + avg + "\t(�Ҽ���°���� ���)\n" + bar + "\n���� : ";		
		
		int su = (int)avg/10; // ��հ��� 10�� �ڸ� ����
		
		if(su == 10 || su == 9){
			msg += "A"; // msg = msg + "A";
		}
		else if(su == 8){
			msg += "B"; // msg = msg + "B";
		}
		else if(su == 7){
			msg += "C"; // msg = msg + "C";
		}
		else if(su == 6){
			msg += "D"; // msg = msg + "D";
		}
		else{
			msg += "F"; // msg = msg + "F";
		}
		msg += "����";
		
		System.out.println(msg); // �ѹ��� ����ϴϱ� ��ǻ�� ���忡���� �δ��� ���ȴ�. �׷��� String(���ڿ�) Ÿ���� ����.
        
	}

}

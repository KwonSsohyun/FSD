package com.room802;

public class Ex07 {

	public static void main(String[] args) {
		
		// Q4. 1+3+5+7+9�� �հ踦 ����Ͻÿ�.
		int sum = 0;
		
		for(int i = 1; i <10; i+=2){
				sum+=i;
				if(i!=1){System.out.print('+');} // �� �տ��� +�� ������ �ȵǱ� ������, �������� �ƴϸ��̶�� ���ǽ��� ����
				System.out.print(i);
		}
		
		System.out.print('=');
		System.out.println(sum);
		
		System.out.println("------------------------------------------------------");
		
		sum = 0;
		for(int i=1; i<=10; i++){

			if(i%2!=0){
				System.out.print(i);
				sum+=i;
			}
			else if(i!=10){
				System.out.print("+");
			}
			else{
				System.out.print("=");
			}
		}
		System.out.println(sum);
			
		System.out.println("------------------------------------------------------");
		
		String msg =""; // ���ڿ�
		System.out.println(msg);
		
		sum = 0;
		
		for(int i =1; i<10; i++){
			if(i%2!=0){
				msg += i;
				sum += i;
			}
			else{
				msg += '+';
			}
		}
		msg += "=";
		
		System.out.println(msg+sum);
	}

}



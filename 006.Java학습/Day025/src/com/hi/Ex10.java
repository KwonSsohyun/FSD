package com.hi;

public class Ex10 implements Runnable{

	// ���⵵ static�ؾ��� (non-static�� ��ü���� ������ �����ϱ� : ��ü���� Ű�� ������ �ִ²�)
	// �� ������ Ű�� ����
	static Object key = new Object();
	
	static int tot;
	int startnum;
	int endnum;
	
	public Ex10(int a, int b){ //������
		startnum = a;
		endnum = b;
	}
	
//	// �޼��� ����ȭ - �ϳ��� �����尡 �����ϴ� ������ �ٸ� �����忡���� ���Ը���
	// Ű ���� ������ static�� (�Ⱦ��� ������ Ű�ϱ� �ȵ�)
	// static�� ��ü�� �ƴ϶� �����̴ϱ�. (=static��ü�� this�� ������ ��)
//	public static synchronized void work(int i){ // synchronized �� �޼��� ����ȭ
//		// ����ϰ� �ִ� ���� �� �޼��带 ������ϰ� ��
//		// �ϳ��� �����尡 �����ϴ� ������ �ٸ� �����忡���� ���Ը���
//		// �� �ΰ��� �ѹ��� ����Ǵ� ������ �޴´�.
//		// ������ �Ǵ� �̰͸� ��ũ�γ����� ��.
//		// ���� �����ư��鼭 ���� �� �� �ִ� ��Ȳ�� ��.
//		int sum = tot + i;
//		tot = sum;
//	}
//	
//	public void hap(){ 
//		for(int i=startnum; i<=endnum; i++){
//			// �� ����ȭ ����
//			// ���⼭ �Ѽ�Ʈ�� �̷�������
//			// tot += i; �ص� ������ ����
//			
//			// �����尡 �ϳ��� �� ������
//			// ���� ������ ���� �� �ִ�.
//			//// int sum = tot + i;
//			//// tot = sum;
//			
//			
//			// ����� ������ �� ���� �� �ִ�.
//			work(i);
//			// i �Ű����� ����
//		}
//	}
// ---------------------------------------------------------------------------------	
	
	// �� ����ȭ ���
	public void hap(){
		for(int i=startnum; i<=endnum; i++){
			// ------ �������� ��� ---------
			// ���� ����ȭ �ϰ��� �ϴ� �κи� ��ũ�γ����� ��.
			// Ư�� �ڵ� �κи� ����ȭ
			// ���� "�ϳ��� Ű" �� ������, Ű�� ���� ��ٴ�. -> ������Ʈ�� ����
			
			// �ڹ��� ��� Ŭ������ ������Ʈ�� ���� �ֱ⶧��
			// this�� �ȵ� -> ������ Ű
			synchronized(key){
				int sum = tot + i;
				tot = sum;
				// �����鼭 Ű �ݳ�
			}
			
		}
	}
	
	// �����̺�
	@Override
	public void run() {
		hap();
		
	}


	public static void main(String[] args) {
		// ������ ������Ȳ (�ڹ� ������ ����ȭ)
		// ���� �ΰ��̻��� �����尡 �ϳ��� ��ü�� ������ �� ����� ����
		
		// Ex10 me = new Ex10();
		// 1~100���� ��
		// me.hap(1,100);
		// System.out.println(me.tot);
		

		// 2���� �����尡 ���ķ� ���� ��ų����
		// 1~50 �����尡 ������
		// 51~100 �ٸ� �����尡 ������
		//// me.startnum = 1;
		//// me.endnum = 50;
		//// Thread thr1 = new Thread(new Ex10(1, 50));
		
		/// ������ ũ�ϱ� ������ Ʋ���� ���� // 50005000 �´°���
		//  �� ����ȭ ������!
		Thread thr1 = new Thread(new Ex10(1, 5000));
		
		//// me.startnum = 51;
		//// me.endnum = 100;
		//// Thread thr2 = new Thread(new Ex10(51,100));
		Thread thr2 = new Thread(new Ex10(5001,10000));
		
		thr1.start();
		thr2.start();
		
		// ���ε� ������⶧����
		// ���θ� �ϰ� 0�ϰ� ����
		// ���ν�Ű�� ���� ��������
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tot);

	}







}

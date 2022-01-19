package com.hi;
class WorkObject { 
	public synchronized void methodA() { 
		System.out.println("ThreadA�� methodA() �۾� ����"); 
		notify(); // �Ͻ����� ���¿� �ִ� ThreadB�� ���� �����·� ���� 
		try { 
			wait(); // ThreadA�� �Ͻ� ���� ���·� ���� 
		} catch (InterruptedException e) { 
			// �� Ʈ���� ĳġ(try | catch (InterruptedException e)) ȣ���ϴ� ���� 
			//   �� �ش� �޼��� ��ũ�γ��̵�(synchronized) �ؾ���
			e.printStackTrace(); 
		} 
	} 
	public synchronized void methodB() { 
		System.out.println("ThreadB�� methodB() �۾� ����"); 
		notify(); // �Ͻ����� ���¿� �ִ� ThreadA�� ���� �����·� ���� 
		try { 
			wait(); // ThreadB�� �Ͻ� ���� ���·� ���� 
		} catch (InterruptedException e) { 
			// �� Ʈ���� ĳġ���� �� (InterruptedException e) ȣ���ϴ� ���� �� �޼��� ��ũ�γ��̵�(synchronized) �ؾ���
				e.printStackTrace(); 
		} 
	}
}	
class ThreadA extends Thread{ 
		private WorkObject workObject; 
		
		public ThreadA(WorkObject workObject) { 
			this.workObject = workObject; 
			} 
		public void run() { 
			for(int i=0; i<10; i++) { 
				workObject.methodA(); // ������ü�� methodA�� �ݺ������� ȣ�� 
			} 
		}
}
class ThreadB extends Thread{ 
		private WorkObject workObject;
		
		public ThreadB(WorkObject workObject) { 
			this.workObject = workObject; 
		} 
		public void run() { 
			for(int i=0; i<10; i++) { 
				workObject.methodB(); // ������ü�� methodA�� �ݺ������� ȣ�� 
			} 
		}
}

public class Ex13 {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); 
		ThreadA threadA = new ThreadA(sharedObject); 
		ThreadB threadB = new ThreadB(sharedObject); 
		threadA.start(); 
		threadB.start();

	}

}

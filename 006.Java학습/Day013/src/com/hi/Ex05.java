package com.hi;

// �������̽��� Ŭ������ �ƴϴ�. (���� ������ �����ڵ� ����, �޼ҵ弱�� ������, ������ ���ϴ� ��ü�� ����)
// ���߻�� ������ ���°� �������̽� ����
interface Inter02{
	void func01();
}

interface Inter03 extends Inter02, Inter04{ // Inter02, Inter04 ���� ��ӹ��� (���⼭�� extends) ����.
	
}

interface Inter04{}

// ���߻���� ȿ�� �� �� �ִ�.
// �������̽��� Ŭ������ �ƴϹǷ� ���߻�� ���� >> implements Inter02, Inter03 
public class Ex05 extends Ex01 implements Inter04 { // extends Ex01 (���) // implements Inter02 (�������̽�Ÿ�� ���)���÷���Ʈ��
	
//	public void func02(Ex05 me){}
//	public void func02(Object me){} // �ȸ������ ���ϱ����� Object �� ������ �ִ�.
	public void func02(Inter04 me){} // �������� ���� �Ű������� ���������� ��ӹ޾Ƽ� �޾ƺ� �� �ְ� ���.
	// Inter04 ��ӹ��� �͵鸸 �޾ƺ� �� �ְ� ���. (�����ϰ� ������ �� �ְ� ���.)
	
	public void func01(){System.out.println("����");} 
	// abstract ������ �ȵȴ�. ������ �����ϱ�. {} 
	// ������ ������ abstract ������.(�߻�)

	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
		me.func01();
		me.func02(me);
		
		Inter02 you = null;
//		you.func01();
		
		Inter04 you1 = new Ex05();
		

	}

}
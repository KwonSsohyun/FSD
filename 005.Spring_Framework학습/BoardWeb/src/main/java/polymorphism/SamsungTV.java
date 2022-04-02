package polymorphism;

public class SamsungTV implements TV {
	
	// public int a;
	// public String s;
	
	/*
	 * public void initMethod() { System.out.println("��ü �ʱ�ȭ �۾� ó��.."); }
	 * 
	 * public void destroyMethod() { System.out.println("��ü ���� ���� ó���� ����.."); }
	 */
	
	// private SonySpeaker speaker;
	// �ɹ��ʵ�
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	
	// ��ü ���� - ��Ӱ��� ������� �Ѵ�.
	// Speaker speaker = new SonySpeaker();
	// Speaker speaker = new AppleSpeaker();
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
	}
	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println("==> SamsungTV(3) ��ü ����");
//		this.speaker = speaker;
//		this.price = price;
//	}
	
	/*
	 * public SamsungTV(int price, SonySpeaker speaker) {
	 * System.out.println("==> SamsungTV(4) ��ü ����"); this.speaker = speaker;
	 * this.price = price; }
	 */
	
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : "+ price + ")");
	}
	
//	public void powerOn() {
//		System.out.println("SamsungTV---���� �Ҵ�.");
//	}
	
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	
	public void volumeUp() {
		// speaker = new SonySpeaker();
		speaker.volumeUp();
		// System.out.println("SamsungTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		// speaker = new SonySpeaker();
		speaker.volumeDown();
		// System.out.println("SamsungTV---�Ҹ� ������.");
	}
	

}

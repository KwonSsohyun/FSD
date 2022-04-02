package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component - �⺻ �̸�  lgTV 
// @Component 
@Component("tv")
public class LgTV implements TV{
	
	// @Autowired
	// private Speaker speaker;
	
	// @Autowired @Qualifier("apple")
	@Resource(name="apple")
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LGTV---���� �Ҵ�.");
	}
	
	public void powerOff() {
		System.out.println("LGTV---���� ����.");
	}
	
	public void volumeUp() {
		System.out.println("LGTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		System.out.println("LGTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
}

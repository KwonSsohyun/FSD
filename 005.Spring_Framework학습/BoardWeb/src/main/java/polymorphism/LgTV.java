package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component - 기본 이름  lgTV 
// @Component 
@Component("tv")
public class LgTV implements TV{
	
	// @Autowired
	// private Speaker speaker;
	
	// @Autowired @Qualifier("apple")
	@Resource(name="apple")
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LGTV---전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("LGTV---전원 끈다.");
	}
	
	public void volumeUp() {
		System.out.println("LGTV---소리 올린다.");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		System.out.println("LGTV---소리 내린다.");
		speaker.volumeDown();
	}
}

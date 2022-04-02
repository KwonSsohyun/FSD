package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("annotationContext.xml");
		
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup) �Ѵ�.
		// TV tv = (TV)factory.getBean("lgTV");
		TV tv = (TV)factory.getBean("tv");
		
		// TV tv1 = (TV)factory.getBean("tv");
		// TV tv2 = (TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		// 3. Spring �����̳� �����Ѵ�.
		factory.close();

		
		// TV tv = new LgTV();
		// TV tv = new SamsungTV();
		
		// BeanFactory factory = new BeanFactory();
		// TV tv = (TV)factory.getBean(args[0]);
		
		// tv.powerOn();
		// tv.volumeUp();
		// tv.volumeDown();
		// tv.powerOff();

		
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();

	}

}

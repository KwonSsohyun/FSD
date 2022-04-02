package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.ioc.injection.CollectionBean;

public class CollectionBeanClient { // 클라이언트 파일

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("collectionContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		// List<String> addressList = bean.getAddressList();
		// Set<String> addressList = bean.getAddressList();
		// Map<String, String> addressList = bean.getAddressList();
		Properties addressList = bean.getAddressList();
		
		
		
		// PROPERTIES 출력
		for(Object key : addressList.keySet()){
             System.out.println(key + " : " + addressList.getProperty((String)key));
        }

		
		
		/* MAP 출력
		for(String key : addressList.keySet()) {
			String value = (String) addressList.get(key);
			System.out.println(key + ":" + value);
		}
		*/
		
		
		
		/*
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		*/
		
		factory.close();

	}

}

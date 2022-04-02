package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.ioc.injection.CollectionBean;

public class CollectionBeanClient { // Ŭ���̾�Ʈ ����

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("collectionContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		// List<String> addressList = bean.getAddressList();
		// Set<String> addressList = bean.getAddressList();
		// Map<String, String> addressList = bean.getAddressList();
		Properties addressList = bean.getAddressList();
		
		
		
		// PROPERTIES ���
		for(Object key : addressList.keySet()){
             System.out.println(key + " : " + addressList.getProperty((String)key));
        }

		
		
		/* MAP ���
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

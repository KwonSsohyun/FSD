package com.springbook.ioc.injection;

// P.92-94 List
import java.util.List;

// p.94-96 Set
import java.util.Set;

// p.96-97 Map 
import java.util.Map;

// p.97-98 Properties
import java.util.Properties;


public class CollectionBean {
	
	// private List<String> addressList;
	// private Set<String> addressList;
	// private Map<String, String> addressList;
	private Properties addressList;
	
	
	/*******************  p.97-98 Properties *************************/
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	public Properties getAddressList(){
		return addressList;
	}
	
	
	
	/*******************  p.96-97 Map *************************
	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
	
	public Map<String, String> getAddressList(){
		return addressList;
	}
	*************************************************************/
	
	
	
	/*******************  p.94-96 Set *************************
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	
	// ╟ыем
	public Set<String> getAddressList(){
		return addressList;
	}
	*************************************************************/
	
	
	
	/*******************  P.92-94 List *************************
	// ╪бем
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	// ╟ыем
	public List<String> getAddressList(){
		return addressList;
	}
	*************************************************************/
	
	
}

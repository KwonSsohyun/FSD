package com.hi;

public class HiList {
	
	Object[] data = new Object[0];

		
		public void add(Object val){
			Object[] temp = new Object[data.length+1];
			System.arraycopy(data, 0, temp, 0, data.length);
			temp[temp.length-1] = val;
			data = temp;
		}
		
		public void remove(int idx){
			Object[] temp = new Object[data.length-1];
			// 앞에거 복사 (인덱스번호 기준)
			System.arraycopy(data, 0, temp, 0, idx);
			// 뒤에거 복사
			System.arraycopy(data, idx+1, temp, idx, temp.length-idx);
			data = temp;
			
		}

		public Object get(int idx){
			return data[idx];
		}
		
		public int size(){
			return data.length;
		}
	

}

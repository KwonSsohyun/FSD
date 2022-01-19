package com.hi;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) {
		String msg = "a,b,c,d,e";
		char num1 = msg.charAt(2);
		System.out.println(num1);
		System.out.println(msg.concat(",A,B,C"));
		System.out.println(msg + ",A,B,C");
		
		System.out.println(msg.concat(",A,B,C") == msg+",A,B,C");
		System.out.println(msg.concat("a, b, c, d, e,A,B,C") == "a, b, c, d, e"+",A,B,C");
		System.out.println(msg);
		
		// 새로운 문자열로 반환받음
		String result1 = msg.substring(2);
		System.out.println(result1);
		
//		String result2 = msg.substring(2, 5);
		String result2 = msg.substring(2, msg.length());
		System.out.println(result2);
		System.out.println(msg.subSequence(2, 5)); // 존재만 알아두세요.
		System.out.println(msg.replace("b,c", "B,C"));
		System.out.println(msg);
		System.out.println(msg.replace("b,c", ""));
		System.out.println(msg.replace("b,c", "b,c,B,C"));
		System.out.println(msg.replace(",", "@"));
        System.out.println(msg.contains("b,"));
        System.out.println(msg.indexOf("b,")); // 없으면 -1
       
        System.out.println(msg.startsWith("a,"));
        System.out.println(msg.startsWith("A,")); // 없으면 false
        
        // 없는 값까지도 뽑아내줌
        String[] arr = msg.split(",");
        System.out.println(Arrays.toString(arr));
        
        // 동적으로 없는 값은 빼줌
        StringTokenizer token = new StringTokenizer(msg,",");
        int cnt = token.countTokens();
        while(token.hasMoreTokens()){
        	System.out.println(token.nextToken());
        }
        
        // token = new StringTokenizer(msg,","); 한번 더 받아야 다음값 갱신해서 오류 안뜨고 받을 수 있다.
//        token = new StringTokenizer(msg,",");
//        for(int i=0; i<cnt; i++){
//        	// nextToken 다음값을 가르킴
//        	System.out.println(token.nextToken());
//        }
        
        String[] arr2 = new String[cnt];
        for(int i=0; i<cnt; i++){
        	arr2[i] = token.nextToken();
        }
        System.out.println(Arrays.toString(arr2));

	}

}

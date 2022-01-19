package com.hi;

public class Ex06 {
	// 객체배열을 더 선호한다. (각각 다른 여러형을 넣을 수 있어서)
	public int su;
	public String name;
	
	public Ex06(int su){
		this.su = su;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1 = new int[2]; // 2로 길이 바뀜
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[3]; // String 참조변수
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------------------------");
		
		Ex06 me1 = new Ex06(1111); // 객체를 생성하고
		Ex06 me2 = new Ex06(2222);
		Ex06 me3 = new Ex06(3333);
		
		Ex06[] arr3 = new Ex06[3]; // 객체주소 3개 받음 // 배열도 참조변수
		arr3[0] = new Ex06(1111); // 객체주소 전달
		arr3[1] = me2;
		arr3[2] = me3;
		
		for(int i=0; i<arr3.length; i++){
			Ex06 me = arr3[i];
			System.out.println(me.su);
		}
		
		System.out.println("-----------------------------------------------");
//		int[][][] arr6 = new int[2][3][4];  // ▶ 제어가 힘듬
//                             깊이 / 세로 / 가로
		
		// 다중배열은 2차원까지만 쓸것.
		int[][] arr4;
		arr4 = new int[3][2];  // (앞)arr4의 max / (뒤)값 엘리먼트의 max
		// 2개 길이 생김 int니까 최기값 0
		
//		arr4[0] = new int[]{1,2,7}; // 배열자체가 참조변수 - 주소값이 다르니까 길이가 달라져도 상관없다.
//		arr4[1] = new int[]{3,4};
//		arr4[2] = new int[]{5,6,8,9};
		
//		arr4[2][2] = 10; // 8이 10으로 바뀜
//		arr4[0][2] = 10; // 7이 10으로 바뀜
		
		for(int i=0; i<arr4.length; i++){ // [3] 앞에꺼 찍고
			for(int j=0; j<arr4[i].length; j++){ // []뒤에꺼 찍음
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

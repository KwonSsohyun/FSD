package com.hi;

public class Ex09 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Lotto2 lotto = new Lotto2();
		int cnt = 0;
		while(cnt < 6){
			arr[cnt] = lotto.output();
			for (int i = 0; i < 6; i ++){
				if(cnt == i) {
					continue; // 11번 -> 다시 내려옴.
				}
				if (arr[cnt] == arr[i]){
					cnt--; 
					break; // 20번 -> 8번 내려온다.
				}
			}
			cnt++;
		}
		System.out.print(arr[0]);
		System.out.print(" ");
		System.out.print(arr[1]);
		System.out.print(" ");
		System.out.print(arr[2]);
		System.out.print(" ");
		System.out.print(arr[3]);
		System.out.print(" ");
		System.out.print(arr[4]);
		System.out.print(" ");
		System.out.println(arr[5]);
		
		SortArray sa = new SortArray();
		arr = sa.sortingArray(arr);
		
		System.out.print(arr[0]);
		System.out.print(" ");
		System.out.print(arr[1]);
		System.out.print(" ");
		System.out.print(arr[2]);
		System.out.print(" ");
		System.out.print(arr[3]);
		System.out.print(" ");
		System.out.print(arr[4]);
		System.out.print(" ");
		System.out.println(arr[5]);
	}
}

class Lotto2{ 
	int output(){
		int su = (int)(Math.random()*10)+1;
		return su;
	}	
}

class SortArray{ 
	int temp = 0;
	int[]  sortingArray(int[] arr){
		for (int i = 0; i < arr.length-1; i ++){
			if(i == arr.length) break;
			
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				System.out.print(arr[i+1]);	
				System.out.println(arr[i]);
			}
		}
		return arr;
	}	
}

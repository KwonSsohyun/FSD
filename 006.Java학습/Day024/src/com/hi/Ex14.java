package com.hi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.8.0)
		// data.bin -> 여기다가 저장해라
		// 파일 디비 연동
		// 1.보기  2.입력  3.수정  4.삭제  0.종료  >
		// input → 학번, 이름 , 국어, 영어, 수학
		
		System.out.println("학생성적관리프로그램 (ver 0.8.0)");
		Scanner scan = new Scanner(System.in);
		int sc; 
		ArrayList<String[]> stu = new ArrayList<>();
		String[] stt;
		int index=0;
		
		
		
		File file = new File("data.bin");

		try {
			// if(!file.exists()){ file.createNewFile(); }
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
	
			for(int i=0; i<stu.size(); i++){
				for(int j=0; j<=4; j++){
					//stu.get(i)[j];
				}
			}
			//bw.write();
		
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
			
		while(true){
			
			try{
			
				System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
				sc = Integer.parseInt(scan.nextLine());
				
				if(sc == 1){ // 보기 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
					System.out.println("-------------------------------------");
					System.out.println("학번\t |이름\t |국어\t |영어\t |수학\t");
					System.out.println("-------------------------------------");
					for(int i=0; i<stu.size(); i++){
						String[] gab = stu.get(i);
						System.out.println(gab[0] +"\t"+ gab[1] +"\t"+ gab[2] +"\t"+ gab[3] +"\t"+ gab[4]);
					}
					System.out.println("-------------------------------------");
					
				} else if(sc == 2){ // 입력 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
					stt = new String[5];
	
					System.out.println("학번");
					stt[0] = scan.nextLine();
					
					System.out.println("이름");
					stt[1] = scan.nextLine();
					
					System.out.println("국어");
					stt[2] = scan.nextLine();
					
					System.out.println("영어");
					stt[3] = scan.nextLine();
					
					System.out.println("수학");
					stt[4] = scan.nextLine();
					
					stu.add(stt);
					
				} else if(sc == 3){ // 수정 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
					System.out.println("수정할 학번을 입력해주세요.");
					String sca = scan.nextLine();
					
					for(int j=0; j<stu.size(); j++){
						if(sca.equals(stu.get(j)[0])){
							stu.remove(j);
							
							stt = new String[5];
							
							System.out.println("학번");
							stt[0] = scan.nextLine();
							
							System.out.println("이름");
							stt[1] = scan.nextLine();
							
							System.out.println("국어");
							stt[2] = scan.nextLine();
							
							System.out.println("영어");
							stt[3] = scan.nextLine();
							
							System.out.println("수학");
							stt[4] = scan.nextLine();
							
							stu.add(stt);
						}
					}

					
				} else if(sc == 4){ // 삭제 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
					System.out.println("삭제할 학번을 입력해주세요.");
					String sca = scan.nextLine();
					for(int j=0; j<stu.size(); j++){
						if(sca.equals(stu.get(j)[0])){
							stu.remove(j);
						}
					}
					
				} else{ // 종료 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
					return;
				}
				
			
			}catch(java.lang.NumberFormatException e){
				System.out.println("다시 쳐주세요~");
				continue;
			}
//			finally{
//				// 위에 return 안먹음
//				continue;
//			}
			
			
		}
	
	}

}

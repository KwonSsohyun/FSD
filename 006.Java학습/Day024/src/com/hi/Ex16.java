package com.hi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 문자열
		Scanner sc = new Scanner(System.in);
		
		File file = new File("test02.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("학생성적관리프로그램 (ver 0.8.0)");
		int su = -1;
		
		
		while(true){
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			su = Integer.parseInt(sc.nextLine());
			
			if(su==0){break;}
			if(su==1){ // 보기 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				System.out.println("--------------------------------------");
				System.out.println("학번\t |이름\t |국어\t |영어\t |수학\t");
				System.out.println("--------------------------------------");
				try { // ▶▶ 읽기(인풋)
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
					while(true){
						String msg = br.readLine(); // 개행단위로 읽어라.
						if(msg==null){break;}
						System.out.println(msg);
					}
					
					br.close();
					fr.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("--------------------------------------");
				
			} else if(su==2){ // 입력 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				String msg = "";
				System.out.println("학번 > ");
				msg += sc.nextLine() + "\t";
				System.out.println("이름 > ");
				msg += sc.nextLine() + "\t";
				System.out.println("국어 > ");
				msg += sc.nextLine() + "\t";
				System.out.println("영어 > ");
				msg += sc.nextLine() + "\t";
				System.out.println("수학 > ");
				msg += sc.nextLine();
				
				try { // ▶▶ 쓰기(아웃풋)
					FileWriter fw = new FileWriter(file, true); // true ▶ 누적 // false(디폴트) ▶ 덮어씀
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(msg);
					bw.write("\n");
					// bw.newLine(); // 개행넣음
					
					bw.close();
					fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			} else if(su==3){ // 수정 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				String msg = "";
				System.out.print("학번 > ");
				String input = sc.nextLine();
				
				// 학번 읽어와야함
				try {
					FileReader fr= new FileReader(file);
					// 읽어오기 편하게 버퍼 달기
					BufferedReader br = new BufferedReader(fr);
					String temp = null;
					
					while((temp = br.readLine())!=null){ // 버퍼읽어올게 있으면 들어옴
						msg += temp +'\n'; // 누적함
					}
					
					br.close();
					fr.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// 스타트, 런은 개발자들이 쓰래드라서 변수명 잘 안씀.
				int startIdx = -2;
				int endIdx = 0; // 처음으로 등장하는 개행을 찾아라.
				
				// 개행을 기준으로 찾음
				startIdx = msg.indexOf('\n'+input+'\t');
				endIdx = msg.indexOf("\r\n", startIdx+1);
				
				// 못찾으면 -1
				if(startIdx == -1){
					startIdx = msg.indexOf(input+'\t'); // 처음에는 개행이 없으니까.
					if(startIdx!=0){ // 존재하지 않는다는것이니까.
						continue;
					}
				} else{
					startIdx += 1;
				}
				
				endIdx = msg.indexOf("\n", startIdx+1);
				
				input += "\t";
				System.out.print("이름 > ");
				input += sc.nextLine()+"\t";
				System.out.print("국어 > ");
				input += sc.nextLine()+"\t";
				System.out.print("영어 > ");
				input += sc.nextLine()+"\t";
				System.out.print("수학 > ");
				input += sc.nextLine();
				
				String old = msg.substring(startIdx, endIdx);
				msg = msg.replace(old, input);
				
				// 파일에 써야함 (덮어씀)
				try {
					FileWriter fw = new FileWriter(file);
					fw.write(msg);
					
					fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
			
		}
		
	}

}

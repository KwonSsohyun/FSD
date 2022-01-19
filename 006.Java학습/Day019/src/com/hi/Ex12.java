package com.hi;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) throws IOException{
		// 학생성적관리프로그램 (ver 0.7.0)
		// 껐다가 켜도 입력한 데이터가 계속 살아있도록... (io를 통해서)
		// 파일DB
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.7.0)");
		
		String input = null;
		// 파일을 써놓는다.
		String data = "";

		File file = new File("data.bin"); // 바이너리 파일
		// 읽어오기

		if(file.exists()){ // 파일이 있으면 
			try{			
				FileInputStream fis = new FileInputStream(file);
//				int fsize = (int) file.length();
//				byte[] buf = new byte[fsize];
//				fis.read(buf);
//				data = new String(buf);
				///////////////////////////////////////////////////////////
				
//				ArrayList<Integer> list = new ArrayList<>();
//				while(true){
//					int su = fis.read();
//					if(su==-1){break;}
//					list.add(su);
//				}
//				Object[] arr2 = list.toArray();
//				byte[] arr3 = new byte[arr2.length];
//				for(int i=0; i<arr3.length; i++){
//					arr3[i] = Byte.parseByte(arr2[i].toString());
//				}
//				data = new String(arr3);
				
				///////////////////////////////////////////////////////////
				
				// 한글안됨 (1바이트씩을 가지고 바로 바꿔버리기 때문에)
				while(true){
					int su = fis.read();
					if(su==-1){break;}
					data += (char)su;
				}
				
				
				fis.close();
				
			} catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
		////////////////////////////////////////////////////////

		while(true){
			System.out.println("1.보기  2.입력  0.종료  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------");
				System.out.println("학번\t |국어\t |영어\t |수학\t ");
				System.out.println("-------------------------------");
				System.out.println(data);
				System.out.println("-------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("학번 > ");
				input = sc.nextLine() + "\t";
				System.out.println("국어 > ");
				input += sc.nextLine() + "\t";
				System.out.println("영어 > ");
				input += sc.nextLine() + "\t";
				System.out.println("수학 > ");
				input += sc.nextLine() + "\n";
				
				data += input;
			}
		}
		
		// 저장 io작업 (파일로 저장)
		// File file = new File("data.bin"); // 바이너리 파일
		
		if(!file.exists()){ // 없으면 만듬
			try{
				file.createNewFile();
			} catch (IOException e){
				e.printStackTrace(); // 에러메세지를 여유가 생기면 출력
			}
			
		}
		
		try{
			FileOutputStream fos = new FileOutputStream(file);
			// 작성하는단계니까 바이트로 입력
			fos.write(data.getBytes()); 
			fos.flush();
			fos.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
	


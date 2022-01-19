package com.hi;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class Ex15 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.8.0)
		// data.bin -> 여기다가 저장해라
				// 파일 디비 연동
				// 1.보기  2.입력  3.수정  4.삭제  0.종료  >
				// input → 학번, 이름 , 국어, 영어, 수학

		File file = new File("data.bin");
		
		if(!file.exists()){ 
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
		} // if end
		
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		int su = -1;
		
		System.out.println("학생성적관리프로그램 (ver 0.8.0)");
		
		while(true){
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			su = Integer.parseInt(sc.nextLine());
			
			if(su==0){break;}
			if(su==1){ // 보기 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				System.out.println("--------------------------------------");
				System.out.println("학번\t |이름\t |국어\t |영어\t |수학\t");
				System.out.println("--------------------------------------");
				// 출력하기 위해서 IO연결 (읽어들이는것 - input)
				try {
					FileInputStream fis = new FileInputStream(file);
					// 데이터 살려서 읽으거니까 "데이터인풋스트림"
					DataInputStream dis = new DataInputStream(fis);
					int num,kor,eng,math;
					String name = null;
					
					while(true){ // 계속 읽게 하기
						
						int su2 = dis.read();
						if(su2 == -1){break;}
						
						// 순서대로 읽는다.
						// syso((char)su2); // 바이트를 문자로 바꿔서 읽었기때문에.
						// 어떤 프로그램으로 여느냐에 따라 해석하는 방식이 다름.
						
						// 나는 데이터 형식에 맞게 읽는다.
						num = dis.readInt();
						name = dis.readUTF();
						kor = dis.readInt();
						eng = dis.readInt();
						math = dis.readInt();
						
						if(su2!=0){
							System.out.println(num + "\t" + name + "\t"+ kor + "\t"+ eng + "\t"+ math);
						}
					}
					
					dis.close();
					fis.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("--------------------------------------");
				
			} else if(su==2){ // 입력 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				System.out.println("학번 > ");
				int num = Integer.parseInt(sc.nextLine());
				
				System.out.println("이름 > ");
				String name = sc.nextLine();
				
				System.out.println("국어 > ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("영어 > ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.println("수학 > ");
				int math = Integer.parseInt(sc.nextLine());
				
				//데이타 살리기위해서 테이터스트림 씀
				
				try {
					// 기존값 먼저 읽어들여와야한다.
					// 하나의 파일을 가지고 빨대를 꽂아야 한다. (하나당 하나)
					FileInputStream fis = new FileInputStream(file);
					// 바이트배열에 저장
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					
					while(true){
						int su2 = fis.read();
						if(su2 == -1){break;}
						baos.write(su2);
					}
					byte[] buf = baos.toByteArray();
					
					baos.close();
					// 수행하기 전에 클로즈 (빨대는 하나당 하나)
					fis.close();
					
					FileOutputStream fos = new FileOutputStream(file);
					DataOutputStream dos = new DataOutputStream(fos);
				
					dos.write(buf);
					
					// 1바이트쓰기 -> 빠져나가기위한
					dos.write(1);
					
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				
					dos.close();
					fos.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				
				
			} else if (su==3){ // 수정 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				System.out.println("학번 > ");
				int num = Integer.parseInt(sc.nextLine());
				ByteArrayOutputStream baos=null;
				
				// 학번찾기 ----------------------------------------------------------------------------
				try{
				FileInputStream fis = new FileInputStream(file);
				// 데이터 살려서 읽으거니까 "데이터인풋스트림"
				DataInputStream dis = new DataInputStream(fis);
				
				
				// 아래 받아온걸 여기다가 담고 쓴다.
				baos = new ByteArrayOutputStream();
				DataOutputStream dos = new DataOutputStream(baos);
				
				int num2,kor,eng,math;
				String name = null;
				
				while(true){ // 계속 읽게 하기
					
					int su2 = dis.read();
					if(su2 == -1){break;}
					
					// 순서대로 읽는다.
					// 학번 num2 -> 입력받은 num과 같으면 같은 학번
					num2 = dis.readInt();
					name = dis.readUTF();
					kor = dis.readInt();
					eng = dis.readInt();
					math = dis.readInt();
					
					if(num == num2){ su2=0;}
					
					dos.write(su2);
					dos.writeInt(num2);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
					// System.out.println(num + "\t" + name + "\t"+ kor + "\t"+ eng + "\t"+ math);
				}
				
				dos.flush(); // 안 닫았음
				dos.close();
				dis.close();
				fis.close();
				
			//-----------------------------------------------------------------------------------------
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println("이름 > ");
				String name = sc.nextLine();
				
				System.out.println("국어 > ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("영어 > ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.println("수학 > ");
				int math = Integer.parseInt(sc.nextLine());
				
				//데이타 살리기위해서 테이터스트림 씀
				
				try {
					byte[] buf = baos.toByteArray();
					
					baos.close();
					
					
					FileOutputStream fos = new FileOutputStream(file);
					DataOutputStream dos = new DataOutputStream(fos);
				
					dos.write(buf);
					
					// 1바이트쓰기 -> 빠져나가기위한
					dos.write(1);
					
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				
					dos.close();
					fos.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
			
			
		} // while end
		
	} // main end 

} // class end

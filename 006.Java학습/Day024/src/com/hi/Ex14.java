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
		// �л������������α׷� (ver 0.8.0)
		// data.bin -> ����ٰ� �����ض�
		// ���� ��� ����
		// 1.����  2.�Է�  3.����  4.����  0.����  >
		// input �� �й�, �̸� , ����, ����, ����
		
		System.out.println("�л������������α׷� (ver 0.8.0)");
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
			
				System.out.println("1.����  2.�Է�  3.����  4.����  0.����  >");
				sc = Integer.parseInt(scan.nextLine());
				
				if(sc == 1){ // ���� ������������������������������������������
					System.out.println("-------------------------------------");
					System.out.println("�й�\t |�̸�\t |����\t |����\t |����\t");
					System.out.println("-------------------------------------");
					for(int i=0; i<stu.size(); i++){
						String[] gab = stu.get(i);
						System.out.println(gab[0] +"\t"+ gab[1] +"\t"+ gab[2] +"\t"+ gab[3] +"\t"+ gab[4]);
					}
					System.out.println("-------------------------------------");
					
				} else if(sc == 2){ // �Է� �����������������������������������
					stt = new String[5];
	
					System.out.println("�й�");
					stt[0] = scan.nextLine();
					
					System.out.println("�̸�");
					stt[1] = scan.nextLine();
					
					System.out.println("����");
					stt[2] = scan.nextLine();
					
					System.out.println("����");
					stt[3] = scan.nextLine();
					
					System.out.println("����");
					stt[4] = scan.nextLine();
					
					stu.add(stt);
					
				} else if(sc == 3){ // ���� �����������������������������������
					System.out.println("������ �й��� �Է����ּ���.");
					String sca = scan.nextLine();
					
					for(int j=0; j<stu.size(); j++){
						if(sca.equals(stu.get(j)[0])){
							stu.remove(j);
							
							stt = new String[5];
							
							System.out.println("�й�");
							stt[0] = scan.nextLine();
							
							System.out.println("�̸�");
							stt[1] = scan.nextLine();
							
							System.out.println("����");
							stt[2] = scan.nextLine();
							
							System.out.println("����");
							stt[3] = scan.nextLine();
							
							System.out.println("����");
							stt[4] = scan.nextLine();
							
							stu.add(stt);
						}
					}

					
				} else if(sc == 4){ // ���� �����������������������������������
					System.out.println("������ �й��� �Է����ּ���.");
					String sca = scan.nextLine();
					for(int j=0; j<stu.size(); j++){
						if(sca.equals(stu.get(j)[0])){
							stu.remove(j);
						}
					}
					
				} else{ // ���� �����������������������������������������������
					return;
				}
				
			
			}catch(java.lang.NumberFormatException e){
				System.out.println("�ٽ� ���ּ���~");
				continue;
			}
//			finally{
//				// ���� return �ȸ���
//				continue;
//			}
			
			
		}
	
	}

}

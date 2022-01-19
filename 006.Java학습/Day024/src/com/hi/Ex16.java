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
		// ���ڿ�
		Scanner sc = new Scanner(System.in);
		
		File file = new File("test02.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�л������������α׷� (ver 0.8.0)");
		int su = -1;
		
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.����  >");
			su = Integer.parseInt(sc.nextLine());
			
			if(su==0){break;}
			if(su==1){ // ���� ���������������������������������������������������
				System.out.println("--------------------------------------");
				System.out.println("�й�\t |�̸�\t |����\t |����\t |����\t");
				System.out.println("--------------------------------------");
				try { // ���� �б�(��ǲ)
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
					while(true){
						String msg = br.readLine(); // ��������� �о��.
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
				
			} else if(su==2){ // �Է� ���������������������������������������������������
				String msg = "";
				System.out.println("�й� > ");
				msg += sc.nextLine() + "\t";
				System.out.println("�̸� > ");
				msg += sc.nextLine() + "\t";
				System.out.println("���� > ");
				msg += sc.nextLine() + "\t";
				System.out.println("���� > ");
				msg += sc.nextLine() + "\t";
				System.out.println("���� > ");
				msg += sc.nextLine();
				
				try { // ���� ����(�ƿ�ǲ)
					FileWriter fw = new FileWriter(file, true); // true �� ���� // false(����Ʈ) �� ���
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(msg);
					bw.write("\n");
					// bw.newLine(); // �������
					
					bw.close();
					fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			} else if(su==3){ // ���� ���������������������������������������������������
				String msg = "";
				System.out.print("�й� > ");
				String input = sc.nextLine();
				
				// �й� �о�;���
				try {
					FileReader fr= new FileReader(file);
					// �о���� ���ϰ� ���� �ޱ�
					BufferedReader br = new BufferedReader(fr);
					String temp = null;
					
					while((temp = br.readLine())!=null){ // �����о�ð� ������ ����
						msg += temp +'\n'; // ������
					}
					
					br.close();
					fr.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// ��ŸƮ, ���� �����ڵ��� ������� ������ �� �Ⱦ�.
				int startIdx = -2;
				int endIdx = 0; // ó������ �����ϴ� ������ ã�ƶ�.
				
				// ������ �������� ã��
				startIdx = msg.indexOf('\n'+input+'\t');
				endIdx = msg.indexOf("\r\n", startIdx+1);
				
				// ��ã���� -1
				if(startIdx == -1){
					startIdx = msg.indexOf(input+'\t'); // ó������ ������ �����ϱ�.
					if(startIdx!=0){ // �������� �ʴ´ٴ°��̴ϱ�.
						continue;
					}
				} else{
					startIdx += 1;
				}
				
				endIdx = msg.indexOf("\n", startIdx+1);
				
				input += "\t";
				System.out.print("�̸� > ");
				input += sc.nextLine()+"\t";
				System.out.print("���� > ");
				input += sc.nextLine()+"\t";
				System.out.print("���� > ");
				input += sc.nextLine()+"\t";
				System.out.print("���� > ");
				input += sc.nextLine();
				
				String old = msg.substring(startIdx, endIdx);
				msg = msg.replace(old, input);
				
				// ���Ͽ� ����� (���)
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

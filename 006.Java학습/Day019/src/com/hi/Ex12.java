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
		// �л������������α׷� (ver 0.7.0)
		// ���ٰ� �ѵ� �Է��� �����Ͱ� ��� ����ֵ���... (io�� ���ؼ�)
		// ����DB
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�л������������α׷� (ver 0.7.0)");
		
		String input = null;
		// ������ ����´�.
		String data = "";

		File file = new File("data.bin"); // ���̳ʸ� ����
		// �о����

		if(file.exists()){ // ������ ������ 
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
				
				// �ѱ۾ȵ� (1����Ʈ���� ������ �ٷ� �ٲ������ ������)
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
			System.out.println("1.����  2.�Է�  0.����  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t ");
				System.out.println("-------------------------------");
				System.out.println(data);
				System.out.println("-------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("�й� > ");
				input = sc.nextLine() + "\t";
				System.out.println("���� > ");
				input += sc.nextLine() + "\t";
				System.out.println("���� > ");
				input += sc.nextLine() + "\t";
				System.out.println("���� > ");
				input += sc.nextLine() + "\n";
				
				data += input;
			}
		}
		
		// ���� io�۾� (���Ϸ� ����)
		// File file = new File("data.bin"); // ���̳ʸ� ����
		
		if(!file.exists()){ // ������ ����
			try{
				file.createNewFile();
			} catch (IOException e){
				e.printStackTrace(); // �����޼����� ������ ����� ���
			}
			
		}
		
		try{
			FileOutputStream fos = new FileOutputStream(file);
			// �ۼ��ϴ´ܰ�ϱ� ����Ʈ�� �Է�
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
	


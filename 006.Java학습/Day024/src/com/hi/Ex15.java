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
		// �л������������α׷� (ver 0.8.0)
		// data.bin -> ����ٰ� �����ض�
				// ���� ��� ����
				// 1.����  2.�Է�  3.����  4.����  0.����  >
				// input �� �й�, �̸� , ����, ����, ����

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
		
		System.out.println("�л������������α׷� (ver 0.8.0)");
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.����  >");
			su = Integer.parseInt(sc.nextLine());
			
			if(su==0){break;}
			if(su==1){ // ���� ������������������������������������������������������������������
				System.out.println("--------------------------------------");
				System.out.println("�й�\t |�̸�\t |����\t |����\t |����\t");
				System.out.println("--------------------------------------");
				// ����ϱ� ���ؼ� IO���� (�о���̴°� - input)
				try {
					FileInputStream fis = new FileInputStream(file);
					// ������ ����� �����Ŵϱ� "��������ǲ��Ʈ��"
					DataInputStream dis = new DataInputStream(fis);
					int num,kor,eng,math;
					String name = null;
					
					while(true){ // ��� �а� �ϱ�
						
						int su2 = dis.read();
						if(su2 == -1){break;}
						
						// ������� �д´�.
						// syso((char)su2); // ����Ʈ�� ���ڷ� �ٲ㼭 �о��⶧����.
						// � ���α׷����� �����Ŀ� ���� �ؼ��ϴ� ����� �ٸ�.
						
						// ���� ������ ���Ŀ� �°� �д´�.
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
				
			} else if(su==2){ // �Է� ������������������������������������������������������������������
				System.out.println("�й� > ");
				int num = Integer.parseInt(sc.nextLine());
				
				System.out.println("�̸� > ");
				String name = sc.nextLine();
				
				System.out.println("���� > ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("���� > ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.println("���� > ");
				int math = Integer.parseInt(sc.nextLine());
				
				//����Ÿ �츮�����ؼ� �����ͽ�Ʈ�� ��
				
				try {
					// ������ ���� �о�鿩�;��Ѵ�.
					// �ϳ��� ������ ������ ���븦 �Ⱦƾ� �Ѵ�. (�ϳ��� �ϳ�)
					FileInputStream fis = new FileInputStream(file);
					// ����Ʈ�迭�� ����
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					
					while(true){
						int su2 = fis.read();
						if(su2 == -1){break;}
						baos.write(su2);
					}
					byte[] buf = baos.toByteArray();
					
					baos.close();
					// �����ϱ� ���� Ŭ���� (����� �ϳ��� �ϳ�)
					fis.close();
					
					FileOutputStream fos = new FileOutputStream(file);
					DataOutputStream dos = new DataOutputStream(fos);
				
					dos.write(buf);
					
					// 1����Ʈ���� -> ��������������
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
				
				
				
				
			} else if (su==3){ // ���� ������������������������������������������������������������������
				System.out.println("�й� > ");
				int num = Integer.parseInt(sc.nextLine());
				ByteArrayOutputStream baos=null;
				
				// �й�ã�� ----------------------------------------------------------------------------
				try{
				FileInputStream fis = new FileInputStream(file);
				// ������ ����� �����Ŵϱ� "��������ǲ��Ʈ��"
				DataInputStream dis = new DataInputStream(fis);
				
				
				// �Ʒ� �޾ƿ°� ����ٰ� ��� ����.
				baos = new ByteArrayOutputStream();
				DataOutputStream dos = new DataOutputStream(baos);
				
				int num2,kor,eng,math;
				String name = null;
				
				while(true){ // ��� �а� �ϱ�
					
					int su2 = dis.read();
					if(su2 == -1){break;}
					
					// ������� �д´�.
					// �й� num2 -> �Է¹��� num�� ������ ���� �й�
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
				
				dos.flush(); // �� �ݾ���
				dos.close();
				dis.close();
				fis.close();
				
			//-----------------------------------------------------------------------------------------
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println("�̸� > ");
				String name = sc.nextLine();
				
				System.out.println("���� > ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("���� > ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.println("���� > ");
				int math = Integer.parseInt(sc.nextLine());
				
				//����Ÿ �츮�����ؼ� �����ͽ�Ʈ�� ��
				
				try {
					byte[] buf = baos.toByteArray();
					
					baos.close();
					
					
					FileOutputStream fos = new FileOutputStream(file);
					DataOutputStream dos = new DataOutputStream(fos);
				
					dos.write(buf);
					
					// 1����Ʈ���� -> ��������������
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

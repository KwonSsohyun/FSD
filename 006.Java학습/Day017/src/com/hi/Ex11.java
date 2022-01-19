package com.hi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex11 {
   public static void main(String[] args) {
      boolean flag = true;
      Scanner scan = new Scanner(System.in);
      int no = 1;
      ArrayList<HashMap> students = new ArrayList<HashMap>();
      
      while(flag == true) {
         System.out.println("1.����  2.�Է�  3.����  4.����  0.���� >");
         String inputType = scan.nextLine();
         
         switch(inputType) {
            case "1":
               Board bd = new Board();
               bd.output(students);
               break;
               
            case "2":
               HashMap<String,String> map = new HashMap<String,String>();
               InputMachine inp = new InputMachine();
               
               String stuNo =   Integer.toString(no);
               String stuNm =    inp.nameInput();
               String kor   =   Integer.toString(inp.korInput());
               String eng   =   Integer.toString(inp.engInput());
               String math  =   Integer.toString(inp.mathInput());
               
               map.put("�й�",stuNo);
               map.put("�̸�",stuNm);
               map.put("����",kor);
               map.put("����",eng);
               map.put("����",math);
               
               students.add(map);
               no++;
               break;
            case "3":
               ModifyMachine md = new ModifyMachine();
               md.reWriteStuInfo(students);
               break;
            case "4":
               System.out.println("������ �л���ȣ�� �Է����ּ��� : ");
               int rmNo = scan.nextInt();
               students.remove(rmNo-1);
               break;
            case "0":
               flag = false;
               break;
         }
      }
   }
}


class Board{
   public void output(ArrayList<HashMap> students) {
      System.out.println("----------------------------------------");
      System.out.println("�й� | �̸�|   ����|   ����|   ����|");
      System.out.println("----------------------------------------");
      for(HashMap<String, String> i : students) {
         System.out.println(i.get("�й�")+"   "+i.get("�̸�")+"     "+i.get("����")+"    "+i.get("����")+"    "+i.get("����"));         
      }
      System.out.println("----------------------------------------");
   }
}

class InputMachine{
   
   String name = "";
   int kor = 0;
   int eng = 0;
   int math = 0;
   
   Scanner scanInput = new Scanner(System.in);
   
   public String nameInput() {
      System.out.println("�л��� �̸��� �Է����ּ���  : ");
      name = scanInput.nextLine();
      return name;
   }
   
   public int korInput() {
      System.out.println("���� ������ �Է����ּ���  : ");
      kor = scanInput.nextInt();
      scanInput.nextLine();
      return kor;
   }
   
   public int engInput() {
      System.out.println("���� ������ �Է����ּ���  : ");
      eng = scanInput.nextInt();
      scanInput.nextLine();
      return eng;
   }
   
   public int mathInput() {
      System.out.println("���� ������ �Է����ּ���  : ");
      math = scanInput.nextInt();
      scanInput.nextLine();
      return math;
   }
}

class ModifyMachine{
   Scanner scan = new Scanner(System.in);
   HashMap<String,String> map = new HashMap<String,String>();
   
   public void reWriteStuInfo(ArrayList<HashMap> students) {
      System.out.println("���� ������ �ʿ��� �л� ��ȣ�� �Է����ּ��� : ");
      int mdIdx = scan.nextInt();
      String mdNo = Integer.toString(mdIdx);
      mdIdx = mdIdx-1;
      scan.nextLine();
      System.out.println("������ ���� ������ �־��ּ��� : ");
      String kor = scan.nextLine();
      
      System.out.println("������ ���� ������ �־��ּ��� : ");
      String eng   =   scan.nextLine();
      
      System.out.println("������ ���� ������ �־��ּ��� : ");
      String math  =   scan.nextLine();
      
      map.put("�й�",mdNo);
      map.put("�̸�",students.get(mdIdx).get("�̸�").toString());
      map.put("����",kor);
      map.put("����",eng);
      map.put("����",math);
      
      students.set(mdIdx, map);
   }
   
}
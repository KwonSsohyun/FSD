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
         System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료 >");
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
               
               map.put("학번",stuNo);
               map.put("이름",stuNm);
               map.put("국어",kor);
               map.put("영어",eng);
               map.put("수학",math);
               
               students.add(map);
               no++;
               break;
            case "3":
               ModifyMachine md = new ModifyMachine();
               md.reWriteStuInfo(students);
               break;
            case "4":
               System.out.println("삭제할 학생번호를 입력해주세요 : ");
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
      System.out.println("학번 | 이름|   국어|   수학|   영어|");
      System.out.println("----------------------------------------");
      for(HashMap<String, String> i : students) {
         System.out.println(i.get("학번")+"   "+i.get("이름")+"     "+i.get("국어")+"    "+i.get("수학")+"    "+i.get("영어"));         
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
      System.out.println("학생의 이름을 입력해주세요  : ");
      name = scanInput.nextLine();
      return name;
   }
   
   public int korInput() {
      System.out.println("국어 성적을 입력해주세요  : ");
      kor = scanInput.nextInt();
      scanInput.nextLine();
      return kor;
   }
   
   public int engInput() {
      System.out.println("영어 성적을 입력해주세요  : ");
      eng = scanInput.nextInt();
      scanInput.nextLine();
      return eng;
   }
   
   public int mathInput() {
      System.out.println("수학 성적을 입력해주세요  : ");
      math = scanInput.nextInt();
      scanInput.nextLine();
      return math;
   }
}

class ModifyMachine{
   Scanner scan = new Scanner(System.in);
   HashMap<String,String> map = new HashMap<String,String>();
   
   public void reWriteStuInfo(ArrayList<HashMap> students) {
      System.out.println("먼저 수정이 필요한 학생 번호를 입력해주세요 : ");
      int mdIdx = scan.nextInt();
      String mdNo = Integer.toString(mdIdx);
      mdIdx = mdIdx-1;
      scan.nextLine();
      System.out.println("수정할 국어 점수를 넣어주세요 : ");
      String kor = scan.nextLine();
      
      System.out.println("수정할 영어 점수를 넣어주세요 : ");
      String eng   =   scan.nextLine();
      
      System.out.println("수정할 수학 점수를 넣어주세요 : ");
      String math  =   scan.nextLine();
      
      map.put("학번",mdNo);
      map.put("이름",students.get(mdIdx).get("이름").toString());
      map.put("국어",kor);
      map.put("영어",eng);
      map.put("수학",math);
      
      students.set(mdIdx, map);
   }
   
}
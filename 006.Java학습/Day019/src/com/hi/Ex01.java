package com.hi;

import java.io.IOException;

public class Ex01 {

   public static void main(String[] args) {
      // io ����Ʈ��Ʈ��(1byteü��)
      // 1byte������ �а� ����.
      java.io.OutputStream out = System.out;
      // �ȳ��� ���� ������ try, catch ����� �Ѵ�.
      try {
         out.write(97); // a
         out.write(65); // A
         out.close(); 
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}
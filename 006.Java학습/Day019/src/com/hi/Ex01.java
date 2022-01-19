package com.hi;

import java.io.IOException;

public class Ex01 {

   public static void main(String[] args) {
      // io 바이트스트림(1byte체계)
      // 1byte단위로 읽고 쓴다.
      java.io.OutputStream out = System.out;
      // 안나올 수도 있으니 try, catch 해줘야 한다.
      try {
         out.write(97); // a
         out.write(65); // A
         out.close(); 
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}
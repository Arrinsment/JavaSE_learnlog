package com.itheima.test;

import java.util.Random;

public class 写验证码 {
    public static void main(String[] args) {
       /* 需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5 前四位是大写字母或者小写字母
        最后一位是数字*/
      char[] ch=new char[52];
      for (int i=0;i<52;i++) {
          if(i<=25){
          ch[i]=(char) (97+i);}
          else{
              ch[i]=(char) (65+i-26);
         }
      }
      String result="";
     Random sc=new Random();
        for (int i=0;i<4;i++){
            int num =sc.nextInt(52);
              result+= ch[num];
        }
         int n= sc.nextInt(10);
        result+=n;
        System.out.print(result);
    }
}

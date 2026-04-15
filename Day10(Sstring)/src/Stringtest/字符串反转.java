package Stringtest;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        //键盘录入一个字符串,然后定义一个方法实现字符串的反转
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的字符串");
        String s1 = sc.next();
        //定义方法实现反转,然后打印
        reverseString(s1);
    }
     public static void reverseString(String S2){
              String s3="";
        for (int i=S2.length()-1;i>=0;i--){

                char c = S2.charAt(i);
                s3+=c;
        }
         System.out.println(s3);
     }
}

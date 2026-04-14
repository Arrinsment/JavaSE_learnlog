package StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] arges){
        //字符串比较
        //基本数据类型比较的是值(用==)
        //其它引用数据类型比较的是地址
        //equals 不忽略大小写
        //equalsIgnoreCase 忽略大小写
        //比较的是英文格式下的 一和壹不区分大小写

         String S1="Abc";
         String S2="abc";
        System.out.println(S1==S2);//false
        boolean result= S1.equals(S2);//false
        System.out.println(result);

        //用equalsIgnorecase,忽略大小写;
        boolean r= S1.equalsIgnoreCase(S2);//true
        System.out.println(r);

        //键盘录入一个字符串进行比较
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");//键盘录入的字符串 是new出来的
         String S3 =sc.next();
        System.out.println(S3==S1);//false

    }
}

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
        //就是先去字符常量池中 创建一个s1并赋值为Abc ,然后在创建s2的时候去看看字符常量池有没有,有的话直接指向即可,然后和s1地址相同的,是true
        //如果没有的话,那么在去创建一个即可,然后二者的地址是不同的,所以是false

        boolean result= S1.equals(S2);
        System.out.println(result);//false,这里Java 已经在底层对String的equals方法进行重写了,所以比较的是内容

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

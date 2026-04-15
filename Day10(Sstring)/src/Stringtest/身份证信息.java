package Stringtest;

import java.util.Scanner;

public class 身份证信息 {
    public static void main(String[] args) {
        //输入一个18位的身份证信息,获取出生年月日,然后从17位数去判断男女
        //偶数为女,奇数为男

        //1.键盘录入一个身份证号码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的身份证号码");
        String id = sc.next();//511525 2005 11 05 77 5 7//和数组一样下标从0开始数

        //2.利用子链 获取 年月日
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println(year+"年"+month+"月"+day+"日");

        //利用ASCII码获取数字然后根据数字判断奇数偶数
        //规则是一个字符比如数字 '0' 当他减去一个数字 是'0'会去ASCII码表找到对应的数字48进行转化后 进行加减;

        //判断是男,还是女?
           char manOrWomanId= id.charAt(16);
           int num= manOrWomanId-48;
           if(num%2==0){
               System.out.println("性别为女");
           }
           else{
               System.out.println("性别为男");
           }

    }
}

package Stringtest;

import java.util.Scanner;

public class 登录密码 {

    public static void main(String[] args) {
        //定义一个正确的密码和用户名
        String rightname="yangyao";
        String rightpassworld="12345678";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入你的用户名");
                  String name = sc.next();
            System.out.println("请输入你的密码");
                  String passworld =sc.next();
           if(rightname.equals(name)&&rightpassworld.equals(passworld)){
               System.out.println("密码输入正确");
               break;
           }
           else{
               if(2-i==0){
                   System.out.println("你的设备已经被锁定,请联系客服小姐,电话号码13508942658");
               }
               else {
                   System.out.println("密码或用户名输入错误,请重新输入,目前还剩"+(2 - i)+"次机会");//记住打圆括号的会优先计算
               }
           }
        }

    }
}

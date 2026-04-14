package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class 双色球抽奖系统 {
    public static void main(String[] args) {
        int []arr=creatNumber();
        for (int i = 0; i < arr.length; i++) {                         //1 2 31 12 14 20 7
           // System.out.print(arr[i]+" ");                              //11 12 13 14 15 16
        }

        System.out.println("--------------------");
        int []user=UserInputNumber();
        int redcount =0;
        int bluecount=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < user.length-1; i1++) {
                if(arr[i]==user[i1]){
                    redcount++;
                    break;
                }
            }
        }
        if (arr[arr.length - 1] == user[user.length-1]) {
            bluecount++;
        }
        System.out.println(redcount);
        System.out.println(bluecount);

        if (redcount==6&&bluecount==1){
            System.out.println("中了一等奖,恭喜你中奖1000万");
        }
        else if(redcount==6&&bluecount==0){
            System.out.println("中了二等奖,恭喜你中奖500万");
        }
        else if(redcount==5&&bluecount==1){
            System.out.println("中了三等奖,恭喜你中奖3000元");
        }
        else if((redcount==5&&bluecount==0)||(redcount==4&&bluecount==1)){
            System.out.println("中了四等奖,恭喜你中奖200元");
        }
        else if((redcount==4&&bluecount==0)||(redcount==3&&bluecount==1)){
            System.out.println("中了五等奖,恭喜你中奖10元");
        }
        else if((redcount==2&&bluecount==1)||(redcount==1&&bluecount==1)||(redcount==0&&bluecount==1)){
            System.out.println("中了六等奖,恭喜你中奖5元");
        }
        else{
            System.out.println("谢谢惠顾");
        }
    }

     public static int[] UserInputNumber(){
         System.out.println("请输入你的红球号码");
          Scanner sc =new Scanner(System.in);
          int []user=new int [7];
         for (int i = 0; i < user.length-1;) {
             System.out.println("您正在输入您的第"+(i+1)+"个红色双色球号码");
             int red=sc.nextInt();
             if(red>=1&&red<=33)
             {
                 boolean flag=contain(user,red);
                 if(flag) {
                     user[i] = red;
                     i++;
                 }
                 else{
                     System.out.println("输入红色双色球号码重复,请重新输入");
                 }
             }
             else{
                 System.out.println("输入错误请重输入");
             }
         }
         System.out.println("请输入你的蓝球球号码");

         for (int i=user.length-1;i<=user.length-1;){//这里循环的是i
             System.out.println("您正在输入您的第"+(i+1)+"个蓝色双色球号码");
                int blue =sc.nextInt();
                if(blue>=1&&blue<=16){
                    user[i]=blue;
                   i++;
                }
                else{
                    System.out.println("请重新输入");
                }
         }
         for (int i = 0; i < user.length; i++) {
             //System.out.print(user[i]+" ");
         }
         return user;
     }
         public  static  int[] creatNumber(){
             int[] arr = new int[7];
             Random sc = new Random();
             for (int i = 0; i < arr.length-1; ) {
                 int num = sc.nextInt(33) + 1;
                 boolean flag = contain(arr, num);
                 if (flag) {
                     arr[i] = num;
                     i++;
                 }
             }
             int sc1=sc.nextInt(16)+1;
             arr[arr.length-1]=sc1;
             for (int i = 0; i < arr.length; i++) {
                 //System.out.print(arr[i]+" ");
             }
             return arr;
         }
        public static boolean contain ( int[] arr, int x){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return false;
                }
            }
            return true;
        }
}


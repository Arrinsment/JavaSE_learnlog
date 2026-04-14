package com.itheima.test;

import java.util.Random;

public class 大v抽奖 {
    public static void main(String[] args) {
        int[]arr =new int[]{2,588,888,1000,10000};
        int[]newarr=new int[5];
        Random sc=new Random();
        for(int i=0;i<5;) {
            int a = sc.nextInt(arr.length);
            int prize =arr[a];
            boolean flag =contains(newarr ,prize);
            if (!flag){
                newarr[i]=prize;
                i++;
            }
        }
        for(int i=0;i< newarr.length;i++){
            System.out.println(newarr[i]+"元的奖金被抽出");
        }
    }
    public static boolean contains(int[]arr,int x){
       for(int i=0;i< arr.length;i++){
           if (arr[i]==x){
               return true;
           }
       }
       return  false;
    }
}

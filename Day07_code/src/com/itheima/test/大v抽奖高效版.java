package com.itheima.test;

import java.util.Random;

public class 大v抽奖高效版 {
    //本质是让数组内部的元素进行随机交换
    public static void main(String[] args) {
        int []arr=new int[]{2,588,888,1000,10000};
        Random sc =new Random();
        for (int i = 0; i < arr.length; i++) {
             int arrindex= sc.nextInt(arr.length);
             int temp=arr[arrindex];
             arr[arrindex]=arr[i];
             arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"元的奖已被抽中");
        }
        }
}

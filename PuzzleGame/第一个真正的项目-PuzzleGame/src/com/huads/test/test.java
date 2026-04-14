package com.huads.test;

import java.util.Random;

public class test {
    public static void main(String[] args) {

        //就是拼图游戏,图片打乱?
        //利用一维数组即可以,我们先把一维数组进行随机打乱,然后把它定义为二数组即可

        int []arr=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [][]arrdata=new int[4][4];

        //随机打乱
        Random sc=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=sc.nextInt(arr.length);
            int temp=0;
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
       /*//方式一: 然后把一维数组变成二维数组
        int [][]arrdata=new int[4][4];
        int num=0;
        for (int i = 0; i < arrdata.length; i++) {
            for (int j = 0; j < arrdata.length; j++) {
                arrdata[i][j] = arr[num];
                num++;
            }
        }*/

        //方式二: 把一维数组变成二维数组
            for (int i1 = 0; i1 < arr.length; i1++) {
                arrdata[i1/4][i1%4]=arr[i1];
            }


        //遍历一下

        for (int i = 0; i < arrdata.length; i++) {
            for (int j = 0; j < arrdata.length; j++) {
                System.out.print(arrdata[i][j]+" ");
            }
            System.out.println();
        }
    }
}

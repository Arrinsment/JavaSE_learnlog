package com.itheima.test;

public class 二维数组 {
    public static void main(String[] args) {
        int [][]arr=new int[][]{  {22,66,44},
                                  {77,33,88},
                                  {25,45,65},
                                  {11,66,99}
        };
           int sum =0;
        for (int i = 0; i < arr.length; i++) {
            int a=0;
            for (int j = 0; j < arr[i].length; j++) {
               sum+=arr[i][j];
               a+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度的营业额是"+a+"万元");
            System.out.println();
        }
          System.out.println("总的营业额"+sum+"万元");
    }
}

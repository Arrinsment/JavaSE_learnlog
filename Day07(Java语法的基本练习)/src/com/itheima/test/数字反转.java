package com.itheima.test;

public class 数字反转 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        for(int i=0, j=arr.length-1;i<j;i++,j--){
            int temp=0;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

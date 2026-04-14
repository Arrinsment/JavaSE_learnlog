package com.itheima;

public class dem2 {
    public static void main(String[] args) {
         int count =0;
         for(int i=101;i<=200;i++){
             boolean flag =false;
              flag =is_num(i);
              if(flag){
                  count++;
              }
         }
        System.out.println(count);
    }
    public static boolean is_num(int x){
        for(int i=2;i<x;i++)
        {
            if(x%i==0){
               return false;
            }
        }
        return true;
    }
  }



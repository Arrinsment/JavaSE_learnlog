package com.day8_homework;

public class phonetest {
    public static void main(String[] arges){
        phone sc=new phone("小米",4333,"灰色");
        /*sc.setbrand("荣耀");
        sc.setcolor("白色");
        sc.setprice(4799); */
        System.out.println( sc.getprice());
        System.out.println(sc.getcolor());
        System.out.println(sc.getbrand());
        sc.call();
        sc.Message();

    }
}

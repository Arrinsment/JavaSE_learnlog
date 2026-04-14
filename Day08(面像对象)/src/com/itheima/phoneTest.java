package com.itheima;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象(找对象)
        phone p =new phone();

        //叫做给手机赋值
        p.brand="Apple";
        p.price=5999.99;

        //获取手机对像的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //成员行为:直接调用手机中的方法即可
        p.call();
        p.playgame();
        System.out.println("--------------------------");
        phone p2=new phone();

        p.brand="honor win";
        p.price=4799;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playgame();
    }


}

package com.day8_homework;

public class phone {
    private String brand;
    private int price;
    private String color;

    public phone(){
        System.out.println("无参数构造方法");
    }
    public  phone(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

    public void call() {
        System.out.println("正在使用价格为4799元白色的手机打电话....");
    }
    public void Message() {
        System.out.println("正在使用价格为4799元黑色的小米手机发短信....");
    }
    public void setbrand(String brand) {
        this.brand = brand;
    }
    public String getbrand(){
        return brand;
    }
    public void setprice(int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public String getcolor(){ return color;}
}
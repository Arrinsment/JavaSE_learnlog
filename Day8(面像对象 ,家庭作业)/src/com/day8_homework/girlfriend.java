package com.day8_homework;

public class girlfriend {
   private String name;
   private double height;
   private double weight;

   public void cock(){
        System.out.println("女朋友帮我做饭");
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    public void show(){
        System.out.println("名字"+name+"  " +"身高"+height+"  " +"体重"+weight);
    }
    //
    public girlfriend(){
        System.out.println("无参数构造方法");
    }
    public girlfriend(String name,double height,double weight) {
       this.name=name;
       this.height=height;
       this.weight=weight;
    }

    //
    public void setName(String name){
       this.name=name;
    }
    public String getname(){
       return name;
    }

    //
    public void setHeight(double height){
        this.height=height;
    }
    public double getheight(){
        return height;
    }
    //
    public void setWeight(double height){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    //


}

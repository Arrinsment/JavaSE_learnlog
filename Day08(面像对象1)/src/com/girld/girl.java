package com.girld;

public class girl {
    private String name;
    private String gender;
    private int age;
    public girl(){
        System.out.println("看看我执行了吗,空参构造");
    }
    public girl(String name,int age){
              this.name=name;
              this.age=age;
    }




    //成员变量

   //封装
    public void setName(String n)
    {
        name=n;
    }
    public String getName(){
        return this.name;
    }

    public void  setGender(String n){
        gender =n;
    }
    public String getGender(){
        return gender;
    }

    public void  setAge(int n){
        if (n>=18 &&n<=50){
         age =n;
        }
        else{
            System.out.println("非法数据");
        }
    }
    public int getAge(){
        return  this.age;
    }


    //行为,没有static
    public void sleep(){
        System.out.println("睡觉");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}

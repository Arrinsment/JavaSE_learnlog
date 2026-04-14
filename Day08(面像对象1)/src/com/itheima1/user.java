package com.itheima1;
//标准版的javaBean;
public class user {
    private String userName;
    private int PassWorld;
    private String email;
    private String gender;
    private int age;
    public user(String userName, int PassWorld, String email, String gender, int age) {
      this.age=age;
      this.gender=gender;
      this.email=email;
      this.PassWorld=PassWorld;
      this.userName=userName;
    }
    // 在类里面的方法不加static去修饰

    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPassWorld(int PassWorld){
        this.PassWorld=PassWorld;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setEmail(String gender){
        this.email=email;
    }

    public String  getUserName(){
        return userName;
    }

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getPassWorld(){
        return PassWorld;
    }
    public String getEmail(){
      return   email;
    }





}

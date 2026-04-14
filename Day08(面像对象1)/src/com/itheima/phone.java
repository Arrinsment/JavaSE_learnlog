package com.itheima;

public class phone { //手机作为"对象",可以帮助干活,而类就是手机的说明书,有手机的全部共同特征
                     //面像对象 面:找 对象:可以干活的事物

          //属性(成员变量,名词)
            String brand;//手机
            double price;//价格

          //行为(成员方法,动作),用方法去描述 无static
           public void call(){
               System.out.println("打电话");
           }
           public void  playgame(){
               System.out.println("打游戏");}

}

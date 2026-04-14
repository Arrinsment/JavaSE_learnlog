package com.huads.ui;

import javax.swing.*;

public class test {

    //这次是真正完整的实现一个项目,有框架,有GUi,有后端代码
    public static void main(String[] args) {


        //一:界面搭建
        //1.创建一个完整 游戏主界面,需要 用java 中的 JFrame 这个类,然后要先创建对象
        JFrame gameframe=new JFrame();
        //这个 JFrame的对象名字是 gameframe,然后我利用这个gameframe去调用 setSize 并设置它的高和宽(height和width)
        //width设置为603个像素,height为680个像素
        gameframe.setSize(603,680);
        //最后我们还要把设置好的界面框架,进行展现,调用 setVisible,(true)代表可以展现,(false)则代表不可以展现
        gameframe.setVisible(true);//此时我们的游戏框架界面就搭建好了

         //2.我们还要创建一个登录界面
        JFrame loginframe=new JFrame();
        //调用setSize(),去设置width和height
        loginframe.setSize(488,430);
        //然后调用setVisuble,传入true让它可见,false是不可见
        loginframe.setVisible(true);

        //3.我们还要创建一个注册界面
        JFrame registerframe=new JFrame();
        //同理我们也要 调用setSize(),去设置width和height
        //因为注册界面的信息要多一点 我把高设置为500
        registerframe.setSize(488,500);
        //最后调用setVisuble 并传入true 让界面可见
        registerframe.setVisible(true);
        //但这里有个问题如果以后代码变多了,不可能全部都写在一个代码里面,所以我还是分几个类来写








    }


}

package com.huads.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame3 extends JFrame implements KeyListener {
    public MyFrame3(){

        //这里创建一个界面
        this.setSize(600,680);

        //创建一个界面标题
        this.setTitle("拼图游戏");

        //让这个界面处于一个置顶状态
        this.setAlwaysOnTop(true);

        //让这个界面处于中间状态,ralativeTOscreen
        this.setLocationRelativeTo(null);

        //设置默认关闭方式
        this.setDefaultCloseOperation(3);

        //取消物件默认放置中间,以便使用x,y,轴进行操作
        this.setLayout(null);

        //这里设置一个按钮

        JButton j=new JButton("不要点我");
        //设置按钮的尺寸
        j.setSize(150,150);
        //设置位置
        j.setLocation(0,0);
        //这里的setSize和setLocation  与setBounds在最终效果上是等同的

        //然后这里我们选择使用adkeyListener 进行事件监听
        j.addKeyListener(this);//这里同样是一个接口要传入一个实现类,this 这样写,因为 MyFrame3本身就是一个实现类了
        //这里的参数this 表示事件执行后 ,要执行实现类中的代码,而这里的代码在最下面

        //然后把创建好的按钮放在界面隐藏容器中,注意这里是添加到
        this.getContentPane().add(j);



        //最后让这个被看见
        this.setVisible(true);



    }

    //细节1:如果我们按下一个键不松会重复的去调用keyPressed 键
    //细节2:我们可以使用一个方法叫 getkeyCode 去获取按键的值
    //然后我们发现键盘上面的按键 都会与唯一的数字与之进行对应,所以这样我们用数字 就可以去区分



    @Override
    public void keyTyped(KeyEvent e) {

    }



    @Override
    public void keyPressed(KeyEvent e) {
       // System.out.println("按下按键");
        int  code =e.getKeyCode();
        System.out.println(code);
        if(code==65)
        System.out.println("A");
        else if (code==66)
            System.out.println("B");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("松开按键");
        int code=e.getKeyCode();

        if(code==67)
            System.out.println("C");
        else if (code==68)
            System.out.println("D");
    }
}

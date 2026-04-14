package com.huads.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame2 extends JFrame implements MouseListener {
      //这里新建一个空参构造方法,以后创建对象的时候直接调用即可
      public MyFrame2(){

          //这里创建一个界面
          this.setSize(600,680);

          //创建一个界面标题
          this.setTitle("拼图游戏");

          //让这个界面处于一个置顶状态
          this.setAlwaysOnTop(true);

          //让这个界面处于zhen中间,ralativeTOscreen
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

          //然后这里我们选择使用addMouseListener 进行事件监听
          j.addMouseListener(this);//这里同样是一个接口要传入一个实现类,this 这样写,因为MyFrame2 本身就是一个实现类了

          //然后把创建好的按钮放在界面隐藏容器中,注意这里是添加到
          this.getContentPane().add(j);



          //最后让这个被看见
          this.setVisible(true);


      }

    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        System.out.println("点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
           //这里是鼠标一直按压,不放
        System.out.println("鼠标按住不放");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         //这里是鼠标释放
        System.out.println("鼠标释放");


    }

    @Override
    public void mouseEntered(MouseEvent e) {
          //这里是鼠标划入
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
           //这里是鼠标滑出
        System.out.println("鼠标划出");
    }
}

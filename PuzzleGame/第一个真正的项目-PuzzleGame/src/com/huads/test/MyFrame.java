package com.huads.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {

    //这里是选择创建一个空参构造,就是创建对象完就可以直接用


    //这里我们设置在成员位置,以后的方法我们都可以用
    //设置一个按钮的小组件,然后直接取名字传入即可
    JButton j1=new JButton("不要点我");


    //这里我们在设置第二个按钮
    JButton j2=new JButton("真的不要点我");

      public MyFrame(){

          //设置界面大小
          this.setSize(600,700);

          //设置界面置顶
          this.setAlwaysOnTop(true);

          //设置界面默认相对于屏幕居中的方式
          this.setLocationRelativeTo(null);
          
          //设置界面标题
          this.setTitle("拼图单机版 v1.0");

          //设置界面默认关闭操作
          //0:DO_NOTHING_ON_CLOSE
          //1:HIDE_ON_CLOSE
          //2:DISPOSE_ON_CLOSE
          //3:EXIT_ON_CLOSE
          this.setDefaultCloseOperation(0);

          //取消放置物件默认居中.以便可以使用x,y轴坐标的方式去设置
          this.setLayout(null);


          //设置按钮的位置,大小
          j1.setBounds(0,0,150,150);


          j2.setBounds(200,0,150,150);
          
          //这里我就开始添加监听事件,前2种方式是(创建实现类对象和new匿名内部类对象,这2种方式的本质都是一样的)
          //这里使用第三种方式直接 接入接口ActionListener 然后我们去调用

          j1.addActionListener(this);// 这里的this 代表的是本类的对象,就是直接把MyFrame这个类传入

          j2.addActionListener(this);

          //然后不要忘记了我们要把界面添加到,隐藏界面中间,getContentPane()表示要添加到容器中,用单独调用一个add才行
          this.getContentPane().add(j1);
          this.getContentPane().add(j2);


          //最后我们还要使用setVisible 去把代码实现
          this.setVisible(true);

      }

    @Override
    public void actionPerformed(ActionEvent e) {

          //在方法重写中进行判断,利用getSorce,可以用一个父类 Object 去接收

        Object O=e.getSource();
        if(O==j1){
           // j1.setBounds(0,0,300,300);
            j1.setSize(30,30);
        }
        else if(O==j2){
            Random r=new Random();
            //我们把它的位置随机即可
            //这里的位置是用的setLocation
            j2.setLocation(r.nextInt(500),r.nextInt(500));

        }


    }
}

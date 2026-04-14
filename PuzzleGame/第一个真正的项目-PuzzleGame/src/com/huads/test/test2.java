package com.huads.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {

        //这里我们新写一个事件监听
        //事件就是你在前端执行完对应的事件源后,你就会在后端执行对应的代码

        //这里 我们新建一个界面
        JFrame jFrame=new JFrame();

        //给界面设置宽width和高height
        jFrame.setSize(600,600);

        //然后让界面始终处于置顶状态,传入参数true
        jFrame.setAlwaysOnTop(true);

        //然后我们让界面处于居中状态,传入屏幕参数null
        jFrame.setLocationRelativeTo(null);

        //然后我们给界面设置一个标题
        jFrame.setTitle("按钮事件被点击");

        //然后我们设置默认操作关闭方式
        //0:D0_NOTHING_ON_CLOSE
        //1:HIDE_ON_CLOSE
        //2:DISPOSE_ON_CLSOE
        //3:EXIT_ON_CLOSE
        jFrame.setDefaultCloseOperation(3);

        //取消隐藏容器居中的方式,只有取消了才可以以x,y轴的形式添加代码
        jFrame.setLayout(null);

         //创建一个按钮对象JButton,给这个按钮上面写几个字 "不要点我"
        JButton jbutton=new JButton("不要点我");

        //把这个按钮设置x,y轴的左上角
        jbutton.setBounds(0,0,200,200);

        //然后我们开始给按钮添加事件监听
        //jbutton:是添加监听的对像
        //addActionListener:表示我要给那个组件添加事件监听(addActionListener表示可以空格或者鼠标左键)
        //参数表示鼠标被执行后具体要执行的代码,这里 addActionListener 是个接口,传入的应该是个实现类
        //所以我们要去写个实现类,去接入 ActionListener 这个接口

        jbutton.addActionListener(new MyAddActionListener());
        //上面的确实是一种写法,但问题是假如我要创建多个按钮,我该怎么办?还是单独的去创建一个类吗?
        //完全没有必要,直接使用匿名内部类即可(匿名内部类的对象) 下面的写法和上面的写法本质上是一样的
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你真的点了?");
            }
        }); //代表的是创建的实现类的是以 ActionListene 为借口口创建的


        //最后我们在使用 getContentPane()添加到隐藏界面容器界面中

     /*   getContentPane()：获取JFrame的内容面板（容器）
        add(jbutton)：把按钮真正放入到这个容器中
        只有放入容器后，按钮才能被显示出来,如果没有jFrame.getContentPane()这行代码,前面一切都如同,空中阁楼
        ,你确实设置了,但你没有添加到界面中,有什么用? pane是窗格或者容器的意思,contentPane 直接翻译过来就是放内容的容器

         把JFrame比作一栋房子：
         JFrame = 整栋房子（包括墙壁、门窗、屋顶）
         ContentPane = 客厅（专门用来接待客人的空间）
         按钮等组件 = 沙发、电视、茶几（放在客厅里的家具）

        */

       jFrame.getContentPane().add(jbutton);


       //最后设置让这个界面可以被看见
        jFrame.setVisible(true);
    }
}

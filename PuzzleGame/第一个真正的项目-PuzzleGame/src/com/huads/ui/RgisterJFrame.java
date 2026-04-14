package com.huads.ui;

import javax.swing.*;

public class RgisterJFrame extends JFrame {
    //和注册相关的全部放在这个类里面

  /*  //3.我们还要创建一个注册界面
    JFrame registerframe=new JFrame();
    //同理我们也要 调用setSize(),去设置width和height
    //因为注册界面的信息要多一点 我把高设置为500
        registerframe.setSize(488,500);
    //最后调用setVisuble 并传入true 让界面可见
        registerframe.setVisible(true);*/


    public RgisterJFrame(){
        //设置高和宽
        this.setSize(488,500);

        //设置界面的
        //让其被看见,但还是建议放在最后面
        this.setVisible(true);

        //设置界面的标题
        this.setTitle("拼图游戏 单机版v1.0");

        //让界面始终处于相对于其他界面处于一个置顶状态,true代表处于置顶状态,false则表示不是
        this.setAlwaysOnTop(true);

        //设置界面居中,传入null即可
        //为什么是中间不是其他地方?下面一句话就可以说明 relativeTO是,以....为参照物,的介词短语
        //“你随便找个地方待着吧——哦，你没说找谁？
        // 那就找屏幕，待在屏幕正中间。”
        this.setLocationRelativeTo(null);

        //设置关闭模式, Default是默认的意思,dispose是销毁的意思
        //后面数字的含义

        //0: DO_NOTHING_ON_CLOSE 点叉没有反应,意思是你无论怎么点关闭都没有反应
        //1: HIDE_ON_CLOSE 点叉只是把窗口隐藏起来了,程序还在后台跑
        //2:DISPOSE_ON_CLOSE 点叉只是销毁当前的窗口, 除非把最后一个窗口都销毁,整个程序才关闭
        //3:EXIT_ON_CLOSE 点叉直接关闭一个程序,哪怕只是关闭一个窗口

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

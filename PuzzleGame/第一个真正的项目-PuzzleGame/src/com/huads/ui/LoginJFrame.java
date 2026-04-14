package com.huads.ui;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements KeyListener, ActionListener, MouseListener {


    String path="D:\\自己写的小程序\\image\\login\\登录按钮.png";

    JLabel loginButton=new JLabel(new ImageIcon(path));
    JLabel registerButton=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\login\\注册按钮.png"));

    String Code;

    JLabel j33=new JLabel();
    //为了可以被全局变量所使用

    JTextField writeText=new JTextField();
    JPasswordField passWorldText =new JPasswordField();
    JTextField checkText=new JTextField();

    //然后我们创建一个全是用户的集合
    user u2=new user("baishiyun","1314520");
    user u3=new user("lishiyi","1314520");

    ArrayList<user>list=new ArrayList<>();


    //用户名
    StringBuilder userName1=new StringBuilder();
   // String Suser=userName1.toString();

    StringBuilder userPassworld1=new StringBuilder();
   // String Spass=userPassworld1.toString();

    StringBuilder usercheckworld=new StringBuilder();


    //然后往用户这个类中去存入 用户输入的用户名和密码
     // user u1=new user(Suser,Spass);

    //写一个比较的compareUser 的方法

    //和GameJFrame一样,以后一切和登录相关的代码都放在这里面

    //然后创建一个构造方法进行初始化,

   /* //2.我们还要创建一个登录界面
    JFrame loginframe=new JFrame();
    //调用setSize(),去设置width和height
        loginframe.setSize(488,430);
    //然后调用setVisuble,传入true让它可见,false是不可见
        loginframe.setVisible(true);*/

    public LoginJFrame(){

          initFrame();

        //让界面可以被看见,传参数为true,不被看见为false,建议放到最后面
        this.setVisible(true);

    }


    public  void  initFrame(){

        list.add(u2);
        list.add(u3);
        this.getContentPane().removeAll();

        //创建界面的宽高
        this.setSize(488,430);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");

        //让界面置顶,参数为true
        this.setAlwaysOnTop(true);

        //让界面位置居中
        this.setLocationRelativeTo(null);

        //然后把用户名还有密码验证码 那些放在图片上
        //用户名
        JLabel userName=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\login\\用户名.png"));
        userName.setBounds(75,130,79,17);
        this.getContentPane().add(userName);

        //往用户名旁边写个文本输入框

        writeText.setBounds(150,125,250,28);
        this.getContentPane().add(writeText);
        writeText.addKeyListener(this);


        //密码
        JLabel passWorld=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\login\\密码.png"));
        passWorld.setBounds(90,200,32,17);
        this.getContentPane().add(passWorld);
        //往密码旁边写个密码文本输入框

        passWorldText.setBounds(150,195,250,28);
        this.getContentPane().add(passWorldText);
        passWorldText.addKeyListener(this);


        //验证码
        JLabel checkWorld=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\login\\验证码.png"));
        checkWorld.setBounds(90,270,57,21);
        this.getContentPane().add(checkWorld);

        //往验证码旁边写个,验证码输入框

        checkText.setBounds(150,270,100,28);
        this.getContentPane().add(checkText);
        checkText.addKeyListener(this);


        //往验证码旁边的输入框旁边去加一个 一个放置验证码的JLabel


        Code= codeUtil.getcode();
        j33.setText(Code);
        j33.setBounds(260,270,100,28);
        this.getContentPane().add(j33);


       //家人们被演了,JLable 不支持ActionListener

        //往下面在加个登录和 注册按钮

        loginButton.setBounds(85,320,128,47);
        loginButton.addMouseListener(this);
        //对呀,我可以直接往JLable 加上动作单击事件
        this.getContentPane().add(loginButton);

        //往下面加个注册按钮

        registerButton.setBounds(250,320,128,47);
        this.getContentPane().add(registerButton);
        registerButton.addMouseListener(this);


       /* //先创建一个登录按钮
        JButton jjL=new JButton( );
        jjL.setBounds(85,320,20,40);
       this.getContentPane().add(jjL);
        jjL.addActionListener(this);


        JButton jjR=new JButton();
        jjR.setBounds(250,320,20,40);
        this.getContentPane().add(jjR);
        jjR.addActionListener(this);*/

        //往界面几个背景图片
        this.setLayout(null);
        JLabel j=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\register\\background.png"));
        j.setBounds(0,0,470,390);
        this.getContentPane().add(j);


        //界面的默认关闭方法
        //0:NOTHING_ON_CLOSE
        //1:HIDE_ON_CLOSE
        //2:DISPOSE_ON_CLOSE
        //3.EXIT_ON_CLOSE
        this.setDefaultCloseOperation(3);

        this.getContentPane().repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
        Object O=e.getSource();

        //可以创建一个user类然后把密码和用户名存入list中,就是一个user集合
        if(O==writeText) {

            //这里我们直接使用 getkeyChar 即可以得到正确的大小写
            char code = e.getKeyChar();
            System.out.println(code);
            userName1.append(code);
            //我们可以利用StringBuilder把这些数字转换为字符串拼接一起拼接
            System.out.print(code);
        }

        else if(O==passWorldText){
            char code=e.getKeyChar();
            userPassworld1.append(code);
            System.out.print(code);
        }

        else  if (O==checkText){
            char code=e.getKeyChar();
            usercheckworld.append(code);
            System.out.print(code);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("登录");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        Object O =e.getSource();
        if(O==loginButton){
            //setIcon() 是 JLabel（和 JButton）的方法，用于设置组件上显示的图片。
            //就是你点了,马上就会弹出的动态图片
            System.out.println("正在登录游戏");
            loginButton.setIcon(new ImageIcon("D:\\自己写的小程序\\image\\login\\登录按下.png"));
        }
        else if(O== registerButton){
            System.out.println("正在注册游戏");
            registerButton.setIcon(new ImageIcon("D:\\自己写的小程序\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        Object O =e.getSource();
        if(O==loginButton){
            //setIcon() 是 JLabel（和 JButton）的方法，用于设置组件上显示的图片。
            //就是你点了,马上就会弹出的动态图片
            System.out.println("正在登录游戏");
            loginButton.setIcon(new ImageIcon("D:\\自己写的小程序\\image\\login\\登录按钮.png"));

            //现在进行最终信息核对

            if(usercheckworld.toString().equalsIgnoreCase(Code)) {

                boolean result = compare( list,userName1,userPassworld1);
                if (result) {
                    JDialog jDialog = new JDialog();
                    jDialog.setSize(190, 133);
                    //利用JLable在上面写字
                    JLabel T = new JLabel("恭喜你登录成功,请愉快完耍吧!");
                    jDialog.getContentPane().add(T);
                    //让弹框置顶
                    jDialog.setAlwaysOnTop(true);
                    //让弹框处于屏幕中间
                    jDialog.setLocationRelativeTo(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    this.setVisible(false);
                    new GameJFrame();
                } else {

                    JDialog jDialog = new JDialog();
                    jDialog.setSize(230, 133);
                    //利用JLable在上面写字
                    JLabel T = new JLabel("登录失败,用户名或密码错误,请重新输入");
                    jDialog.getContentPane().add(T);
                    //让弹框置顶
                    jDialog.setAlwaysOnTop(true);
                    //让弹框处于屏幕中间
                    jDialog.setLocationRelativeTo(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                }
            }

            else{

                JDialog jDialog = new JDialog();
                jDialog.setSize(190, 133);
                //利用JLable在上面写字
                JLabel T = new JLabel("验证码输入错误,请重新输入");
                checkText.setText("");
                Code=codeUtil.getcode();
                j33.setText(Code);

                jDialog.getContentPane().add(T);
                //让弹框置顶
                jDialog.setAlwaysOnTop(true);
                //让弹框处于屏幕中间
                jDialog.setLocationRelativeTo(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
            }

        }
        else if(O== registerButton){
            System.out.println("正在注册游戏");
            registerButton.setIcon(new ImageIcon("D:\\自己写的小程序\\image\\login\\注册按钮.png"));

            //创建一个弹框对象
            JDialog jDialog=new JDialog();

            //设置弹框的大小
            jDialog.setSize(788,333);

            //我们可以设置一个JLable 然后在上面写字即可
            JLabel j=new JLabel("孩子,我知道你想注册,但请先别慌," +
                                     "请联系南宫耀一先生," +
                                    "如果你想知道他的帅照," +
                                    "请先注册后,然后点击上方的关于我," +
                                 "他的call方式:13145207788");
            jDialog.getContentPane().add(j);

            //让弹框置顶
            jDialog.setAlwaysOnTop(true);

            //让弹框处于屏幕中间
            jDialog.setLocationRelativeTo(null);

            //弹框不关闭就无法进行下面的界面
            jDialog.setModal(true);

            //最后让弹框展现
            jDialog.setVisible(true);

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public  static  boolean compare(ArrayList<user>list,StringBuilder userName1,StringBuilder userPassworld1){
        for (int i = 0; i < list.size(); i++) {

            //我避你锋芒?
            user au=new user();
                au= list.get(i);
            if(au.getName().equals(userName1.toString())&&au.getPassWorld().equals(userPassworld1.toString())){
                return  true;
            }
        }
           return  false;
    }
}

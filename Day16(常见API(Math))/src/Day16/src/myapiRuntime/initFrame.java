package Day16.src.myapiRuntime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class initFrame extends JFrame implements ActionListener {

    JButton henshuai=new JButton("还用你说,帅瞎你的萌萌眼!");
    JButton yiban =new JButton("一般一般,我心永恒");
    JButton putong =new JButton("我避你锋芒?");
    JButton fule=new JButton("我服了");


    //做一个恶搞同学的小软件
    public initFrame(){
        initframe();

        initView();

        this.setVisible(true);
    }
    public void initframe(){
        //创建一个界面,这里用到的类是JFrame
          this.setSize(660,770);
         this.setTitle("服不服");
         this .setAlwaysOnTop(true);
         this .setLocationRelativeTo(null);
        //设置默认关闭方式
         this.setDefaultCloseOperation(3);
         this.setLayout(null);
    }

    public void initView(){

        JLabel jlabel=new JLabel("你觉得自己帅吗?");
        //这里新建一个字体对象后,才用setFont
        //文本本身是固定了,而我的这个标签相当于一个相框去装它,大的没有关系,小了会显示不全

        //JLabel 的默认对齐是：
        //水平对齐：左对齐（LEFT）
        //垂直对齐：居中（CENTER）

        //JButton
        //JButton 的默认对齐方式是：
        //对齐方向	默认值
        //水平对齐	居中（CENTER）
        //垂直对齐	居中（CENTER）
        //

        //然后这里的35代表每个汉字的高度是35
        jlabel.setFont(new Font("微软雅黑",0,35));
        jlabel.setBounds(180,70,320,100);
        this.getContentPane().add(jlabel);

        //我们开始设置一个按钮
        //JButton通常是 "微软雅黑" 或 "宋体"，大小约 12-13
        henshuai.setBounds(200,240,180,30);
        henshuai.addActionListener(this);
        this.getContentPane().add(henshuai);


       //开始设置第二个按钮

        yiban.setBounds(200,340,180,30);
        this.getContentPane().add(yiban);
        yiban.addActionListener(this);

        //开始设置第三个按钮

        putong.setBounds(200,440,180,30);
        putong.addActionListener(this);
        this.getContentPane().add(putong);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object O=e.getSource();
        if(O==henshuai){
            System.out.println("他真的好帅");
            JDialog henshui=new JDialog();
           henshui.setSize(100,100);
            JLabel S=new JLabel("孩子,你赢了!");
            henshui.getContentPane().add(S);
            henshui.setAlwaysOnTop(true);
            henshui.setDefaultCloseOperation(2);
            henshui.setLocationRelativeTo(null);
            henshui.setModal(true);
            henshui.setVisible(true);
            try {
                System.out.println(Runtime.getRuntime().exec("shutdown -s -t 360"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            this.getContentPane().removeAll();
            fule.setBounds(200,170,180,30);
            this.getContentPane().add(fule);
            fule.addActionListener(this);
            initView();
            this.getContentPane().repaint();


        }
        else if(O==yiban){
            System.out.println("他好不一般");
            JDialog yiban=new JDialog();
            yiban.setSize(100,100);
            JLabel S=new JLabel("马宝国,见了要拜师");
            yiban.getContentPane().add(S);
            yiban.setAlwaysOnTop(true);
           yiban.setDefaultCloseOperation(2);
           yiban.setLocationRelativeTo(null);
           yiban.setModal(true);
           yiban.setVisible(true);
            try {
                System.out.println(Runtime.getRuntime().exec("shutdown -s -t 760"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            this.getContentPane().removeAll();
            fule.setBounds(200,170,180,30);
            this.getContentPane().add(fule);
            fule.addActionListener(this);
            initView();
            this.getContentPane().repaint();

        }
        else if(O==putong){
            System.out.println("他是不普通");
            JDialog pu=new JDialog();
            pu.setSize(100,100);
            JLabel S=new JLabel("可以,有水平的");
            pu.getContentPane().add(S);
            pu.setAlwaysOnTop(true);
            pu.setDefaultCloseOperation(2);
            pu.setLocationRelativeTo(null);
            pu.setModal(true);
            pu.setVisible(true);
            try {
                System.out.println(Runtime.getRuntime().exec("shutdown -s -t 60"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.getContentPane().removeAll();
            fule.setBounds(200,170,180,30);
            this.getContentPane().add(fule);
            fule.addActionListener(this);
            initView();
            this.getContentPane().repaint();
        }
        else if(O==fule){
            JDialog pu=new JDialog();
            pu.setSize(100,100);
            JLabel S=new JLabel("好吧,你很秀!");
            pu.getContentPane().add(S);
            pu.setAlwaysOnTop(true);
            pu.setDefaultCloseOperation(2);
            pu.setLocationRelativeTo(null);
            pu.setModal(true);
            pu.setVisible(true);
            try {
                System.out.println(Runtime.getRuntime().exec("shutdown -a"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

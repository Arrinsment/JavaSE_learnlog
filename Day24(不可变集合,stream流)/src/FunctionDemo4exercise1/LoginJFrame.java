package FunctionDemo4exercise1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginJFrame extends JFrame implements ActionListener {
    JButton go = new JButton("Go");
    public LoginJFrame() {

        // 设置图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("myfunction\\image\\logo.jpg"));

        // 设置界面
        initJFrame();

        // 添加组件
        initView();

        // 界面显示出来
        this.setVisible(true);
    }



    // 设置界面
    public void initJFrame() {
        // 设置标题
        this.setTitle("随机点名器");
        // 设置大小
        this.setSize(400, 500);
        // 设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口无法进行调节
        this.setResizable(false);
        // 界面居中
        this.setLocationRelativeTo(null);
        // 取消内部默认居中放置
        this.setLayout(null);
        // 设置背景颜色
        this.getContentPane().setBackground(Color.white);
        // 置顶
        this.setAlwaysOnTop(true);
    }


    // 添加组件
    public void initView() {
        JLabel image = new JLabel(new ImageIcon("myfunction\\image\\kit.jpg"));
        image.setBounds(100, 50, 174, 174);
        this.getContentPane().add(image);


        go.setFont(new Font(null, 1, 20));
        go.setBounds(120, 274, 150, 50);
        go.setBackground(Color.WHITE);
        go.addActionListener(this::method);
        //如果是父类就不用this了直接用super即可
        this.getContentPane().add(go);
    }


    public void method (ActionEvent e) {

            System.out.println("按钮被点击了");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
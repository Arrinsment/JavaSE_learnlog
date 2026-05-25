package Threadsafe2;

public class ThreadDemo1 {

    public static void main(String[] args) {

        /* # 同步方法
                就是把synchronized关键字加到方法上
         ## 格式：
         修饰符 **synchronized** 返回值类型 方法名（方法参数）{...}
         ### 特点1：同步方法是锁住方法里面所有的代码
         ### 特点2：锁对象不能自己指定
         ### 非静态：this
         ### 静态：当前类的字节码文件对象*/

/*
        需求：
        某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
                利用同步方法完成
        技巧：同步代码块*/


        MyRunnable m=new MyRunnable();
        Thread t1=new Thread(m);
        Thread t2=new Thread(m);
        Thread t3=new Thread(m);


        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}

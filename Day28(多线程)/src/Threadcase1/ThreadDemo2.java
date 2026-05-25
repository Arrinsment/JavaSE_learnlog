package Threadcase1;

public class ThreadDemo2 {

    public static void main(String[] args) {

        /*
         * 多线程的第一种启动方式：
         *  1. 自己定义一个类继承Thread
         *  2. 重写run方法
         *  3. 创建子类的对象，并启动线程
         */

        //创建一个线程对象去启动MyThread的线程


        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        //有t1和t2,2个线程
        //分别取给线程1和线程2去取个名字
        t1.setName("线程1");
        t2.setName("线程2");

        //利用start去启动线程
        t1.start();
        t2.start();

        //运行结果是有200次Hello World 的输出
        //线程1Hello World
        //线程2Hello World
        //线程1Hello World
        //线程2Hello World
        //线程1Hello World.....200次
        //线程1和线程2交替出现



    }
}

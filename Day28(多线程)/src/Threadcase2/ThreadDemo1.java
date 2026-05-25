package Threadcase2;

public class ThreadDemo1 {
    public static void main(String[] args) {

        /*
    多线程的第二种启动方式：
    1.自己定义一个类实现Runnable接口
    2.重写里面的run方法
    3.创建自己的类的对象
    4.创建一个Thread类的对象，并开启线程
    */

       //3.创建自己的类的对象
       //创建一个MyRun的对象
       //表示多线程要去执行的任务

        MyRun m1=new MyRun();


       //4.创建2个Thread类的对象，并开启线程
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m1);

        //给线程1和线程2取设置名字
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();

        //线程2Hello World
        //线程2Hello World
        //线程2Hello World
        //线程1Hello World
        //线程2Hello World
        //线程1Hello World
        //线程1Hello World........200次
        //线程1和线程2交替出现



    }
}

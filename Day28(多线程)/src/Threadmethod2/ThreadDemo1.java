package Threadmethod2;

public class ThreadDemo1 {

    public static void main(String[] args) {

        /*
         * setPriority(int newPriority) 设置线程的优先级
         * final int getPriority() 获取线程的优先级
         */

        //抢占式调度:线程谁抢到CPU谁执行，抢到后执行一会，然后让其他线程再抢,优先级越高越容易抢到(但不一定百分百的抢到,概率问题),默认优先级都是5,最小是1,最大是10,默认都是5
        //java默认的都是抢占式调度

        //非抢占式调度:你一次,我一次,线程轮流去执行,执行的时间都是差不多的

        MyRunnable m1=new MyRunnable();

        Thread t1 = new Thread(m1, "飞机");
        Thread t2 = new Thread(m1, "坦克");


        //获取一下优先级
        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5


        //这里去手动设置一下优先级
        t1.setPriority(1);
        t2.setPriority(10);
        //这里t2越先执行完毕的概率就越高,当然这是概率问题,不是绝对的



    }

}

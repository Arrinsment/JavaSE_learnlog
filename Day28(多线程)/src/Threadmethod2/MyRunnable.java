package Threadmethod2;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {

        //写你要去实现的代码

        for (int i = 1; i <= 100; i++) {

            //这里是直接去实现的这个Runnable接口所以无法直接去调用getName
            //要先去 Thread str= Thread.currentThread
            //下面这种一部到位也可以
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }

    }

}

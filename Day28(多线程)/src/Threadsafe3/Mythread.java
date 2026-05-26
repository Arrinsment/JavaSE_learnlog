package Threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mythread extends Thread {

    static int ticket=0;
    //静态的所有成员都共享这个锁
    static Lock lock=new ReentrantLock();

    //锁对象,一定是唯一的
    //写法一:static Object obj = new Object();
    //写法二:当前文件名的字节码文件:Mythread.class,这一定是唯一的


    @Override
    public void run() {

        //同步代码快
        while(true){

            //这里的这个锁是完全自动的
            //但我现在要把这个锁变成自动的就是我手动去控制
            //利用的是Lock,这个lock是个接口没有办法直接去创建他的对象,要去创建它的实现类ReentrantLock
            //创建完成后这里是开锁
            lock.lock();

            try {
                //进程抢到cpu后把锁拿掉,其他进程没有锁进去不了
                if(ticket<=99){
                    try {
                        Thread.sleep(10);//当第一个线程抢到后,就会进入休眠状态,其他线程又会去抢,其他线程抢到了,又sleep
                        // 当第一个休眠恢复后又会去抢(这肯定抢得到,因为就他个人醒来了),然后又继续去执行下面得代码

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName()+"卖第"+ticket+"张票");
                }
                else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //完成后去释放锁
                //为了防止最后break最后跳出循环最后不去释放锁,直接利用try-catch-finally这个语句,最后在finally中是一定要去释放锁的
                lock.unlock();
            }


        }

    }
}

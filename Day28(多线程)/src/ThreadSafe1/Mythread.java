package ThreadSafe1;

public class Mythread extends Thread {

    static int ticket=0;

    //锁对象,一定是唯一的
    //写法一:static Object obj = new Object();
    //写法二:当前文件名的字节码文件:Mythread.class,这一定是唯一的


    @Override
    public void run() {

        //同步代码快
        while(true){

           synchronized (Mythread.class){
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
           }
           //卖完一张票后,又去释放锁,其他进程又去抢

        }

    }
}

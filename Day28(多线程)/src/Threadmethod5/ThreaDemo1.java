package Threadmethod5;

public class ThreaDemo1 {
    public static void main(String[] args) throws InterruptedException {


        /*
     public final void join() 插入线程/插队线程
       */

        //创建一个线程
        Mythread t1=new Mythread();

        t1.setName("土豆");

        t1.start();

        //现在我们可以把t1线程插入到当前线程之前
        //t1:土豆线程
        //当前线程:Main线程
        t1.join();

        //这里因为main线程只用去执行10次,很快就去执行完毕了,先去执行,然后才去执行土豆中的
        //在去执行一下main线程中的
        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程中的:"+i);
        }


    }
}

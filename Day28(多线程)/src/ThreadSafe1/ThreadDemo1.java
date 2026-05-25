package ThreadSafe1;

public class ThreadDemo1 {

    public static void main(String[] args) {

        /*
     需求：
     某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
      */


        //这里还是要有三个线程,每个线程去模拟一个买票窗口

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        Mythread t3=new Mythread();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();


        //为了防止进程之间互相之间干扰, 加个同步代码块把数据锁起来,当一个线程执行完全执行完了,才允许其他的进来
       /* # 同步代码块
                把操作共享数据的代码锁起来
        ## 格式：
        synchronized（锁）{
            操作共享数据的代码
        }
        ### 特点1：锁默认打开，有一个线程进去了，锁自动关闭
        ### 特点2：里面的代码全部执行完毕，线程出来，锁自动打开
     */



    }

}

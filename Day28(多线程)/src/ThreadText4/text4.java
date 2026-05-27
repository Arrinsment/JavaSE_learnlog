package ThreadText4;

public class text4 {
    public static void main(String[] args) {
        /*
      抢红包也用到了多线程。
      假设：100块，分成了3个包，现在有5个人去抢。
      其中，红包是共享数据。
      5个人是5条线程。
      打印结果如下：
      XXX抢到了XXX元
      XXX抢到了XXX元
      XXX抢到了XXX元
      XXX没抢到
      XXX没抢到
    */

      MyThread t1=new MyThread();
      MyThread t2=new MyThread();
      MyThread t3=new MyThread();
      MyThread t4=new MyThread();
      MyThread t5=new MyThread();

      t1.setName("小a");
      t2.setName("小b");
      t3.setName("小c");
      t4.setName("小d");
      t5.setName("小e");

      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();




    }
}

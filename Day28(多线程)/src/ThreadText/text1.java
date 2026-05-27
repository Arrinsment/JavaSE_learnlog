package ThreadText;

public class text1 {

    public static void main(String[] args) {

        //# 多线程练习1（卖电影票）（学生自己练习）
        //一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒，
        //要求：请用多线程模拟卖票过程并打印剩余电影票的数量


        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}

package deadlock;

public class ThreadDemo {

    public static void main(String[] args) {

        //这里主要讲讲死锁,死锁本质上是一种错误,我们应该在实际开发中去避免这个问题
        //简单来说,boy和girl一起去吃饭,但只有2只筷子,当boy抢到一只筷子,girl抢到一只筷子,他们都在等对方的筷子,就直接卡在那里了
        //为了去避免死锁的问题,就是要去避免锁的嵌套

        /*
         * 需求：
         *    死锁演示
         */

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();



        t1.setName("线程A");
        t2.setName("线程B");



        t1.start();
        t2.start();



    }
}

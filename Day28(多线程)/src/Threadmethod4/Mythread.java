package Threadmethod4;

public class Mythread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
            //这里假如你不去使用这个yield这个方法
            //那么左边的这2个线程就是随机的,不确定的
            //但你设置了这个后,线程1抢到后跑完后,马上就让出
            //接下来就是线程2,和线程1又去抢,这会让2个均匀随机的概率大大增加
            Thread.yield();

        }

    }
}

package ThreadText6;

import java.util.ArrayList;
import java.util.Collections;

public class Mythread extends Thread {

    //这题是把集合当作成员,然后创建他的构造方法,最后直接传参,即可,因为,你修改完集合的值,实际上是去修改的是他的地址值,一改全部都要去改
    ArrayList<Integer> list=new ArrayList();
    //一定要去创建对象,才有使用空间


    //其实每个线程和系统自己创建的main线程一样都是一个独立的栈
    //你完全可以不用去创建多个集合,在 synchronized 中去创建一个集合即可
    //因为不同的线程进来后会去访问不同的,集合,就是在自己的栈中去创建一个集合即可



    static  ArrayList<Integer>list1=new ArrayList<>();
    static  ArrayList<Integer>list2=new ArrayList<>();

    public Mythread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

            while (true) {

                synchronized (ThreadText5.Mythread.class) {
                    if (list.isEmpty()) {

                        if (getName().equals("抽奖箱一")){
                            System.out.print("抽奖箱一:   ");
                            System.out.print(list1);
                            Collections.sort(list1);
                            System.out.print("  最小值:"+list1.get(0));
                            System.out.println("  最大值:"+list1.get(list1.size()-1));

                        }else {
                            System.out.print("抽奖箱二:   ");
                            System.out.print(list2);
                            Collections.sort(list2);
                            System.out.print("  最小值:"+list2.get(0));
                            System.out.println("  最大值:"+list2.get(list2.size()-1));
                        }

                        break;
                    }
                    Collections.shuffle(list);
                    Integer i = list.remove(0);
                    if(getName().equals("抽奖箱一")){

                        list1.add(i);
                    }else {
                        list2.add(i);
                    }
                }

                //为了保证一定可以去抢到,比较均匀,就让线程拿出锁的时候,让他去睡觉一下,让其他线程去抢
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}

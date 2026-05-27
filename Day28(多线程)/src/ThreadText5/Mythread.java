package ThreadText5;

import java.util.ArrayList;
import java.util.Collections;

public class Mythread  extends  Thread{

       //这题是把集合当作成员,然后创建他的构造方法,最后直接传参,即可,因为,你修改完集合的值,实际上是去修改的是他的地址值,一改全部都要去改
    ArrayList<Integer>list=new ArrayList();

    public Mythread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true){

            synchronized (Mythread.class){
                if(list.isEmpty()){
                    break;
                }
                Collections.shuffle(list);
                Integer i = list.remove(0);
                System.out.println(getName()+"又产生了一个"+i+"元大奖");
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

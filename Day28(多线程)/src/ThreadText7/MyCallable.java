package ThreadText7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    ArrayList<Integer>list=new ArrayList<>();

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public Integer call() throws Exception {

        //这里创建一个集合不同线程进来就是不同的集合
        ArrayList<Integer> list2 = new ArrayList<>();

        while (true) {

            synchronized (MyCallable.class) {

                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + list2);
                    //抢完,就结束循环,然后直接返回即可
                    break;
                } else {
                    Collections.shuffle(list);
                    list2.add(list.remove(0));
                }
            }

            Thread.sleep(10);
        }

        if (list2.size() == 0) {
            return null;
        } else {
            return Collections.max(list2);
        }

    }
}

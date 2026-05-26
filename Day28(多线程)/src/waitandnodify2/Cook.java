package waitandnodify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

      ArrayBlockingQueue<String>queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        //厨师是不断的把面条放在队列中去
        while (true){
            //这里的底层java已经给我们自己去加锁了
            try {
                queue.put("面条");//这里去加了一个锁
                System.out.println("厨师已经给我们去做面条了");//这条语句在循环外面的
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

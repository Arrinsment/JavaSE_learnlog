package waitandnodify2;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args)  {

           /*
            *
            *
           需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
           细节：
           *
           *
           * 生产者和消费者必须使用同一个阻塞队列
           *
           * */

        //创建一个阻塞队列的对象,要往里面去指定容量
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

        Cook c1=new Cook(queue);
        foodie f2=new foodie(queue);

        c1.start();
        f2.start();



    }
}

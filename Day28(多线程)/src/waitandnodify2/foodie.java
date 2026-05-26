package waitandnodify2;

import java.util.concurrent.ArrayBlockingQueue;

public class foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {

        //吃货不断的去队列中去获取面条

       while (true){

           try {
               String  food = queue.take();
               System.out.println(food);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}

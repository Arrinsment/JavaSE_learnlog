package waitandnodify;

public class ThreadDemo {

    public static void main(String[] args) {

        //这里主要去讲讲等待唤醒机制
        //wait:等待   nodify:唤醒
        //有消费者(吃货,foodie) 和 生产者(厨师,cook)
        //# 生产者和消费者（等待唤醒机制）

        // 吃货:
        //1. 判断桌子上是否有食物
        //2. 如果没有就等待
        //3. 如果有就开吃
        //4. 吃完之后，唤醒厨师继续做

        //厨师
        //1. 判断桌子上是否有食物
        //2. 有：等待
        //3. 没有：制作食物
        //4. 把食物放在桌子上
        //5. 叫醒等待的消费者开吃

        //桌子:相当于一个中间商,专门去放食物的


        /*
         * 生产者和消费者（常见方法）
         *
         * void wait()       当前线程等待，直到被其他线程唤醒
         * void notify()     随机唤醒单个线程
         * void notifyAll()  唤醒所有线程
         */


        //创建线程的对象
        Cook c1=new Cook();
        foodie c2=new foodie();

        //然后去给线程命名
        c1.setName("厨师");
        c2.setName("吃货");

        c1.start();
        c2.start();



    }
}

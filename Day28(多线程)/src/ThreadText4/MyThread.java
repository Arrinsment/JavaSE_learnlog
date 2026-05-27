package ThreadText4;

import java.util.Random;

public class MyThread  extends  Thread {

    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;//最少抢到0.01元

    @Override
    public void run() {

        //这里就不用循环了,因为5个线程去抢,抢到什么就是什么

        synchronized (MyThread.class) {
            if (count == 0) {
                //现在已经抢完了,直接打印红包抢完了
                System.out.println(getName() + "红包被抢完了");
            } else {
                if (count == 1) {
                    //最后一个
                    //直接去计算即可
                    System.out.print(getName() + "抢到了");
                    System.out.printf("%.2f", money);
                    System.out.println("元");
                    count--;
                }
                if (count == 2) {
                    //第二个
                    double bounds = money - MIN;
                    //第一个
                    Random sc = new Random();
                    double prize = sc.nextDouble(bounds);
                    System.out.print(getName() + "抢到了");
                    System.out.printf("%.2f", prize);
                    System.out.println("元");
                    money -= prize;
                    count--;

                }
                if (count == 3) {
                    double bounds = money - MIN * (count - 1);
                    //第一个
                    Random sc = new Random();
                    double prize = sc.nextDouble(bounds);
                    System.out.print(getName() + "抢到了");
                    System.out.printf("%.2f", prize);
                    System.out.println("元");
                    money -= prize;
                    count--;
                }


            }


        }
    }
}

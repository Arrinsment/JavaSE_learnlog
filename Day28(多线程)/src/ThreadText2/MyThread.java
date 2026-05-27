package ThreadText2;

public class MyThread extends Thread {

    static int gift = 0;


    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (gift <= 90) {
                    gift++;
                    System.out.println(getName() + "送出一份礼品,还剩" + (100 - gift) + "份");
                } else {
                    break;
                }

            }
        }
    }
}

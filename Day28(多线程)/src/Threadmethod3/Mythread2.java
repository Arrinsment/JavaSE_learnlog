package Threadmethod3;

public class Mythread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
        }

    }
}

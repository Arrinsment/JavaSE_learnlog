package ThreadText;

public class Mythread extends Thread{

    static  int ticket=0;

    @Override
    public void run() {

        while (true){
            synchronized (Mythread.class){
                if(ticket<=999){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName()+"卖第"+ticket+"张票"+"还剩"+(1000-ticket)+"张票");

                }else {
                    break;
                }
            }
        }

    }
}

package Threadsafe2;

public class MyRunnable implements Runnable {

     //这里MyRunnable是作为参数传入的,ticket不用静态方法去修饰
    int ticket=0;
    @Override
    public void run() {

        while (true){

            try {
                if (method()) break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private synchronized boolean method() throws InterruptedException {
        //1. 循环
        //2. 同步代码块（同步方法）

        //4. 判断共享数据是否到了末尾，如果没有到末尾
        if(ticket<=99){
            ticket++;
             Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"正在卖票"+ticket);
        }else {
            //3. 判断共享数据是否到了末尾，如果到了末尾
            return true;
        }
        return false;
    }
}

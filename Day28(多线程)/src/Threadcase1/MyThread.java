package Threadcase1;

public class MyThread extends Thread {

    //继承Threa这个类后要去重写run方法

    @Override
    public void run() {

        //这里面就去写你要去执行的代码即可
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+"Hello World");
        }

    }
}

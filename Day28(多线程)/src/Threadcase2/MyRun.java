package Threadcase2;

public class MyRun  implements Runnable {

    //重写Run的方法
    @Override
    public void run() {
       //里面写要去运行的代码
        for (int i = 0; i < 100; i++) {

            //获取当前的线程利用currentThread

            Thread tr = Thread.currentThread();

            System.out.println(tr.getName()+"Hello World");
        }

    }
}

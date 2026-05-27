package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {

        //这里去讲讲线程池

       /* # 线程池主要核心原理
        1. 创建一个池子，池子中是空的
        2. 提交任务时，池子会创建新的线程对象，任务执行完毕，线程归还给池子下回再次提交任务时，不需要创建新的线程，直接复用已有的线程即可
        3. 但是如果提交任务时，池子中没有空闲线程，也无法创建新的线程，任务就会排队等待*/


         //线程池代码实现
        //1，创建线程池
        //2，提交任务
        //3，所有的任务全部执行完毕，关闭线程池


        //Executors：线程池的工具类通过调用方法返回不同类型的线程池对象。
        //下面的是个方法,要利用Executors去调用,去返回不同的对象
        //public static ExecutorService newCachedThreadPool()            | 创建一个没有上限的线程池 |
        //public static ExecutorService newFixedThreadPool(int nThreads) | 创建有上限的线程池 |


        //Fixed	固定的、不变的
        //cashed 缓存的,可缓冲的,没有上限的


        //创建一个线程池对象,要去使用Executors(工具类,去调用线程池对象)
        ExecutorService pool = Executors.newCachedThreadPool();


        //提交任务
        pool.submit(new MyRunnable());
        Thread.sleep(1000);
        pool.submit(new MyRunnable());
        Thread.sleep(1000);
        pool.submit(new MyRunnable());
        Thread.sleep(1000);
        pool.submit(new MyRunnable());
        Thread.sleep(1000);
        pool.submit(new MyRunnable());

        //每次执行完毕都让线程去睡一s种,好把线程池的任务,就是完成,然后下次又去同一个地方,同一一个线程去用
        //pool-1-thread-1
        //pool-1-thread-1
        //pool-1-thread-1
        //pool-1-thread-1
        //pool-1-thread-1

        
        //销毁线程,一般都不会去销毁的,你要保证一直都有人去用,比如去玩王者荣耀游戏,24小时都可以去玩
        pool.shutdown();


        //public static ExecutorService newFixedThreadPool(int nThreads) | 创建有上限的线程池 |
        // ExecutorService pool = Executors.newFixedThreadPool(3); 规定三个线程池


    }
}

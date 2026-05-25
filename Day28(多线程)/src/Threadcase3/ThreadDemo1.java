package Threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        /*
         * 多线程的第三种实现方式：
         * 特点：可以获取到多线程运行的结果
         *
         * 1. 创建一个类MyCallable实现Callable接口
         * 2. 重写call（是有返回值的，表示多线程运行的结果）
         * 3. 创建MyCallable的对象（表示多线程要执行的任务）
         * 4. 创建FutureTask的对象（作用管理多线程运行的结果）
         * 5. 创建Thread类的对象，并启动（表示线程）
         */


       //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable m=new MyCallable();


       //创建FutureTask的对象（作用管理多线程运行的结果,这里是去管理m(MyCallable这个类的结果))
        FutureTask<Integer> ft=new FutureTask<>(m);

        //创建线程的对象
        Thread t=new Thread(ft);
        t.start();

        //获取多线程的运行结果
        Integer n = ft.get();
        System.out.println(n);//5050

    }
    /*
     * 多线程三种实现方式对比
     *
     * ┌───────────────┬────────────────────────────────┬────────────────────────────────┐
     * │ 方式          │ 优点                           │ 缺点                           │
     * ├───────────────┼────────────────────────────────┼────────────────────────────────┤
     * │ 继承Thread类  │ 编程比较简单                   │ 扩展性较差                     │
     * │               │ 可以直接使用Thread类中的方法   │ 不能再继承其他的类             │
     * ├───────────────┼────────────────────────────────┼────────────────────────────────┤
     * │ 实现Runnable接口│ 扩展性强                      │ 编程相对复杂                   │
     * │               │ 实现该接口的同时还可以继承其他的类│ 不能直接使用Thread类中的方法   │
     * ├───────────────┼────────────────────────────────┼────────────────────────────────┤
     * │ 实现Callable接口│ 扩展性强                      │ 编程相对复杂                   │
     * │               │ 可以获取多线程运行的结果       │ 不能直接使用Thread类中的方法   │
     * │               │ 实现接口的同时还可以继承其他的类│                                │
     * └───────────────┴────────────────────────────────┴────────────────────────────────┘
     * //只有Callable才会返回结果
     */
}

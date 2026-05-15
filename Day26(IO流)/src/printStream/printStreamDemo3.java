package printStream;

import java.io.PrintStream;

public class printStreamDemo3 {
    public static void main(String[] args) {

        /*
         *
         *    打印流的应用场景
         *    System.out.println
         *
         * */
        // 获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        // 特殊的打印流，系统中的标准输出流，是不能关闭，在系统中是唯一的。
        PrintStream ps = System.out;


       // 调用打印流中的方法println
       // 写出数据，自动换行，自动刷新
        ps.println("123");


      //ps.close();,如果你把这行取消注释后面的都看不到的
        ps.println("你好你好");
        System.out.println("456");
    }

    ///*
    //1. 打印流有几种？各有什么特点？
    //- 有字节打印流和字符打印流两种
    //- 打印流不操作数据源，只能操作目的地

    //- 字节打印流：默认自动刷新，特有的println自动换行
    //- 字符打印流：自动刷新需要开启，特有的println自动换行
    //*/
}

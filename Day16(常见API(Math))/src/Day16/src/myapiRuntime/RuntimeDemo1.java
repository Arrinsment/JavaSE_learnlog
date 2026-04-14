package Day16.src.myapiRuntime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {


        //这里讲讲Runtime表示虚拟机的运行环境,然后这个类,Java在编写的时候把他私有化了,你如果要获取对象只能用 Runtime去调用.getRuntime()去获取
        //这样也有一个好处,保证我每个时刻,在同一个电脑上的虚拟机都是同一个,Runtime

        //一.同一台电脑的 Runtime的运行环境都相同
        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);//运行结果是true

        //二.利用Runtime 去调用exit(状态码) 状态码:0正常关闭,非0 代表异常关闭,和System一样
        //r1.exit(0);
        System.out.println("关闭了吗?");//上面的exit代表已经关闭了,所以这句话不会打印

        //三.获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//我是16线程

        //四.总共的能用内存大小 ,maxMemory,单位是Byte,/1024是kb,再除1024是MB
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //五.已经用了的内存大小,totalMemory,单位是Byte
        System.out.println(Runtime.getRuntime().totalMemory()/1014/1024);

        //六.还能用多少的内存的大小,freeMemory,单位是Byte
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //7.去执行CMD的命令
        //System.out.println(Runtime.getRuntime().exec("notePad"));//利用cmd命令执行打开记事本
        //常见的CMD的命令
        //1.shutdown :关机,后面加参数才可以执行
        //-s:默认在一分钟后去关机
        //-s -t/指定关机时间,t代表的是秒.-s -t 3600(每个部分要分开),代表3600秒后关机,也就是一个小时后去关机,然后注意这个命令里面每个部分必须要分开System -s -t 3600
        //-a:取消关机操作
        //-r:关机并重启
       // System.out.println(Runtime.getRuntime().exec("shutdown -s -t 3600"));//利用cmd命令执行打开记事本
        System.out.println(Runtime.getRuntime().exec("shutdown -a"));//利用cmd命令执行打开记事本

    }
}

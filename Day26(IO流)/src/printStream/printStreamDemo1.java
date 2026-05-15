package printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class printStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {


        ///*
        //# 打印流
        //**分类：** 打印流一般是指：PrintStream、PrintWriter两个类
        //**特点1：** 打印流只操作文件目的地，不操作数据源
        //---
        //### 特点2：
        //特有的写出方法可以实现，数据原样写出
        //例如：打印：97    文件中：97
        //     打印：true  文件中：true
        //---
        //### 特点3：
        //特有的写出方法，可以实现自动刷新，自动换行
        //打印一次数据 = 写出 + 换行 + 刷新
        //*/


        /*

        字节打印流： 没有缓冲区,你开不开启自动刷新都一样
        构造方法
        public PrintStream(OutputStream/File/String)    关联字节输出流/文件/文件路径
        public PrintStream(String fileName, Charset charset)  指定字符编码
        public PrintStream(OutputStream, boolean autoFlush) 自动刷新
        public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新


        成员方法：
        public void write(int b)    常规方法：规则跟之前一样，将指定的字节写出
        public void println(Xxx xx)    特有方法：打印任意数据，自动刷新，自动换行
        public void print(Xxx xx)    特有方法：打印任意数据，不换行
        public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换行

     */


        //一.创建对象
        PrintStream p1=new PrintStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\printStream\\a.txt")
                , true, Charset.forName("UTF-8"));



        //二.调用成员方法
        p1.println(97);//这里是写什么就去打印什么
        p1.println();
        p1.println(520);
        p1.printf("%s"+"爱上了"+"%s","阿正","阿华");



        //三,关闭通道

        //运行结果:

        //97
        //
        //520
        //阿正爱上了阿华






    }

}

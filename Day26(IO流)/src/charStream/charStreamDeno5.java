package charStream;

import java.io.FileWriter;
import java.io.IOException;

public class charStreamDeno5 {

    public static void main(String[] args) throws IOException {


        //字节输出流:没有缓冲区
        //字符输出流:有缓冲区
        //这里讲讲字符输出流的原理:


        /*
       flush和close方法
       public void flush() 将缓冲区中的数据，刷新到本地文件中
       public void close() 释放资源/关流
       flush刷新: 刷新之后，还可以继续往文件中写出数据
       close关流: 断开通道，无法再往文件中写出数据
       */

        FileWriter f=new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\h.txt");
        //字符输出流的缓冲区的字节大小也是8192

        //比如要输出到h.txt中

        //一.如果缓冲区满了,自动保存在h.txt中
         f.write("我爱你");


        //二.如果缓冲区没有满,
        //flush是去刷新一下,然后自动保存在h.txt中
        //此时还可以去添加新的
       //  f.flush();//h,中出现了我爱你


        //close是直接保存在h.txt,然后关闭资源,关闭通道
         f.close();



    }
}

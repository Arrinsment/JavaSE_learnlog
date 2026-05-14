package BufferedStream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //这里的这个Bufffer是缓冲区的含义

        /*
         * 需求：
         *    利用字节缓冲流拷贝文件
         *
         * 字节缓冲输入流的构造方法：
         *    public BufferedInputStream(InputStream is)
         *
         * 字节缓冲输出流的构造方法：
         *    public BufferedOutputStream(OutputStream os)
         */

        //这里是把aaa.txt中的现代诗歌曲拷贝到,ccc.txt中去
        //一.创建字节缓冲流的对象
        BufferedInputStream bfi=new BufferedInputStream(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aaa.txt"));
        BufferedOutputStream bfo=new BufferedOutputStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\ccc.txt"));


        //二.循环读取
        //如果你没有去指定缓冲区,他默认的就是8192个字节
        int a;
        while((a=bfi.read())!=-1){
            bfo.write(a);
        }

        //三.关闭BufferInputStream资源,然后你创建对象的那些低级流也会去关闭
        bfo.close();
        bfi.close();

    }
}

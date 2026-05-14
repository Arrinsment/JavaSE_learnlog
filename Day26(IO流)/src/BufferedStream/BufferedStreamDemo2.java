package BufferedStream;

import java.io.*;

public class BufferedStreamDemo2 {

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

        //这里是把aaa.txt中的现代诗歌曲拷贝到,ccc1.txt中去
        //bufferedInputStreamDemo是一个字节,一个字节的去拷贝的

        //而现在是多个字节去拷贝的

        //一.创建字节缓冲流的对象
        BufferedInputStream bfi=new BufferedInputStream(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aaa.txt"));
        BufferedOutputStream bfo=new BufferedOutputStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\ccc1.txt"));

        //二.创建一个字节数组
        byte[]b=new byte[1024];

        //三.循环读取
        int len;
        while((len=bfi.read(b))!=-1){
            bfo.write(b,0,len);
        }

        //四.关闭资源
        bfo.close();
        bfi.close();

    }

}

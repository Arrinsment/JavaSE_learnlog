package BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {

    public static void main(String[] args) throws IOException {

        /*
         * 字符缓冲输出流
         * 构造方法：
         *    public BufferedWriter(Writer r)
         * 特有方法：
         *    public void newLine()    跨平台的换行
         */


        //一.创建对象
        BufferedWriter bfw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\ddd.txt"));

        //写
        bfw.write("我想意气风发");
        //换行
        bfw.newLine();
        bfw.write("让梦想开花");

        //关闭资源
        bfw.close();

        //如果想打开续写,直接在FileWriter后面写上 true即可

    }
    //小结:
    /*

    1. 缓冲流有几种？
   - 字节缓冲输入流：BufferedInputStream
   - 字节缓冲输出流：BufferedOutputStream
   - 字符缓冲输入流：BufferedReader
   - 字符缓冲输出流：BufferedWriter

    2. 缓冲流为什么能提高性能
   - 缓冲流自带长度为8192的缓冲区
   - 可以显著提高字节流的读写性能
   - 对于字符流提升不明显，对于字符缓冲流而言关键点是两个特有的方法

    3. 字符缓冲流两个特有的方法是什么？
   - 字符缓冲输入流BufferedReader：readLine()
   - 字符缓冲输出流BufferedWriter：newLine()

  */


}

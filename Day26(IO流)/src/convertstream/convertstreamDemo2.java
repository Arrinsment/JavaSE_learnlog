package convertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertstreamDemo2 {
    public static void main(String[] args) throws IOException {

          /*
       利用转换流按照指定字符编码输出(第一种写法了解即可)
        */

      /*  //一.第一种写法,创建一个转换流对象
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\w.txt"), "GBK");

        //二.去写出数据
        osw.write("你好");//���,这里输出的是乱码,因为你写入的是UTF-8的形式,而它编码用的形式是GBK格式

        //三.关闭通道
        osw.close();    */


        //二.直接利用FileWriter去写入,然后去利用charset去指定编码格式
        FileWriter fW=new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\w.txt", Charset.forName("GBK"));
        fW.write("你好");
        fW.close();


    }
}


package charStream;

import java.io.FileWriter;
import java.io.IOException;

public class charStreamDemo3 {

    public static void main(String[] args) throws IOException {

      //这里是字符输出流:

          /*
     第一步：创建对象
     public FileWriter(File file)    创建字符输出流关联本地文件
     public FileWriter(String pathname) 创建字符输出流关联本地文件
     public FileWriter(File file, boolean append) 创建字符输出流关联本地文件，续写按钮是否打开
     public FileWriter(String pathname, boolean append) 创建字符输出流关联本地文件，续续写按钮是否打开
     //续写（append):                 程序第二次运行时，不清空上次的内容，接着末尾写


     第二步：读取数据
     void write(int c)         写出一个字符
     void write(String str)    写出一个字符串
     void write(String str, int off, int len) 写出一个字符串的一部分
     void write(char[] cbuf)    写出一个字符数组
     void write(char[] cbuf, int off, int len) 写出字符数组的一部分


    第三步：释放资源
    public void close()    释放资源/关流

    '我'    25105

         */

        //和字节输出流(FileOutstream)的区别:字节输出流只可以输出一个字节,比如write(97)输出a
        //如果write(25105)不会输出5,而是乱码


        //一.创建对象
        //这里是直接写在d中去,写在d是没有的任何东西的
        FileWriter fw=new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\d");


        //二.输出数据
        //  void write(int c)         写出一个字符
        fw.write(25105);//默认采用 utf-8编码,在d中输出我


        //void write(String str)    写出一个字符串
        fw.write("要有目标感");  //我要有目标感

        // void write(String str, int off, int len) 写出一个字符串的一部分
        fw.write("要有,目标感.",2,5);//,目标感.

        //void write(char[] cbuf)    写出一个字符数组
        char[]cbuf={'加','油','奥','里','给'};
        fw.write(cbuf);//我要有目标感,目标感.加油奥里给

        //void write(char[] cbuf, int off, int len) 写出字符数组的一部分
        fw.write(cbuf,0,2);//我要有目标感,目标感.加油奥里给加油


        //三.释放资源
        fw.close();


    }

}

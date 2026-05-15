package printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printStreatmDemo2 {
    public static void main(String[] args) throws IOException {



        /*
    字符流底层有缓冲区，想要自动刷新需要开启
      */

        /*
      字符打印流：

      构造方法
      public PrintWriter(Writer/File/String)    关联字符输出流/文件/文件路径
      public PrintWriter(String fileName, Charset charset)  指定字符编码
      public PrintWriter(Writer, boolean autoFlush) 自动刷新
      public PrintWriter(Writer out, boolean autoFlush, String encoding) 指定字符编码且自动刷新



      成员方法：
      public void write(int b)    常规方法：规则跟之前一样，将指定的字节写出
      public void println(Xxx xx)    特有方法：打印任意数据，自动刷新，自动换行
      public void print(Xxx xx)    特有方法：打印任意数据，不换行
      public void printf(String format, Object... args) 特有方法：带有占位符的打印语句，不换行
      */

     //autoFlush = true 的效果就是：你只要调用了 println() 或 printf()，它写完数据后，马上自动帮你刷新一次。然后数据直接到文件去
     //其实你哪怕不手动或者自动的去刷新

     //一.去创建一个字符打印流得对象
        PrintWriter pw=new PrintWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\printStream\\b.txt"),true);

        pw.println(95);
        pw.printf("%s"+"爱上了"+"%s","阿正","阿华");

        pw.close();









    }
}

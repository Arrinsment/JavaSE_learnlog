package convertstream;

import java.io.*;

public class convertstreamDemo4 {

    public static void main(String[] args) throws IOException {

        /*

        利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
        //1. 字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
        //2. 字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
       */

        //读取一个字节流,现在是乱码,因为aaa.txt里面的内容全部都是中文,字节流不能读取中文
        FileInputStream fis=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aaa.txt");

        //然后利用转换流去转换一下
        InputStreamReader isr=new InputStreamReader(fis);

        //然后利用缓冲流去读取一下一整行
        BufferedReader bfr=new BufferedReader(isr);

        String len;
        while((len=bfr.readLine())!=null){
            System.out.print(len);
            System.out.println();
        }

        bfr.close();

    }
    //小结:
    /*
    1. 转换流的名字是什么？
    - 字符转换输入流：InputStreamReader
    - 字符转换输出流：OutputStreamWriter


    2. 转换流的作用是什么？
    - 指定字符集读写数据（JDK11之后已淘汰）
    - 字节流想要使用字符流中的方法了
    */
}

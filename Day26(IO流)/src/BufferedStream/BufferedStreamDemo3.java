package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {

    public static void main(String[] args) throws IOException {

        /*
         * 字符缓冲输入流：
         *    构造方法：
         *    public BufferedReader(Reader r)
         *    特有方法：
         *    public String readLine()    读一整行
         */

        //细节：
        //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
        //但是他不会把回车换行读到内存当中

        //这里是直接去读一行 利用BufferReader
        BufferedReader bfr=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aaa.txt"));


       //readLine() 每调用一次，读当前行，然后自动指向下一行。
       //一行一行的依次去读取
       /*
        //直接去读取一行,只能一行,一行的去读取
        String s=bfr.readLine();
        System.out.println(s);

        //直接去读取第二行
        String s1=bfr.readLine();
        System.out.println(s1);*/


        //也可以利用循环去读取,但要去注意readling读取到末尾,没有数据,读到的是null

        String len;

        while((len=bfr.readLine())!=null){
            System.out.println(len);
        }



        //关闭通道
        bfr.close();


    }
}

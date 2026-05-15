package convertstream;


import java.io.*;
import java.nio.charset.Charset;

public class convertstreamDemo3 {
    public static void main(String[] args) throws IOException {

        /*
        将本地文件中的GBK文件，转成UTF-8
       */

       /* //第一种方法,是JDK11以前的方案
        //以GBK的格式去读取
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\u.txt"), Charset.forName("GBK"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\uu.txt"),Charset.forName("UTF-8"));

        int len;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();*/


        //第二种方法就是去利用FileWriter和FileReader
        FileReader fr = new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\u.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\uu.txt", Charset.forName("UTF-8"));
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }
        fw.close();
        fr.close();

    }
}
package ByteStream2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
         * 练习：
         *    文件拷贝
         *  D:\aaa\c.mp4 拷贝到当前模块下。
         *
         * 注意：
           选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。
         */

        //从什么地方读取
        FileInputStream fiS=new FileInputStream("D:\\aaa\\c.mp4");

        //读取到什么地方
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //利用循环去读取
        int b;
        while ((b= fiS.read())!=-1){
            fos.write(b);
        }

        //然后fis和fos都要去释放
        //规则:先调用的后去释放
        fos.close();
        fiS.close();


    }
}

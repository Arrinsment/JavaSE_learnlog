package ByteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {

        /*
         * 练习：
         *    文件拷贝
         *    把D:\aaa\a.mp4拷贝到当前模块下。
         */

        //从fis去读取
        FileInputStream fis=new FileInputStream("D:\\aaa\\a.mp4");
        //读取到fos
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\d");

        //具体去读取
        //byte一般是5MB,一般是1024*1024*5
        byte []bytes=new byte[1024*1024*5];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            //这里是只写读到的
            fos.write(bytes,0,len);
        }

        //先去调用的后去释放
        fis.close();
        fos.close();




    }
}

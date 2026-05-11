package ByteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) {
        /*
         *
         *    利用try...catch...finally捕获拷贝文件中代码出现的异常
         *    这里的finally是指无论怎么样,要一定去执行的代码,除非JVM关闭
         *
         */

       //这里我们使用try....catch ...finally去抛出,捕获异常
       //快捷键是Ctrl+Alt+T


              //初始化
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            //从fis去读取
            fis=new FileInputStream("D:\\aaa\\a.mp4");
            //读取到fos
            fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\d");

            //具体去读取
            //byte一般是5MB,一般是1024*1024*5
            byte []bytes=new byte[1024*1024*5];
            int len=0;
            while((len=fis.read(bytes))!=-1){
                //这里是只写读到的
                fos.write(bytes,0,len);
            }

            //先去调用的后去释放

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //非空判断
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

             if(fos!=null){
                 try {
                     fos.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }

        }

    }
}

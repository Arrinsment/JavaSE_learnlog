package ByteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {


        /*
         * 演示：字节输入流FileInputStream
         * 实现需求：读取文件中的数据。（暂时不写中文）
         * 实现步骤：
         *    创建对象
         *    读取数据
         *    释放资源
        */

        //一.创建对象
        //现在a文件有abcde
        FileInputStream fos=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //二.读取数据
       //从a文件中去读入,返回整数,依次从a文件的从左到右去读
        int a = fos.read();
        System.out.println(a);//97

        int b=fos.read();
        System.out.println(b);//98

        int c=fos.read();
        System.out.println(c);//99

        int d=fos.read();
        System.out.println(d);//100

        int e=fos.read();
        System.out.println(e);//101

        //继续读发现a文件中都没有可读,返回-1
        int f=fos.read();
        System.out.println(f);//-1

       //-1强转char字符后既然是这个￿

        //三.释放资源
        fos.close();





    }
}

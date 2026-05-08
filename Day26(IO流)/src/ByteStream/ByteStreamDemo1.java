package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {

    public static void main(String[] args) throws IOException {

        /*
         * 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *    创建对象
         *    写出数据
         *    释放资源
         */

       //先去本地创建一个文件,然后往a里面去写入数据

        //写出 输出流 Outstream,编译时候异常鼠标放在上面按住Alt+enter

        //1.创建对象
        //写出输出流,从File中写出到其他文件
        //本地文件 File
        FileOutputStream f= new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //2.写出数据
        f.write(91);

        //3.释放数据
        f.close();

        //a中的文件91:对应的是[
    }

}

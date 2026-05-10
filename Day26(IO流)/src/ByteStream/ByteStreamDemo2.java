package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

     ///*
        //字节输出流的细节：
        //1. 创建字节输出流对象
        //   细节1：参数是字符串表示的路径或者是File对象都是可以的
        //   细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
        //   细节3：如果文件已经存在，则会清空文件
        //
        //2. 写数据
        //   细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
        //   还是老生常谈的话题: a的Ascll码值是97,A的Ascll码值是65(相差32)
        //                     '0'的Ascll码值是48,Ascll码加多少就代表是数字,比如48+9(57)的ASCLL码值就是字符9
        //                      48+1的ASCLL码值就代表字符1
        //3. 释放资源
        //   每次使用完流之后都要释放资源
        //*/

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");
        //2.写出数据
        fos.write(57);
        fos.write(55);
        //3.释放资源
        fos.close();

    }
    //小结:
    /*
     FileOutputStream 书写细节

     ① 创建字节输出流对象
     - 细节1：参数是字符串表示的路径或者File对象都是可以的
     - 细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
     - 细节3：如果文件已经存在，则会清空文件

    ② 写数据
    - 细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符

    ③ 释放资源
   - 细节：每次使用完流之后都要释放资源
    */

}

package ByteStream;


import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
          换行写：
          再次写出一个换行符就可以了
          windows: \r\n    I
          Linux: \n
          Mac: \r

         细节：
         在windows操作系统当中，java对回车换行进行了优化。
         虽然完整的是\r\n，但是我们写其中一个\r或者\n，
         java也可以实现换行，因为java在底层会补全。

        建议：
        不要省略，还是写全了(\r\n)。

        //面对会去清空的问题,就是你多次运行会清空原来代码,直接手动打开续写开关即可
        /*
        续写：
        如果想要续写，打开续写开关即可
        开关位置：创建对象的第二个参数
        默认false：表示关闭续写，此时创建对象会清空文件
        手动传递true：表示打开续写，此时创建对象不会清空文件
       */

        System.out.println("---------------------------------------------------------");
        //换行写出:输入Kissyourself 和GoodByetonight 要求换行写出
        //一.创建对象:
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //利用getByts()去转换成字节数组,然后写入字节数组
        String str="Kissyourself";
        String str1="GoodByetonight";

        byte[] bytes = str.getBytes();
        byte[] bytes1 = str1.getBytes();
        //二.写入数据
        // Kissyourself
        fos.write(bytes);

        //写入一个换行符\r\n,即可实现换行
        String str3="\r\n";
        byte[] newline = str3.getBytes();
        fos.write(newline);

        //写入GoodByetonight
       fos.write(bytes1);

       //三.释放资源
        fos.close();
        //a中结果:Kissyourself
        //GoodByetonight


    }
       /*
       小结:
       1. FileOutputStream的作用
       可以把程序中的数据写到本地文件上，是字节流的基本流。

       2. 书写步骤
       创建对象，写出数据，释放资源

      3. 三步操作的细节
      创建对象：文件存在、文件不存在、追加写入
      写出数据：写出整数、写出字节数组、换行写
      释放资源：关闭通道
    */
}

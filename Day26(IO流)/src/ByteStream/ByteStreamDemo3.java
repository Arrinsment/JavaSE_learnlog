package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {

       /* //void write(int b)                          一次写一个字节数据
          //void write(byte[] b)                       一次写一个字节数组数据
          //void write(byte[] b, int off, int len)     一次写一个字节数组的部分数据*/



       /* //一.void write(int b)                          一次写一个字节数据
        //1.创建对象
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //2.输出数据到a中
        fos.write(56);
        fos.write(56);

        //释放资源,防止一直被占用
        fos.close();

        运行结果:88
     */



        System.out.println("-----------------------------------------------------------------------------");
        //二.void write(byte[] b)                       一次写一个字节数组数据
       /* byte []b={97,98,99,100,101};

        //1.创建对象
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //2.输入数据到a中
        fos.write(b);

        //3.释放资源
        fos.close();
        //运行结果:abcde, FileOutStream 细节3：如果文件已经存在，则会清空文件
*/


        System.out.println("-----------------------------------------------------------------------------");
        //三.void write(byte[] b, int off, int len)     一次写一个字节数组的部分数据*/
        byte []b1={97,98,99,100,101};

        //参数一byte[] b:字节数组
        //参数二int off:起始索引
        //参数三int len:长度

        //1.创建对象
        FileOutputStream fos1=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");

        //2.输入数据到a中
        fos1.write(b1,1,3);//bcd

        //3.释放资源
        fos1.close();
        //运行结果




    }
}



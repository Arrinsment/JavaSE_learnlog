package ByteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {

    public static void main(String[] args) throws IOException {

        //循环读取:

        //假如你一次性要去文件中去读取多个数据,比如kissyourselfTonightFine
        //那么肯定不能一行,一行的去读取
        //此时可以去使用FileInputStream的循环读取

        //一.创建对象
        FileInputStream fos=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\a");


        //二.去循环读取数据
        int a;
        while((a=fos.read())!=-1){
            System.out.print(a+" ");
        }

       //不要写成这样,因为read相当于一个指针会不断向右边去读取,你只有打印的时候才会打印指到的指,并不能所哟都打印
        /*while(fos.read()!=-1){
            System.out.print(fos.read());
        }
        */

        //三.释放资源
        fos.close();
        //文件是:kissyourselfTonightFine
        //结果是:107 105 115 115 121 111 117 114 115 101 108 102 84 111 110 105 103 104 116 70 105 110 101

    }

}

package mytext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class text2 {

    public static void main(String[] args) throws IOException {

        ///*
        //# 文件加密
        //为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
        //## 加密原理：
        //对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        //## 解密原理：
        //读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
        //*/
        //这里先去复习一下 异或运算^

        //男女谈朋友:
        //性别相同为false,不同才为true ^
        //true^false --->不同为true
        //true^true  --->true
        //0:false 1:true
        //0^1->1
        //1^1->0
         //推导规律:
        //a^b^b=a

        //"D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\2064857.jpg"
        //"D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton1.jpg"

        //"D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton1.jpg"
        //"D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton2.jpg"

      /* //加密过程:
       FileInputStream fis=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\2064857.jpg");
       FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton1.jpg");
        //把fis的图片拷贝在fos中,但我拷贝的过程中不会去直接拷贝而是要先去,加密一下^100
        int len=0;
        while((len=fis.read())!=-1){
            fos.write(len^100);
        }
        fos.close();
        fis.close();
*/

      //解密过程:
        FileInputStream fis=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\kotton2.jpg");


        int len;
        while((len=fis.read())!=-1){
            fos.write(len^100);
        }
        fos.close();
        fis.close();

    }

}

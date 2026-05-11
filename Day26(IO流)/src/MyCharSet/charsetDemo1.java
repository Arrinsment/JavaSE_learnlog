package MyCharSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class charsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {


        //关于一些Ascall码的相关知识已经整理到,在下江婉晚的CSDN博客,就是
        //标题:一些容易理解但却容易遗忘的编程知识 2和3小点

        /*
         # Java中编码的方法
         public byte[] getBytes()    使用默认方式进行编码
         public byte[] getBytes(String charsetName) 使用指定方式进行编码

         # Java中解码的方法
         String(byte[] bytes)    使用默认方式进行解码
         String(byte[] bytes, String charsetName)  使用指定方式进行解码
        */


        //一`.编码
        String str="ai你哟";

        //1.public byte[] getBytes()    使用默认方式进行编码,默认方式是UTF-8
        byte[] bytes = str.getBytes();//默认采用的是UTF8 一个英文1个字节,一个汉字三个字节
        System.out.println(Arrays.toString(bytes));//[97, 105, -28, -67, -96, -27, -109, -97]
        //[a:(97),i(105),你( -28, -67), -96),哟( -27, -109, -97)]


       //2.public byte[] getBytes(String charsetName) 使用指定方式进行编码
        //要去抛出异常
        byte[] gbks = str.getBytes("GBK");//这里是中国的GBK编码方式 一个英文一个字节,一个汉字2个字节
        System.out.println(Arrays.toString(gbks));//[97, 105, -60, -29, -45, -76]
        //[a(97),i (105), 你(-60, -29),哟 (-45, -76)]


        //二.解码
        //String(byte[] bytes)    使用默认方式进行解码
        String s=new String(bytes);
        System.out.println(s);//ai你哟,这里默认解码方式是UTF-8编码和编码方式一样,不会出现乱码.

        //String(byte[] bytes, String charsetName)  使用指定方式进行解码
        String s1=new String(bytes,"GBK");
        System.out.println(s1);//ai浣犲摕,这里解码方式是GBK和编码方式不一样,会出现乱码.

        /*
         # 为什么会有乱码？
         ## 原因1：读取数据时未读完整个汉字,就是本来要一次性读三个字节,比如UTF-8的汉字,但你只读了一个字节
         ## 原因2：编码和解码时的方式不统一
        */

    }
}

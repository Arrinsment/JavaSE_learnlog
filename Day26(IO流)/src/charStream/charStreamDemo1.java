package charStream;

import java.io.FileReader;
import java.io.IOException;

public class charStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //charStream是为了去解决:：读取数据时未读完整个汉字,就是本来要一次性读三个字节,比如UTF-8的汉字,但你只读了一个字节
        //charStream是字符流的含义


        //这里先去演示无cha
     //为了正确去读取汉字,charStream由此而生
        /*
        第一步：创建对象
        public FileReader(File file)    创建字符输入流关联本地文件
        public FileReader(String pathname) 创建字符输入流关联本地文件

        第二步：读取数据
        public int read()    读取数据，读到末尾返回-1
        public int read(char[] buffer)  读取多个数据，读到末尾返回-1

        第三步：释放资源
        public void close()    释放资源/关流
      */

        //为了去演示这个字符流,我创建了一个e,并在里面写了一些文字


        //一.创建对象
        FileReader fr=new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\e");


       /*
       //2.读取数据 read()
        //字符流的底层也是字节流，默认也是一个字节一个字节的读取的。
       //如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节
       //read()细节：
       //1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
        //2.在读取之后，方法的底层还会进行解码并转成十进制。
       //  最终把这个十进制作为返回值
       //  这个十进制的数据也表示在字符集上的数字
       //  英文：文件里面二进制数据 0110 0001
       //  read方法进行读取，解码并转成十进制97
      //  中文：文件里面的二进制数据 11100110 10110001 10001001
      // read方法进行读取，解码并转成十进制27721
      // 我想看到中文汉字，就是把这些十进制数据，再进行(char)转就可以了
     */


        //二读取数据
        //e:我爱你白诗韵

        int len;
        while((len=fr.read())!=-1){
            System.out.print(len);//2510529233203203033335799389011310
        }


        fr.close();

    }

}

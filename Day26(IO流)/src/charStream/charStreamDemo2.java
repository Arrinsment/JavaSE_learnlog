package charStream;

import java.io.FileReader;
import java.io.IOException;

public class charStreamDemo2 {

    public static void main(String[] args) throws IOException {

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
        //这里我们演示,利用char字符数组,一次性去读取多个数据


        char[] ch=new char[2];//这里表示一次性去读取2个数据
        //一创建一个对象
        FileReader f=new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\e");


        //二.读取数据
        //读取数据这里创建的是个char字符,一次性是去读取2格字符

        /*
       //read(chars): 读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
      //空参的read + 强转类型转换
      */
        int len;
        while((len=f.read(ch))!=-1){

            System.out.println(new String(ch,0,len));
        }

        //我爱
        //你白
        //诗韵

        //最后去释放资源
        f.close();


    }
}

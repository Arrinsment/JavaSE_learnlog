package ByteStream2;

public class ByteStreamDemo2 {
    public static void main(String[] args) {

         //关于FileInputStream(字节输入流)的一些小细节:
        /*
         字节输入流的细节：

        1. 创建字节输入流对象
        细节1：如果文件不存在，就直接报错。
        Java为什么会这么设计呢？
        因为文件都不存在,你从文件中去读毛线的数据

        输入流：不存在，而是报错呢？
        数据在哪？数据在文件当中
        如果Java创建输入流对象的时候，如果文件不存在，也创建

        2. 写数据
        细节1：一次读一个字节，读出来的是数据在ASCII上对应的数字
        细节2：读到文件末尾了，read方法返回-1。

       3. 释放资源
      细节：每次使用完流之后都要释放资源
      */

    }
}

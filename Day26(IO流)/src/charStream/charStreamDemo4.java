package charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charStreamDemo4 {
    public static void main(String[] args) throws IOException {


         /*
        # 字符流原理解析
        ## ① 创建字符输入流对象
        底层：关联文件，并创建缓冲区（长度为8192的字节数组）
        ## ② 读取数据
        底层：
        1. 判断缓冲区中是否有数据可以读取
        2. 缓冲区没有数据：就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区，如果文件中也没有数据了，返回-1
        3. 缓冲区有数据：就从缓冲区中读取。
        空参的read方法：一次读取一个字节，遇到中文一次读多个字节，把字节解码并转成十进制返回
        有参的read方法：把读取字节、解码、强转三步合并了，强转之后的字符放到数组中
       */


        //现在b.txt有 8195的字节,8192字节的'a',和'c','d','e';
        FileReader fr = new FileReader("myio\\b.txt");
       fr.read(); // 会把文件中的数据放到缓冲区当中,放慢8192的字节,

        // 清空文件
        FileWriter fw = new FileWriter("myio\\b.txt");//因为现在b.txt里面是有文件的然后会去清空
        //然后去清空文件,但缓冲区不会清空,唯一遗憾的是c,d,e,三个字符,没有加入到缓冲区就被清空了


       // 请问，如果我再次使用fr进行读取
       // 会读取到数据吗？

       // 会把缓冲区中的数据全部读取完毕

      // 正确答案：
      // 但是只能读取缓冲区中的数据，文件中剩余的数据无法再次读取

      int ch;
      while((ch = fr.read()) != -1){
      System.out.println((char)ch);//全是a
     }


    fw.close();
    fr.close();



    }
}

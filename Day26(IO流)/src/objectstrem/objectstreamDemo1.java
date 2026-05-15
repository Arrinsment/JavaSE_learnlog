package objectstrem;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objectstreamDemo1 {

    public static void main(String[] args) throws IOException {

    /*
    需求：
    利用序列化流/对象操作输出流，把一个对象写到本地文件中
    构造方法：
    public ObjectOutputStream(OutputStream out) 把基本流变成高级流

    成员方法：
    public final void writeObject(Object obj) 把对象序列化（写出）到文件中去

    */


        //一.创建一个student对象
        student s=new student("张三",23);

        ObjectOutputStream ooo=new ObjectOutputStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\ooo.txt"));

        ooo.writeObject(s);

        ooo.close();


    }

}


package objectstrem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objectstreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        /*


        需求：
        利用反序列化流/对象操作输入流，把文件中的对象读到程序当中

        构造方法：
        public ObjectInputStream(InputStream out)    把基本流变成高级流

        成员方法：
        public Object readObject()    把序列化到本地文件中的对象，读取到程序中来


        */


        ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\ooo.txt"));

        student o = (student) obj.readObject();

        obj.close();

        System.out.println(o);


    }
}

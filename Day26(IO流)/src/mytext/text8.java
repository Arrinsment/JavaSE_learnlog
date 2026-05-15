package mytext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class text8 {
    public static void main(String[] args) throws IOException {


        /*
      需求：
      将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
        */

        //先去创建一个student类

        //然后去创建一个序列化对象,然后往a.txt中写入序列号
        ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\mytext\\a.txt"));

        //创建具体的对象
        //这里如果是创建多个对象的直接就用一个Arraylist去接收就完了,然后去传对象即可

        Student s1=new Student("杨耀玮",20);
        Student s2=new Student("江婉晚",24);
        Student s3=new Student("白诗韵",16);

        ArrayList<Student>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //然后去写入对象
        op.writeObject(list);

        //关闭通道
        op.close();


    }
}

package mytext;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class text9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //这里承接text8去反序列化一下

        ObjectInputStream ojs=new ObjectInputStream(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\mytext\\a.txt"));

        ArrayList<Student>list=(ArrayList<Student>)ojs.readObject();

        System.out.println(list);

        ojs.close();



    }
}

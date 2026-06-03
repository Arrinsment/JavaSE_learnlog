package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo4 {
    public static void main(String[] args) throws IOException {


        Properties p1=new Properties();

        FileInputStream fi=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\properties\\a.txt");

        p1.load(fi);

        fi.close();

        System.out.println(p1);//{aaa=111, ccc=333, bbb=222, ddd=444}


    }
}

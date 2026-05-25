package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo2 {

    public static void main(String[] args) throws IOException {


        //可以直接用properties的方法里面的Store,然后通过键值对的方式保存到文件

        //创建一个properties对象
        Properties p1=new Properties();

        //添加元素
        p1.put("aaa","111");
        p1.put("bbb","222");
        p1.put("ccc","333");
        p1.put("ddd","444");


        FileOutputStream s=new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\properties\\a.txt");
        //这个Store
        //第一个参数是输出流
        //第二个参数是注释

        p1.store(s,"test");

        //这是a.txt中的内容
        //#test
        //#Sat May 23 14:56:57 CST 2026
        //aaa=111
        //ccc=333
        //bbb=222
        //ddd=444

    }

}

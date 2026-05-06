package File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {

         //File:路径
         //- File对象就表示一个路径，可以是文件的路径、也可以是文件夹的路径
         //- 这个路径可以是存在的，也允许是不存在的

       /* public File(String pathname)              根据文件路径创建文件对象
        public File(String parent, String child)  根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, String child)    根据父路径对应文件对象和子路径名字符串创建文件对象

        C:\Users\alienware\Desktop
      */

        //在Java中:单独一个 / 代表一个转义字符

        //一.public File(String pathname)              根据文件路径创建文件对象

        //说白了,就是根据一个字符串表示的路径,去创建一个File对象
        String str="C:\\Users\\alienware\\Dsktop\\a.txt";
        File f1=new File(str);
        System.out.println(f1);//C:\Users\alienware\Dsktop


        //二.public File(String parent, String child) 根据父路径名字符串和子路径名字符串创建文件对象
        //父级路径:"C:\Users\alienware\Dsktop";
        //子级路径:"a.txt"
        String parent="C:\\Users\\alienware\\Dsktop";
        String child="a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);//C:\Users\alienware\Dsktop\a.txt
        //你也可以自己去拼接
        File f3=new File(parent+"\\"+child);
        System.out.println(f3);//C:\Users\alienware\Dsktop\a.txt


        //三.public File(File parent, String child) 根据父路径对应文件对象和子路径名字符串创建文件对象
       File parent2=new File("C:\\Users\\alienware\\Dsktop");
       String child1="a.txt";
       File f4=new File(parent2,child1);
        System.out.println(f4);//C:\Users\alienware\Dsktop\a.txt

    }
       //小结:
        //1. File表示什么？
        //File对象表示路径，可以是文件、也可以是文件夹。
        // 这个路径可以是存在的，也可以是不存在的
       //2.绝对路径和相对路径是什么意思？
       //绝对路径是带盘符的。
       //相对路径是不带盘符的，默认到当前项目下去找。
       //3. File三种构造方法的作用？

}

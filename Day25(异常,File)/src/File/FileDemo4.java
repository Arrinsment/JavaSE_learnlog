package File;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {

        /*
         public boolean createNewFile()    创建一个新的空的文件
         public boolean mkdir()            创建单级文件夹
         public boolean mkdirs()           创建多级文件夹
         public boolean delete()           删除文件、空文件夹
       */
        //delete方法默认只能删除文件和空文件夹，delete方法直接删除不走回收站


        //一. public boolean createNewFile()    创建一个新的空的文件
          //细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
          //如果当前路径表示的文件是存在的，则创建失败，方法返回false
          //细节2：如果父级路径是不存在的，那么方法会有异常IOException
          //细节3：createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件


       /* 1:    File path=new File("D:\\aaa\\c.txt");//要创建什么文件,先在File对象申明
        System.out.println(path.createNewFile());//创建成功返回true*/
       /* 2:
        File  path=new File("D:\\aaa\\eee\\c.txt");//这里根本没有eee这个父类文件路径,会报IOexception
        System.out.println(path.createNewFile());//.IOException: 系统找不到指定的路径*/

        File path=new File("D:\\aaa\\eee");
        System.out.println(path.createNewFile());//true,   但creatNewFile不是去创建一个文件吗?这里怎么是个文件夹?
        //这里不是去创建了一个文件夹,而是去创建一个没有后缀名称的文件,文件名叫eee


        //二.public boolean mkdir()    创建单级文件夹,创建成功返回true 失败返回false;
        //mkdir :make directory,创建一个文件夹,又叫 创建一个目录
        // 细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        // 细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。

        File path2=new File("D:\\aaa\\ggg");//true  我这里原本就没有ggg
        System.out.println(path2.mkdir());


        //三.public boolean mkdirs()    创建多级文件夹,创建成功返回true 失败返回false
        //细节:既可以创建单级文件夹,也可以创建多级文件夹
        File path3=new File("D:\\aaa\\aaa\\vvv");
        System.out.println(path3.mkdirs());//true


        //四.public boolean delete()     删文件、空文件夹,删除成功返回true,失败返回false
        //细节:public boolean delete()
        //如果删除的是文件，则直接删除，不走回收站。
        //如果删除的是空文件夹，则直接删除，不走回收站
        //如果删除的是有内容的文件，则删除失败
        //File f1=new File("D:\\aaa\\ggg");//这个是个空文件夹
        //System.out.println(f1.delete());//true*/



    }
}

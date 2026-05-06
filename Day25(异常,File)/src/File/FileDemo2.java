package File;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {


        // * 判断此路径名表示的File是否为 文件夹   public boolean isDirectory()
        // * 判断此路径名表示的File是否为 文件     public boolean isFile()
        // * 判断此路径名表示的File 是否存在       public boolean exists()

        //一.对一个文件路径进行判断
        String str="D:\\aaa\\a.txt";
        File f=new File(str);
        System.out.println(f.isDirectory());//false
        System.out.println(f.isFile());//true
        System.out.println(f.exists());//true
        System.out.println("-----------------------------");

        //二.对一个文件夹路径进行判断
        String str1="D:\\aaa";
        File f1=new File(str1);
        System.out.println(f1.isDirectory());//true
        System.out.println(f1.isFile());//false
        System.out.println(f1.exists());//true

        //对一个不存在的路径进行判断
        System.out.println("-------------------------");
        String str2="D:\\aaa\\c.txt";//该路径根本不存在,我根本没有在D盘去创建它的文件夹
        File f2=new File(str2);
        System.out.println(f2.isDirectory());//false
        System.out.println(f2.isFile());//false
        System.out.println(f2.exists());//false

    }
}
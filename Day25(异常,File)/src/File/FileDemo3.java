package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo3 {
    public static void main(String[] args) {

        //public long length()   返回文件的大小（字节数量）
        //public String getAbsolutePath() 返回文件的绝对路径
        //public String getPath()   返回定义文件时使用的路径,你是你传入的是什么路径结果就返回什么路径
        //public String getName       返回文件的名称，带后缀
        // public long lastModified()    返回文件的最后修改时间（时间毫秒值）


        //一.public long length()   返回文件的大小（字节数量）

        //这里有些小细节:1.这个方法只能获取 文件 的大小,单位是字节
        //如果你想获取其他单位,kb=byte/1024,Mb=byte/1024/1024
        //细节2:不能直接获取文件夹的大小
        //如果想去获取这个文件夹的大小,要把文件夹里所有文件大小都加在一起
        String str="D:\\aaa\\a.txt";
        File f1=new File(str);
        long length = f1.length();//如果这个文件(记事本)里面什么都没有的话,那么就是0字节,但我现在写了五个字:在下江婉晚,占17byte
        System.out.println(length);//17byte
        File f2=new File("D\\aaa");
        System.out.println(f2.length());//0 无法去获取一个文件夹的大小


        System.out.println("--------------------------------------------");
        //二.public String getAbsolutePath() 返回文件的绝对路径(就是一条路径全部展示完)
         File f3=new File("D:\\aaa\\a.txt");
           String path =f3.getAbsolutePath();
        System.out.println(path);//D:\aaa\a.txt

        File f4=new File("Day25(异常,File)\\Fil1");
          String path2= f4.getAbsolutePath();
        System.out.println(path2);//C:\Users\beyond\IdeaProjects\base-code\Day25(异常,File)\Fil1,这个方法永远获取的都是它的绝对路径


        System.out.println("-------------------------------------------------");

        //三.//public String getPath()   返回定义文件时使用的路径,你是你传入的是什么路径结果就返回什么路径
        File f5=new File("D:\\aaa\\a.txt");
        String p1 =f5.getPath();//D:\aaa\a.txt
        System.out.println(p1);
        File f6=new File("Day25(异常,File)\\Fil1");
        String p2= f6.getPath();
        System.out.println(p2);//Day25(异常,File)\Fil1

        System.out.println("-------------------------------------------------");

       //四.public String getName 返回文件的名称，带后缀
        //细节1:如果文件后面带后缀 比如a.txt 直接输出全部即可
        //细节2:如果文件后面什么后缀都不带,直接输出文件名即可
        File f7=new File("D:\\aaa\\a.txt");
        String path3=f7.getName();
        System.out.println(path3);//a.txt
        File f8=new File("D:\\aaa\\bbb");
        String path4=f8.getName();
        System.out.println(path4);//bbb

        System.out.println("---------------------------------------------");

       //五.// public long lastModified()  返回文件的最后修改时间（时间毫秒值）
        File f9=new File("D:\\aaa\\a.txt");
        long time = f9.lastModified();
        System.out.println(time);
        //把最后一次修改的时间用字符串的形式打印出来
        SimpleDateFormat sdf=new SimpleDateFormat();
        String result = sdf.format(time);
        System.out.println(result);//2026/5/6 下午12:43


    }
}

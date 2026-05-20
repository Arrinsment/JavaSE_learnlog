package commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class commonsioDemo1 {
    public static void main(String[] args) throws IOException {


        //Apache Commons  这里直接去使用Apache的工具包,会帮助我自己去更好的操作IO流

          /*
       FileUtils类
       static void copyFile(File srcFile, File destFile)                    复制文件
       static void copyDirectory(File srcDir, File destDir)                 复制文件夹
       static void copyDirectoryToDirectory(File srcDir, File destDir)      复制文件夹
       static void deleteDirectory(File directory)                          删除文件夹
       static void cleanDirectory(File directory)                           清空文件夹
       static String readFileToString(File file, Charset encoding)          读取文件中的数据变成字符串
       static void write(File file, CharSequence data, String encoding)     写出数据

      IOUtils类
      public static int copy(InputStream input, OutputStream output)         复制文件
      public static int copyLarge(Reader input, Writer output)               复制文件
      public static String readLines(Reader input)                           读取数据
      public static void write(String data, OutputStream output)             写出数据
         */

        System.out.println("----------------------- 一.-------------------------------------");
       /* //一. static void copyFile(File srcFile, File destFile)              复制文件
        File f1=new File("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\commonsio\\a.txt");
        File f2=new File("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\commonsio\\c.txt");
        //把f1的文件复制到f2去,利用的是lib中的工具包Apache,的FileUtils工具包中的方法
        //把f1的文件复制到f2去
        //现在来看这个工具包就很爽了
        FileUtils.copyFile(f1,f2);
       */

        System.out.println("----------------------- 二. ----------------------------------------");
       //static void copyDirectory(File srcDir, File destDir)               复制文件夹
        File f1=new File("D:\\aaa");
        File f2=new File("D:\\aaaaa");
        FileUtils.copyDirectory(f1,f2);


        System.out.println("-----------------------------------------------------------------");
       //static void copyDirectoryToDirectory(File srcDir, File destDir)      复制文件夹
       //这里和上面的复制文件夹的区别是这个是把所有文件夹,全部都拷贝到里面去了了,包括自己的aaa,以前只是把aaa里面的文件夹和文件拷贝到aaaa中去









    }
}

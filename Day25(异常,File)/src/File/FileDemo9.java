package File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {


        //public File[] listFiles(FileFilter filter)    利用文件名过滤器获取当前该路径下所有内容
        //public File[] listFiles(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容

        //一.public File[] listFiles(FileFilter filter)    利用文件名过滤器获取当前该路径下所有内容
        //把他当作过滤器,去过滤,让留下的文件结尾后缀是txt
        File f1=new File("D:\\aaa");
        File[] files = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith("txt");
            }
        });


        for (File file : files) {
            System.out.print(file.getName()+" ");//a.txt b.txt c.txt
        }
        System.out.println();
        System.out.println("---------------------------------");
        //二.public File[] listFiles(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        File f2=new File("D:\\aaa");
        File[] files1=f1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //dir 是父级路径
                //name是子级路径

                File f=new File(dir,name);
                return f.isFile()&&f.getName().endsWith("txt");

            }
        });
        System.out.println(Arrays.toString(files1));//[D:\aaa\a.txt, D:\aaa\b.txt, D:\aaa\c.txt]


    }
}

package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
        //public static File[] listRoots()                          → 列出可用的文件系统根
        //public String[] list()                                    → 获取当前该路径下所有内容
        //public String[] list(FileNameFilter filter)               → 利用文件名过滤器获取当前该路径下所有内容
        //（掌握）public File[] listFiles()                          → 获取当前该路径下所有内容
        //public File[] listFiles(FileFilter filter)                → 利用文件名过滤器获取当前该路径下所有内容
        //public File[] listFiles(FileNameFilter filter)            → 利用文件名过滤器获取当前该路径下所有内容


       /* //一.public static File[] listRoots()                       → 列出可用的文件系统根
        //1.listRoots  获取所有的盘符,这个方法是静态的,直接类名调用即可
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));//[C:\, D:\]*/

        System.out.println("---------------------");
        //二.//public String[] list()(仅仅是去获取名字 )       → 获取当前该路径下所有内容
        File f1 = new File("D:\\aaa");
        for (String s : f1.list()) {
            System.out.println(s);//这里仅仅是打印文件名字比如a/txt,不会像listfiles 一样打印完整路径名称
        }
        //三.
        //3.list(FileNameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        //需求：我现在要获取D:\aaa文件夹里面所有的txt文件
        File f2 = new File("D:\\aaa");
        //accept方法的形参，依次表示aaa文件夹里面每一个文件或者文件夹的路径
        //参数一：父级路径
        //参数二：子级路径
        //返回值：如果返回值为true，就表示当前路径保留
        //如果返回值为false，就表示当前路径舍弃不要
        String[] ar = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(ar));//[a.txt, b.txt, c.txt]
        //现在这个你完全看懂就ok了,其实这个去获取txt的文件完全可以用listfiles去完成,详情见FileDemo8

    }
}



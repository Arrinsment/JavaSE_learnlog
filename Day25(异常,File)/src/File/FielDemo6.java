package File;

import java.io.File;

public class FielDemo6 {
    public static void main(String[] args) {

       //public File[] listFiles()   获取当前该路径下所有内容

       //1.创建一个File对象
        File f=new File("D:\\aaa");
        //获取aaa文件夹中的所有内容,把所有的内容放在files数组中进行返回
        //2.listFiles方法
        File[] files = f.listFiles();
        for (File file : files) {
            //这里的file可以是个文件夹,也可以是个文件本身
            System.out.println(file);
            //D:\aaa\a.txt
            //D:\aaa\aaa
            //D:\aaa\b.txt
            //D:\aaa\bbb
            //D:\aaa\c.txt
            //D:\aaa\ccc
            //D:\aaa\eee
            //D:\aaa\fff
        }

        //细节:
        //- 当调用者File表示的路径不存在时，返回null
        //- 当调用者File表示的路径是文件时，返回null
        //- 当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        //- 当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
        //- 当调用者File表示的路径是一个隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        //- 当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
    }
}

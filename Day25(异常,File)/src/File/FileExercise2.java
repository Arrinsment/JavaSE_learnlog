package File;

import java.io.File;

public class FileExercise2 {
    public static void main(String[] args) {

        //需求：
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影。

        File f1=new File("D:\\aaa\\bbb");
        is_avi(f1);//D:\aaa\bbb\小电影.avi

    }
    public  static void  is_avi(File f){

        for (File file : f.listFiles()) {
            if(file.isFile()&&file.getName().endsWith("avi")){
                System.out.println(file);
            }
        }

    }
}

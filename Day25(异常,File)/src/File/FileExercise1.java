package File;

import java.io.File;

public class FileExercise1 {
    public static void main(String[] args) {


        // 需求：在当前模块下的aaa文件夹中创建一个a.txt文件
        File f = new File("D:\\Javacode\\JavaSE_learnlog\\Day25(异常,File)\\a.txt");
        System.out.println(f.mkdirs());


        //这里我去当前模块下创建一个a.avi的模块
        File f2=new File("D:\\Javacode\\JavaSE_learnlog\\Day25(异常,File)\\a.avi");
        System.out.println(f2.mkdirs());


    }
}

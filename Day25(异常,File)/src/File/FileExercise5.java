package File;

import java.io.File;

public class FileExercise5 {

    public static void main(String[] args) {

      /*需求：
        统计一个文件夹的总大小
        //这里的大小是指字节大小,然后单独的一个空文件夹的字节大小是0
       */
        File f=new File("D:\\aaa\\bbb");
        System.out.println(get_sum(f));
    }

    public  static  long get_sum(File f){

        long len=0;
        File[] files = f.listFiles();
        for (File f1 : files) {
            if(f1.isFile()){
                len+=f1.length();
            }
            else{
                len+=get_sum(f1);
            }
        }
         return  len;

    }
}

package File;

import java.io.File;

public class FileExercise4 {
    public static void main(String[] args) {

        //删除一个文件夹里面的所有内容,这个文件夹,里面是有内容的没有办法直接用delete删除
        File f1=new File("D:\\aaa\\bbb");

        //既然没有办法直接删除,那么就去调用递归去删除
            dfs(f1);
    }
             public static void dfs(File f1){
                 File[] f2 = f1.listFiles();
                 if(f2!=null) {
                     for (File f : f2) {
                         if (f.isFile()) {
                             f.delete();
                         } else {
                                 dfs(f);
                         }
                     }
                 }

                 f1.delete();

                 //这样它就会把bbb里面的所有目录全部删除

    }

}

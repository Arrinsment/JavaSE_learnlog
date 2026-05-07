package File;

import java.io.File;

public class FileExercise3 {
    public static void main(String[] args) {


        /* 需求：
      找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
        */
        //这里我们是利用递归的方式去解决这个问题,去获取每个文件夹的子类然后去判断
        //子类不存在就去看看子类的子类,子类的子类不存在,就去看子类的子类的子类

       /*
       File f1 = new File("C:\\");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
            dfs(file);
       */

        File[] roots = File.listRoots();
        for (File root : roots) {
            File f2=new File(root,"");
                dfs(f2);
            }
        }

    public static void dfs(File f1) {
        File[] f2 = f1.listFiles();
        //如果f1是个隐藏文件,会返回null,此时f2接收后,如果你要去遍历这个f2这个文件数组,会报空指针异常,所以让f2不能返null
        if(f2!=null){
            for (File fi : f2) {
                    if (fi.isFile()&&fi.getName().endsWith("avi") ) {
                        System.out.println(fi);
                    } else {
                        dfs(fi);
                    }

            }
        }
    }
}
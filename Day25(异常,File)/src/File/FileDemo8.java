package File;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith("txt")){
                System.out.print(file1+" ");//D:\aaa\a.txt D:\aaa\b.txt D:\aaa\c.txt
            }
        }
    }
}

package mytext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class text1 {
    public static void main(String[] args) throws IOException {

     //这里主要写写字符流和字节流相关的练习

        /*
      字节流和字符流的使用场景
      字节流
      拷贝任意类型的文件

      字符流
      读取纯文本文件中的数据
      往纯文本文件中写出数据

     */
        /*
        拷贝
        需求：
        拷贝一个文件夹，考虑子文件夹
        */

        File f1=new File("D:\\javacppy0\\aaa");
        File f2=new File("D:\\javacppy0\\aaacppy");

        //这里拷贝为了把文件考完,选择去递归
        copyfile(f1,f2);

    }
    public static void copyfile(File f1,File f2) throws IOException {
        f2.mkdirs();
        File[] files = f1.listFiles();

        //如果是文件,那么直接就拷贝到目的地去

        for (File file : files) {
            if(file.isFile()){

                //是文件就直接去拷贝
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(f2,file.getName()));
                int len;
                byte []b=new byte[1024];
                while((len=fis.read(b))!=-1){
                    fos.write(b,0,len);;
                }
                fos.close();
                fis.close();

            }
            else{
                copyfile(file,new File(f2,file.getName()));
            }


        }





    }
}

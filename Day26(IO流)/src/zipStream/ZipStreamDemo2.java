package zipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {

    public static void main(String[] args) throws IOException {

        //这里去讲讲压缩流
        //就是自己利用java代码.手动把一个文件/文件夹变成一个压缩包
        //这里先去写文件
        //把D盘下的a.txt文件变成一个压缩包(这里压缩包名叫a.zip)写在D盘中
        //记事本的文件,必须手动保存（Ctrl+S 或文件 → 保存）

        //一.创建文件
        File src=new File("D:\\a.txt");
        File des=new File("D:\\");

        //写一个方法去压缩文件
        tozip(src,des);

    }
    public static  void tozip(File src,File des) throws IOException {

         //既然要去要去压缩必定要有一个压缩包
         //这里是一个a.zip对象压缩包
        ZipOutputStream zi=new ZipOutputStream(new FileOutputStream(new File(des,"a.zip")));

        //然后现在压缩包有了,你肯定要往压缩包中去放东西,在压缩包中的每个东西,就是一个zipEntry对象
        ZipEntry zipEntry=new ZipEntry("a.txt");


        //现在对象有了,你再把对象放进zi中去,用到的方法是putNextEntry
        zi.putNextEntry(zipEntry);

        //现在就是去写入数据,现在这里面只有一个文件
        FileInputStream f=new FileInputStream(src);

        int b;
        while((b=f.read())!=-1){
            zi.write(b);
        }

        zi.closeEntry();//对应的是putNextEnty/getNextEntry 就是不在往里面去放东西了
        zi.close();
    }
}

package zipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {

    public static void main(String[] args) throws IOException {

        //这里是把一个文件夹里面包含有文件,把他压缩成zip文件
        //然后这里是没有去处理空文件夹的如果你是空文件夹,默认是不去管的

        File src=new File("D:\\aaa");
        File parentFile = src.getParentFile();
        File des=new File(parentFile,src.getName()+".zip");

        //创建一个压缩流
        ZipOutputStream zi=new ZipOutputStream(new FileOutputStream(des));

        tozip(src,zi,src.getName());
        zi.close();

    }
     public static  void tozip(File src,ZipOutputStream zi,String name ) throws IOException {

         File[] files = src.listFiles();
         for (File file : files) {
             //如果是文件,就压缩
             if(file.isFile()){
                 //创建一个压缩文件对象
                 ZipEntry z1=new ZipEntry(name+"\\"+file.getName());
                 //放在里面去
                 zi.putNextEntry(z1);

                 //然后去写入数据
                 FileInputStream  fi=new FileInputStream(file);
                 int b;
                 while((b=fi.read())!=-1){
                     zi.write(b);
                 }
                 fi.close();
                 zi.closeEntry();
             }

             else{
             //不是文件,就去递归
                 tozip(file,zi,name+"\\"+file.getName());
             }


         }
     }

}

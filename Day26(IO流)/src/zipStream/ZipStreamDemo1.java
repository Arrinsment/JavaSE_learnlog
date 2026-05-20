package zipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {

    //这里主要讲讲,压缩流和解压缩流

    public static void main(String[] args) throws IOException {

        //在D盘有个压缩流文件 abc.zip
        //然后这里先去讲讲解压缩,所谓解压缩就是把文件夹的文件全部拷贝一份出来

        //创建一个文件夹
        //从什么地方去解压缩
        File src=new File("D:\\abc.zip");

        //解到什么地方
        File dest=new File("D:\\");

        //压缩文件的每一个对象就是一个ZipEntry对象

        //用一个unzip方法去解压

         unzip(src,dest);

    }
    public static  void unzip(File src,File dest) throws IOException {


        //一.创建一个输入的zip压缩对象
        ZipInputStream z=new ZipInputStream(new FileInputStream(src));

        //然后可以利用getnNxtEntry去读取,用zipEntry去接收, 这个方法去读取zip中的每个文件夹或者文件当他遇到空(null)就会停下来

        ZipEntry s;
        while ((s=z.getNextEntry())!=null){
            //如果是文件夹就去创建一个文件
            if(s.isDirectory()){

                File f1=new File(dest,s.toString());
                f1.mkdirs();

            }
            else{
              //不是文件夹,就直接把文件写在目的地去
                FileOutputStream fop=new FileOutputStream(new File(dest,s.toString()));
                //这里的S.是访问到什么就把他的完全路径放在上面去
                //abc.zip
                //    └── 123/
                //        └── a.txt
                //第一次循环：s = "123/"
                //第二次循环：s = "123/a.txt"

                int b;
                while((b=z.read())!=-1){

                    //这里的z去读取时候,会根据z.getNextEntry具体读到什么地方去读取
                    fop.write(b);
                }
                fop.close();
            }

        }
         z.close();

    }
}

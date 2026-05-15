package convertstream;


import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertstreamDemo1 {
    public static void main(String[] args) throws IOException {

        //这里主要去讲讲转换流,这里的conveert就是转换的意思
        //转换流,简单去说就是字符流和字节流之间的一个媒介

        /*
       利用转换流按照指定字符编码读取(第一种写法了解即可)
        */


       /* //这个文件的话我把它设置为了jbk
        //D:\Java学习\Java基础\下册\day29-IO（其他流）\资料

        //一.创建一个转换流对象
        //现在gbkfile是个编码GBK形式,然后读取过来这里是utf-8的形式会出现乱码,我们要自定GBK的方式去读取
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\gbkfile.txt"),"GBK");

        //二.去读取数据
        int len;
        while((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        //运行结果:终于为那一身江南烟雨覆了天下
        //容华谢后，不过一场
        //今日无事，戏院听曲，插花弄玉
        isr.close();
        */


        //上面的写法,已经不行了,下面的方法才是最行的
        //直接去创建FileReader的对象,,然后利用charSert去指定编码格式,然后去写入即可

        FileReader fr=new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\gbkfile.txt", Charset.forName("GBK"));
        int len;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        //运行结果:终于为那一身江南烟雨覆了天下
        //容华谢后，不过一场
        //今日无事，戏院听曲，插花弄玉
        fr.close();



    }
}

package hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class hutoolDemo1 {
    public static void main(String[] args) {


        //FileUtil类：
        //file：根据参数创建一个file对象
        //touch：根据参数创建文件
        //
        //writeLines：把集合中的数据写出到文件中，覆盖模式。
        //appendLines：把集合中的数据写出到文件中，续写模式。
        //readLines：指定字符编码，把文件中的数据，读到集合中。
        //readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中
        //
        //copy：拷贝文件或者文件夹


       //一. 根据参数创建一个file对象
        //FileUtil是静态的所以可以直接类名去屌用
        //在hutool中的是可变参数,可以直接传入多个数据
        File f1= FileUtil.file("D:\\","aaa1","bbb","ccc","dddd","w.txt");
        System.out.println(f1);//D:\aaa\bbb\ccc\dddd


        //二. touch：根据参数创建文件
        //这里和之前的creatfile不同的是,如果父级路径不存在,他就直接去把父级路径给你创建出来
        File touch = FileUtil.touch(f1);
        System.out.println();//D:\aaa1\bbb\ccc\dddd\w.txt*/



       //三. writeLines：把集合中的数据写出到文件中，覆盖模式。
        //创建一个集合
        //关于这个hutool的这个writeLines
        //细节:
        // 1.不带 true 或不写 覆盖清空文件，再写入
        // 2.带   true 追加	 保留原有内容，在后面接着写

        ArrayList<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        FileUtil.writeLines(list,touch,"UTF-8");



        //四.appendLines：把集合中的数据写出到文件中，续写模式。

        ArrayList<String> list2=new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        FileUtil.writeLines(list,touch,"UTF-8");



        //五. readLines：指定字符编码，把文件中的数据，读到集合中。
        List<String> list3 = FileUtil.readLines("D:\\a.txt", "UTF-8");



    }
}































































































































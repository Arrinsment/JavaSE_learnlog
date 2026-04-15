package StringDemo;

import java.util.StringJoiner;

public class StringDemo5 {
    public static void main(String[] args) {
        //这里用StringJoiner 进行字符串拼接

        //1.创建一个StringJoiner对象 这个StringJoiner是没有空参构造的,这里是指定间隔符号

        StringJoiner SJ=new StringJoiner("-----");//delimiter是间隔的意思

        //2.利用add添加元素,里面只能加字符,不能直接加数字
        SJ.add("aaa").add("bbb").add("ccc");
        System.out.println(SJ);//aaa-----bbb-----ccc

        //然后又创建一个Stringjoiner对象,创建一个对象
        StringJoiner sj= new  StringJoiner(",","[","]");//prefix:开头 , suffix:结尾
        sj.add("1").add("2").add("3").add("4");
        System.out.println(sj);//[1,2,3,4]

        //3.StringJoiner除了add外还有2个成员方法

        //1.SJ.length 这里的长度是全部的长度

        int len=sj.length();
        System.out.println(len);//[1,2,3,4] 长度是9;

        //2.还有一个toSting和StringBuilder 一样把容器转换为字符串
        String s=SJ.toString();
        System.out.println(s);//aaa-----bbb-----ccc
    }
}

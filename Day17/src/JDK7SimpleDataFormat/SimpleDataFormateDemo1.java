package JDK7SimpleDataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormateDemo1 {
    public static void main(String[] args) throws ParseException {

        //一.SimpleDateFormate
        //这个类可以把日期对象变为字符串
        //    也可以把字符串变为日期对象

        //public final String formate(Date date),这里的formate是格式化的意思,日期对象变为字符串的含义

        //public Data parse() 这就是解析的含义,就是把字符串变为了日期对象的含义
        //parse:解析的含义

        //一.SimpleDataFormat 的formate(格式化)
        //1.利用空参构造创建 SimpleDateFormate对象,默认格式
        SimpleDateFormat sdf=new SimpleDateFormat();
       //创建一个标准的时间
        Date d=new Date(0L);
        //用一个字符串去接收
        String result=sdf.format(d);
        System.out.println(result);//1970/1/1 上午8:00
        System.out.println("--------------------------------------------------------");


        //2.利用带参构造去创建 SimpleDataFormata对象,指定格式  yyyy年MM月dd日 HH:mm:ss EE
        //这里的EE代表的是星期,比如周一 ,周三,周五
        //这里的formate是可以指定格式的比如yyyy年MM月dd日 HH:mm:ss EE 或者yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str = sdf2.format(d);
        System.out.println(str);//1970年01月01日 08:00:00 周四

        System.out.println("---------------------------------------------------------");

        //二.SimpleDataFormate的解析化,parse,就是把一个字符串按照格式解析为对象
        //然后你解析的时候一定要注意,你字符串的格式要和pattern的格式完全一致
        String S4="2023-11-11 11:11:11";
        //
        SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date S = SDF.parse(S4);
        System.out.println(S.getTime());//获取毫秒值


        //现在来看其实就一句话,就是时间对象与字符串的相互转化






    }


}

package JDK7SimpleDataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormateExercise1 {
    public static void main(String[] args) throws ParseException {

        //假设你初恋的年月日是2000-11-11
       //请用字符串表示这个整数,并将其转换为2000年11月11日

       //我们先把字符串解析为时间对象
        String s="2000-11-11";
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd");
        Date d=s1.parse(s);

        //然后我们在创建一个SimpleDateFormat对象,并进行按照格式化,得到一个字符串
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        String str=sdf.format(d);
        System.out.println(str);

    }
}

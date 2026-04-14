package Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise4 {
    public static void main(String[] args) throws ParseException {

        //请用jdk7和jdk8的方式 分别计算你活了多少天

        //一.jdk7的方式
        //规则只要是对时间进行计算的都要先转化为毫秒值去进行计算
         String birthday="2005年11月5日";
        SimpleDateFormat sdf= new  SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(birthday);
        long birthdaytime =parse.getTime();//计算活了多久的毫秒值,就是你出生的时候距离计算机时间原点有多久

        long todaytime=System.currentTimeMillis();

        long time=todaytime-birthdaytime;
        //然后自己手动把这个转化为活了多少天
        System.out.println(time/1000/60/60/24);

        //jdk8的方式
        LocalDate now=LocalDate.now();

        //然后我们自己利用of设置一个方式
        LocalDate birthday1=LocalDate.of(2005,11,05);
        long birthfrom= ChronoUnit.DAYS.between(birthday1,now);
        System.out.println(birthfrom);//7747


    }
}

package JDK8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo1 {
    public static void main(String[] args) {

        //这里讲讲DateTimeFormater

        //获取格式化对象

        //首先先去获取一个时间对象
        ZonedDateTime adt = Instant.now().atZone(ZoneId.of("Africa/Nairobi"));


        //解析/格式化器
        //先创建一个DateTimeformatter对象,然后利用里面的ofpattern()新定义一个格式在里面
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        //然后我们再利用format把创建好的格式解析在时间对象上面
        System.out.println(dtf.format(adt));//2026-03-26 15:45:39 周四 下午








    }
}
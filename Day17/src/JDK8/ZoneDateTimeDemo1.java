package JDK8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1 {
    public static void main(String[] args) {


        //这里创建一个ZoneDateTime对象然后去使用

        //1.获取当前时间对象(带时区)
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);//2026-03-26T19:37:20.920143900+08:00[Asia/Shanghai]

        //2.利用of去获取指定的时间对象
        ZonedDateTime zdt1 = ZonedDateTime.of(2023, 10, 1, 11, 12, 11, 0, ZoneId.of("Africa/Nairobi"));

        //3.利用ofInstant去把,Instant加时s的方式去加入即可
        Instant i = Instant.ofEpochMilli(0L);
        ZoneId I =ZoneId.of("Africa/Nairobi");
        //然后创建一个ZoneDate 和ofInstant去把时间和区域放在里面去
        ZonedDateTime zd= ZonedDateTime.ofInstant(i,I);
        System.out.println(zd);//1970-01-01T03:00+03:00[Africa/Nairobi]

        //4.利用withxxx去修改时间
        //对了,这里不仅可以去修改年月日,还可以修改为其他的
        ZonedDateTime time4=zd.withYear(2005);
        System.out.println(time4);//2005-01-01T03:00+03:00[Africa/Nairobi]

        //增加和去减少时间 minus是减少和plus是增加
        //不仅可以去减少年,也可以去减少其他的
        ZonedDateTime time5=time4.minusYears(1);
        System.out.println(time5);//2004-01-01T03:00+03:00[Africa/Nairobi]

        //去增加时间
        ZonedDateTime time6=time5.plusYears(10);
        System.out.println(time6);//2014-01-01T03:00+03:00[Africa/Nairobi]








    }
}
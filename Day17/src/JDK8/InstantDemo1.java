package JDK8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {

        //这里的instant翻译过来就是时间戳的意思

        //一.获取当前时间的instant对象(标准时间)
        Instant now=Instant.now();
        System.out.println(now);//2026-03-26T07:10:36.451627400Z

        //二.根据(秒,毫秒,纳秒)去获取当前时间的Instant对象
        //Epoch：纪元 / 新时代
        //Milli：千分之一（毫）
        //获取毫秒就是 ofEpochMilli
        //组合直译：“纪元的毫秒数”，即自纪元以来的毫秒数
        //这里的0L代表的是 从EpochMilli(计算机诞生)以来过了0L的时间
        //毫秒
        Instant time =Instant.ofEpochMilli(0L);
        System.out.println(time);//1970-01-01T00:00:00Z9o

        //秒
        Instant time2=Instant.ofEpochMilli(1L);
        System.out.println(time2);

        //秒与微秒
        Instant time3=Instant.ofEpochSecond(1L,1000000000);
        //这里1秒加10的9次方微秒 结果就是2秒钟
        System.out.println(time3);

        //三.去指定时区
        //获取一下地区Africa/Nairobi的时间是什么?
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Africa/Nairobi"));
        System.out.println(zonedDateTime);//2026-03-26T13:29:23.965864100+03:00[Africa/Nairobi]

        //四.用于时间的判断 isBefore isAfter
        Instant ti=Instant.ofEpochMilli(0L);
        Instant ti2=Instant.ofEpochMilli(1000L);
        //去判断谁在前,谁在后面
        boolean after = ti.isAfter(ti2);//ti在ti1的后面吗?不是false
        System.out.println(after);
        boolean before=ti.isBefore(ti2);//ti在ti2的前面吗?不是true
        System.out.println(before);

       //五.减少和增加时间的方法 minus/plus
        //1.减少
        Instant TII=Instant.ofEpochMilli(3000L);
        System.out.println(TII);//1970-01-01T00:00:03Z
        Instant instant = TII.minusSeconds(1);//调用这个方法后然后减少一秒
        System.out.println(instant);//1970-01-01T00:00:02Z

        //2.增加
        Instant instant1 = TII.plusSeconds(2);
        System.out.println(instant1);//1970-01-01T00:00:05Z



    }
}

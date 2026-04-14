package JDK8;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo1 {
    public static void main(String[] args) {

        //这里我们讲讲ChronUnit这个工具类,这个工具类可以把所有的所有的时间差异写出来

        //一.当前时间
        LocalDateTime localDateTime=LocalDateTime.now();

        //二.生日时间
        LocalDateTime birthday=LocalDateTime.of(2005,11,05,0,0,0);

        System.out.println("相差的年数:"+ ChronoUnit.YEARS.between(birthday,localDateTime));
        System.out.println("相差的月数:"+ ChronoUnit.MONTHS.between(birthday,localDateTime));
        System.out.println("相差的周数:"+ ChronoUnit.WEEKS.between(birthday,localDateTime));
        System.out.println("相差的天数:"+ ChronoUnit.DAYS.between(birthday,localDateTime));
        System.out.println("相差的时数:"+ ChronoUnit.HOURS.between(birthday,localDateTime));
        System.out.println("相差的分数:"+ ChronoUnit.MINUTES.between(birthday,localDateTime));
        System.out.println("相差的秒数:"+ ChronoUnit.SECONDS.between(birthday,localDateTime));
        System.out.println("相差的毫秒数:"+ ChronoUnit.MINUTES.between(birthday,localDateTime));
        System.out.println("相差的微秒数:"+ ChronoUnit.MICROS.between(birthday,localDateTime));
        System.out.println("相差的纳秒数:"+ ChronoUnit.NANOS.between(birthday,localDateTime));
        System.out.println("相差的半天数:"+ ChronoUnit.HALF_DAYS.between(birthday,localDateTime));
        System.out.println("相差的十年数:"+ ChronoUnit.DECADES.between(birthday,localDateTime));
        System.out.println("相差的世纪数:"+ ChronoUnit.CENTURIES.between(birthday,localDateTime));
        System.out.println("相差的千年数:"+ ChronoUnit.MILLENNIA.between(birthday,localDateTime));
        System.out.println("相差的纪元数:"+ ChronoUnit.ERAS.between(birthday,localDateTime));

    }
}

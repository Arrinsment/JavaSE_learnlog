package JDK8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {

        //1.获取当前时间的指定对象只包含年月日
        LocalDate nowDate  =LocalDate.now();
        System.out.println(nowDate);//2026-03-26

        //2.利用of获取指定的时间对象
        LocalDate idDate=LocalDate.of(2023,1,1);
        System.out.println(idDate);//2023-01-01
        LocalDate idDate2=LocalDate.of(2026,3,26);

        //get系列方法获取日历中的指定值

        //1.获取年
        int year=idDate.getYear();
        System.out.println("year:"+year);

        //2.获取月份
        //方式一:
        Month m=idDate.getMonth();
        System.out.println(m);//这里获取的是英文单词
        System.out.println(m.getValue());//这里获取的是月份数字
        //方式二:
        int m1=idDate.getMonthValue();//这里直接获取的是数字
        System.out.println(m1);

        //3.获取日期
        int day=idDate.getDayOfMonth();
        System.out.println(day);

        //4.获取一年中的第几天
        int dayofyear=idDate.getDayOfYear();
        System.out.println(dayofyear);

        //5.获取星期
        DayOfWeek dayOfWeek=idDate.getDayOfWeek();
        System.out.println(dayOfWeek);//SUNDAY
        System.out.println(dayOfWeek.getValue());//7

       //6.is开头的方法表示判断
        System.out.println(idDate.isBefore(idDate2));
        System.out.println(idDate.isAfter(idDate2));

        //7.with开头的方法表示修改,只能修改年月日
        LocalDate withLocalDate =idDate.withYear(2000);
        System.out.println(withLocalDate);
        //和之前的一样,修改后的数据是不会发生改变的会创建一个新对象

        //8.minus开头的方法表示减少,只能减少年月日
        LocalDate minusLocalDate=idDate.minusYears(1);
        System.out.println(minusLocalDate);

        //9.plus开头的方法表示增加,只能增加年月日
        LocalDate plusLocalDate=idDate.plusDays(1);
        System.out.println(plusLocalDate);

    }
}

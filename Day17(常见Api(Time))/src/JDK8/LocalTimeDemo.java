package JDK8;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {

        //这里的LocalTime
        //获取本地时间的日历对象,这里只包含(时分秒)

        //一.获取当前时间
        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);//09:36:52.660818500

        //二.用get去获取
        int hour =nowTime.getHour();
        int minute=nowTime.getMinute();
        int second=nowTime.getSecond();
        int nano=nowTime.getNano();
        System.out.println("--------------------------");

        //三.利用of()去自己设置时间
        System.out.println(LocalTime.of(8,20));
        System.out.println(LocalTime.of(8,20,30));
        System.out.println(LocalTime.of(8,20,30,150));
        LocalTime mTime =LocalTime.of(8,20,150,150);//自己设置会多一个纳秒

        //三.is系列的方法
        nowTime.isAfter(LocalTime.of(8,20));
        //nowTime.isAfter()
        nowTime.isBefore(LocalTime.of(8,20));




    }
}

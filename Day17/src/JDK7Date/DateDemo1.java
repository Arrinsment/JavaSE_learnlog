package JDK7Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        //一.创建一个时间data对象,去获取当前时间
        Date d=new Date();
        System.out.println(d);//Wed Mar 25 19:30:09 CST 2026

        //二.创建一个对象去获取指定的时间,传入的x数据表示从标准时间开始过了x毫秒后的时间是什么,然后他接收的参数是long类型的 所以后面最好加上L
        Date d2=new Date(0L);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970

        //三.用setTime去修改时间
        //秒 毫秒 微秒 纳秒 相邻间的时间间隔单位是1000
        d2.setTime(1000);//表示在标准时间下过了1000毫秒也就是1秒种
        System.out.println(d2);//Thu Jan 01 08:00:01 CST 1970

       //四.用getTime去获取当前时间距离标准时间的毫秒值,用long time去接收
        long time  =d2.getTime();
        System.out.println(time);//1000




    }
}

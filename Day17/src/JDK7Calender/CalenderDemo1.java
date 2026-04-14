package JDK7Calender;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo1 {
    public static void main(String[] args) {

        //这里我们做做JDK7Calender的代码演示

        //一.获取Calender(日历)的对象
        //细节1:
        //1.Calender对象是抽象类, 没有办法直接去创建对象,我们要去利用 getInstanceOf()去获取对象
        //2.会根据系统的不同去获取不同的日历对象,默认表示当前系统的时间
        //3.会把纪元,时间,年,月,日那些 全部放在同一个数组中

        //细节2:
        //关于月份在老外的眼中[0,11] 0就是1月份,以此类推,11就是12月
        //老外的眼中 星期天是开始的第一天  星期天:1,星期一:2,星期二:3,星期三:4,星期四:5,星期五:6,星期六:7

        Calendar c=Calendar.getInstance();
        System.out.println(c);//java.util.GregorianCalendar[time=1774499603427,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=85,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=33,SECOND=23,MILLISECOND=427,ZONE_OFFSET=28800000,DST_OFFSET=0]


        //二.修改一下日历代表的时间
        Date d=new Date(0L);
        c.setTime(d);
        System.out.println(c);//,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1

        //三.利用Calender的 get方法去获取ddata中年,月,日,时间那些
        int year=c.get(Calendar.YEAR);//直接用Calender去获取year即可
        int month=c.get(Calendar.MONTH)+1;//获取月份
        int day=c.get(Calendar.DAY_OF_MONTH);//获取一个月的一天
        int week=c.get(Calendar.DAY_OF_WEEK);//获取一个星期几
        System.out.println("year:"+year+"month:"+month+"Day:"+day+"week:"+getWeek1(week));//year:1970month:1Day:1week:星期四
        System.out.println("--------------------------------------------------------------");

        //四.利用Calender的set方法直接去把对应的field(年月日)去修改为你想要去修改的
        //修改为2000年
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);//写11就代表修改为12月了
        int year1=c.get(Calendar.YEAR);//直接用Calender去获取year即可
        int month1=c.get(Calendar.MONTH)+1;//获取月份
        int day1=c.get(Calendar.DAY_OF_MONTH);//获取一个月的一天
        int week1=c.get(Calendar.DAY_OF_WEEK);//获取一个星期几
        System.out.println("year:"+year1+"month:"+month1+"Day:"+day1+"week:"+getWeek1(week1));//year:2000month:12Day:1week:星期五
        System.out.println("--------------------------------------------------------------");

        //五.利用Calender的add方法去把对应的field(年月日)增加或去减少 对应的,负数就是去减少
        c.add(Calendar.YEAR,5);//把2000年增加5年
        c.add(Calendar.DAY_OF_MONTH,10);//把月份加10
        int year2=c.get(Calendar.YEAR);//直接用Calender去获取year即可
        int month2=c.get(Calendar.MONTH)+1;//获取月份
        int day2=c.get(Calendar.DAY_OF_MONTH);//获取一个月的一天
        int week2=c.get(Calendar.DAY_OF_WEEK);//获取一个星期几
        System.out.println("year:"+year2+"month:"+month2+"Day:"+day2+"week:"+getWeek1(week2));
        //year:2005month:12Day:11week:星期天

        System.out.println("--------------------------------------------------------------");



    }
    public static String getWeek1(int index){
        String []arr={"","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index];
    }
}

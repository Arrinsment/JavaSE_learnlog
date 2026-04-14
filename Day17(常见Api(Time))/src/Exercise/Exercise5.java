package Exercise;

import java.time.LocalDate;
import java.util.Calendar;

public class Exercise5 {
    public static void main(String[] args) {


        //判断一个年份是润年还是平年,请用jdk7/jdk8的方式去判断
        //如果一年有366天那么这天是闰年
        //如果二月有29天,那么这年是闰年


        //那么我们很明显有2个思路,一个我们是去计算2月有多少天,或者去计算一年有多少天


        //一.jdk7
        //然后我们这里用的是Calender这个类
        Calendar c=Calendar.getInstance();
        c.set(2005,2,1);//然后你切记月份是0-11
        c.add(Calendar.DAY_OF_MONTH,-1);
          int days= c.get(Calendar.DAY_OF_MONTH);
          if(days==29){
              System.out.println("闰年");
          }
          else{
              System.out.println("平年");
          }

        Calendar c1=Calendar.getInstance();
          c1.set(2039,1,1);
          c1.add(Calendar.DAY_OF_YEAR,-1);
          int days1=c1.get(Calendar.DAY_OF_YEAR);
        if(days==366){
            System.out.println("闰年");
        }
        else{
            System.out.println("平年");
        }

        //二.jdk8

        //方式一
        LocalDate id=LocalDate.of(2100,3,1);
        LocalDate id2= id.minusDays(1);
        int day=id2.getDayOfMonth();
        System.out.println(day);

        //方式二:
        //直接调用leapyear即可,是闰年返回true,不是闰年返回false
        System.out.println(id.isLeapYear());



    }
}

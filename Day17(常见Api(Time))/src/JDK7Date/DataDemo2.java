package JDK7Date;

import java.util.Date;
import java.util.Random;

public class DataDemo2 {
    public static void main(String[] args) {

        //exercise1:一获取从标准时间开始过了一年后的时间:

        //表示标准时间,如果你什么都不传就代表是当前时间
        Date d1=new Date(0L);

        //计算365天的毫秒值
        long time =1000L*60*60*24*365;

        //利用setTime方法去设置
        d1.setTime(time);
        System.out.println(d1);
        System.out.println("---------------------------------------------------");
        //exercise2:获取2个随机时间进行比较
        Random r=new Random();
        int num=r.nextInt();//没有写范围就是在int 里面随机找数字去比较,我们要注意,这个结果可正,可负数,所以我们要用绝对值
        Date d2=new Date(Math.abs(num));
        long time1=d2.getTime();
        System.out.println(d2);
        int num2=r.nextInt();
        Date d3=new Date(Math.abs(num2));
        long time2=d3.getTime();
        System.out.println(d3);
        if (time1>time2){
            System.out.println("第一个大");
        }
        else{
            System.out.println("第二个大");
        }
    }
}

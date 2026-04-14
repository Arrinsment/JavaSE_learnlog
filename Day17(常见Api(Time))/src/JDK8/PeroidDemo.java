package JDK8;

import java.time.LocalDate;
import java.time.Period;

public class PeroidDemo {

    public static void main(String[] args) {

        //这个period工具类,更加侧重年月日的时间间隔
        //当前本地年月日
        LocalDate localTime=LocalDate.now();
        System.out.println(localTime);

        //自己利用of去设置时间日期的一个方法
        LocalDate BirthDayTime=LocalDate.of(2005,11,05);

        //创建一个period 对象去调用里面的一个between方法去计算差值即可
        System.out.println();
        Period period=Period.between(localTime,BirthDayTime);
        //这里是用第二个参数去减去第一个参数
        System.out.println(period);//P-20Y-4M-22D

        //当然我们也可以直接把他们调出来.利用get方法
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}

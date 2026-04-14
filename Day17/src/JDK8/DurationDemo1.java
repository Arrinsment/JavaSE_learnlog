package JDK8;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo1 {
    public static void main(String[] args) {


        LocalDateTime localDatetime = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2005, 11, 05, 0, 0, 0, 0);

        //利用duratio这个工具类还有between去获取差值
        //然后这里还是用第二个参数去减去第一个参数
        Duration duration=Duration.between(birthday,localDatetime);
        System.out.println(duration);//PT-178739H-7M-20.3514311S


       //然后可以用 duration和to去直接去获取对应的差值
        System.out.println(duration.toDays());//天数的差值//7447,哈哈哈,不知不觉我已经活了那么久了吗?7447天
        System.out.println(duration.toHours());//小时的差值


    }
}
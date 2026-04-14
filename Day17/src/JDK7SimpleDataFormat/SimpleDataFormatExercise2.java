package JDK7SimpleDataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExercise2 {
    public static void main(String[] args) throws ParseException {

        //练习:这里有个秒杀活动,时间开始是2023年11月11日00:00:00--2023年11月11日00:10:00
        //下面有2个人下单
        //personA:2023年11月11日00:02:00
        //personB:2023年11月11日00:11:00
        //请用代码表示谁可以秒杀成功
        String startTime="2023年11月11日00:00:00";
        String endTime="2023年11月11日00:10:00";
        String orderTime="2023年11月11日00:02:00";
        String orderTime2="2023年11月11日00:11:00";

        //讲字符串解析为时间对象
        //注意要与原本的字符串的格式一样
        SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date d1=s.parse(startTime);
        Date d2=s.parse(endTime);
        Date d3=s.parse(orderTime);
        Date d4=s.parse(orderTime2);


        long time = d1.getTime();
        long time1 = d2.getTime();
        long time2=d3.getTime();
        long time3=d4.getTime();


        if(time2>=time&&time2<=time1){
            System.out.println("personA秒杀成功");
        }
        else{
            System.out.println("personAmiao杀失败");
        }
        if(time3>=time&&time3<=time1){
            System.out.println("personB秒杀成功");
        }
        else{
            System.out.println("personB秒杀失败");
        }




    }
}

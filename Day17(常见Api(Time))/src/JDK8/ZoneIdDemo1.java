package JDK8;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {

        //一.zoneId
        //方法一.利用getAvailableZoneids()去获取zoneId去获取所有时区
        //getAvailableZoneids()可以获取Java中的所有时区 ,如果你要查找可以在控制台中用Ctrl+f去找即可

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//获取时区的长度
        System.out.println(zoneIds);//打印所有java中的时区


        //二.获取当前系统的默认时区,用systemDefault
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai


        //三.利用of去获取指定的时区,然后里面的内容要自己去写
        ZoneId  zoneId1 =ZoneId.of("Africa/Nairobi");
        System.out.println(zoneId1);

        //
    }
}

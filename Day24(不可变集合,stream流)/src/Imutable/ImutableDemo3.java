package Imutable;
import java.util.Map;
import java.util.Set;


public class ImutableDemo3 {
    public static void main(String[] args) {

        //// 创建Map的不可变集合
        //Map<String, String> map = Map.of(
        //    "张三", "南京",
        //    "李四", "北京",
        //    "王五", "上海",
        //    "赵六", "广州",
        //    "孙七", "深圳",
        //    "周八", "杭州",
        //    "吴九", "宁波",
        //    "郑十", "苏州",
        //    "刘一", "无锡",
        //    "陈二", "嘉兴"
        //);


        //细节1:键是不能重复的
        //细节2:最多只有20个参数,10个键值对


        Map<String, String> mp = Map.of("张三", "南京", "李四", "北京", "王五", "上海",

                "赵六", "广州", "孙七", "深圳", "周八", "杭州",

                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",

                "陈二", "嘉兴");

        //遍历
        System.out.println("------------------------------------------------------------");

        //键找值
        Set<String> s = mp.keySet();
        for (String s1 : mp.keySet()) {
            //通过 hm去传入键,然后利用get去获取值
            String Value=mp.get(s1);
            System.out.println(s1+"="+Value);
        }


        System.out.println("------------------------------------------------------------");

        //去获取键值对
        Set<Map.Entry<String, String>> entries = mp.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}

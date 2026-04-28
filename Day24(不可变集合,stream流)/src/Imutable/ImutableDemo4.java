package Imutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImutableDemo4 {

    public static void main(String[] args) {

        //这里讲讲Map集合的第3个细节
        //:就是假如我们想在Map不可变集合添加的元素,超过20个了,我们应该怎么办?
        HashMap<String,String> hm=new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        Set<Map.Entry<String, String>> entries = hm.entrySet();

        //把entries 变成一个数组
            Map.Entry[] arr1=  new Map.Entry[0];
         //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
         //如果集合的长度 > 数组的长度：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
         //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用

        Map.Entry[] arr2 = entries.toArray(arr1);

        Map map=Map.ofEntries(arr2);

        //这个map集合就是一个不可变的集合


        //但上面的太麻烦了,不如直接用 Copyof方法
        Map<String, String> map1 = Map.copyOf(hm);
        //这里的map1就是 一个不可变的map集合
        map1.put("aaa","aaaa");//报错,因为集合不可变


    }
}

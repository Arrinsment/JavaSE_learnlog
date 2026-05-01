package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class streamDemo3 {
    public static void main(String[] args) {

        //双列集合：无，无法直接使用 Stream 流

        //先去创建一个HashMap集合
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //双列集合是无法直接去获取stream,要先去获取但列集合,利用keyset()或者entrySet

        Set<String> s = hm.keySet();
        s.stream().forEach(s1 -> System.out.println(s1+" "));

        System.out.println();
        Set<Map.Entry<String, Integer>> s2 = hm.entrySet();
        s2.stream().forEach(s3-> System.out.print(s3+" "));

        //aaa
        //ccc
        //bbb
        //ddd
        //aaa=111 ccc=333 bbb=222 ddd=444


    }
}

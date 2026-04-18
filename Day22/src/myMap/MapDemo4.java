package myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {

        //这里我们去使用一下Map的第3种遍历方式:lamda表达式去遍历

        //一.创建一个Map集合
        Map<String,String>m=new HashMap<>();

        //二.添加元素
        m.put("张飞","俺也是");
        m.put("阿玮","杰哥不要呀");
        m.put("韩信","不做无法实现的梦");
        m.put("李云龙","你他娘的还真是个天才");

        //利用foreach 遍历,是去new new BiConsumer<String, String>()这个方法
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });
        /*张飞=俺也是
        韩信=不做无法实现的梦
        李云龙=你他娘的还真是个天才
        阿玮=杰哥不要呀*/

        System.out.println("-----------------------------------------");
        //这里使用lamda简化后的表达式去遍历一下
        m.forEach((String key, String value) -> System.out.println(key+"="+value));
        //张飞=俺也是
        //韩信=不做无法实现的梦
        //李云龙=你他娘的还真是个天才
        //阿玮=杰哥不要呀


        //他这个源码类似这样
        /*//一.创建一个集合去存储 键值对,用到的方法是EntrySet
        Set<Map.Entry<String, String>> entries = m.entrySet();//这个set集合就存储了,所有的键值对

        //接下来,去遍历集合,然后利用getKey和getValue去获取值
        //1.增强for遍历
        //这里不是entries ,for (Map.Entry<String, String> entry :entries),而是直接m.entrySet()

        for (Map.Entry<String, String> entry :m.entrySet() ) {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + "=" + value);
        }*/

    }
}

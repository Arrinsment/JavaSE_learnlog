package myMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {

        //Entry:键值对
        //这里讲讲Map的第二种遍历方式:键值对

        //一.创建一个Map对象
        Map<String,String>m=new HashMap<>();

        //添加元素
        m.put("小乔","周瑜");
        m.put("项羽","虞姬");
        m.put("刘备","孙尚香");

        //一.创建一个集合去存储 键值对,用到的方法是EntrySet
        Set<Map.Entry<String, String>> entries = m.entrySet();//这个set集合就存储了,所有的键值对

        //接下来,去遍历集合,然后利用getKey和getValue去获取值
        //1.增强for遍历
        for (Map.Entry<String, String> entry : entries) {
            String value=entry.getValue();
            String key=entry.getKey();
            System.out.println(key+"="+value);
        }
        //刘备=孙尚香
        //项羽=虞姬
        //小乔=周瑜
        System.out.println("--------------------------------------------------------");

        //2.迭代器,Iterator
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> its = it.next();
            String v= its.getValue();
            String key= its.getKey();
            System.out.println(key+"="+v);
        }
        /*刘备=孙尚香
        项羽=虞姬
        小乔=周瑜*/

        System.out.println("---------------------------------------------------------");

        //3.利用foreach lamda表达式进行遍历
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String>i) {
                System.out.println(i.getKey()+"="+i.getValue());
            }
        });
        //刘备=孙尚香
        //项羽=虞姬
        //小乔=周瑜
        System.out.println();

        System.out.println("--------------------------------------------------------------");
        //这里使用lamda去简化foreach
        entries.forEach((i -> System.out.println(i.getKey()+"="+i.getValue())));
        //刘备=孙尚香
        //项羽=虞姬
        //小乔=周瑜




    }
}

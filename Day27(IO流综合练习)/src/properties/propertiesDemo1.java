package properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propertiesDemo1 {

    public static void main(String[] args) {

        //这里的property的单词含义是属性的意思

        //properties
        //properties是一个双列集合集合，拥有Map集合所有的特点。
        //重点:有一些特有的方法，可以把集合中的数据，按照键值对的形式写到配置文件当中。
        //也可以把配置文件中的数据，读取到集合中来。

        //一.创建一个集合对象
        //细节:一般我们往properties 添加的都是字符串

        //细节2:我们这里是没有去写泛型的
        //Properties 继承自 Hashtable<Object, Object>，所以它的 keySet() 方法返回的是 Set<Object>，而不是 Set<String>。
        Properties pr=new Properties();

        //二.添加元素
        pr.put("aaa","111");
        pr.put("bbb","222");
        pr.put("ccc","333");
        pr.put("ddd","444");


        //三.遍历对象
        //方式一.通过键去找值
        Set<Object> key = pr.keySet();
        for (Object k : key) {
            Object value=pr.get(k);
            System.out.println(k+" "+value);
        }

        //aaa 111
        //ccc 333
        //bbb 222
        //ddd 444

        //方式二:通过键值对的方式
        Set<Map.Entry<Object, Object>> entries = pr.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key1=entry.getKey();
            Object val1=entry.getValue();
            System.out.println(key1+" "+val1);
        }

        //aaa 111
        //ccc 333
        //bbb 222
        //ddd 444

    }
}

package myMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {
        //这里我们去学学Map
        /*双列集合的特点
         1. 双列集合一次需要存一对数据，分别为键和值
         2. 键不能重复，值可以重复
         3. 键和值是一一对应的，每一个键只能找到自己对应的值
         4. 键 + 值这个整体我们称之为“键值对”或者“键值对象”，在 Java 中叫做 “Entry对象”*/

         /*Map、HashMap、LinkedHashMap、TreeMap 的关系
         1.Map 是双列集合的顶层接口，定义了键值对存储的基本规范。
         2.HashMap 是 Map 接口的直接实现类，底层采用哈希表结构，存储无序，查询效率高。
         3.LinkedHashMap 是 HashMap 的子类，在 HashMap 的基础上内部维护了一个双向链表，用于记录元素的插入顺序（或访问顺序），因此遍历时是有序的。
         4.TreeMap 是 Map 接口的另一个实现分支（实现了 NavigableMap 接口），底层采用红黑树结构，可以对键进行自然排序或自定义排序。*/


        /*
         V put(K key, V value)                 // 添加元素
         V remove(Object key)                  // 根据键删除键值对元素
         void clear()                          // 移除所有的键值对元素
         boolean containsKey(Object key)       // 判断集合是否包含指定的键
         boolean containsValue(Object value)   // 判断集合是否包含指定的值
         boolean isEmpty()                     // 判断集合是否为空
         int size()                            // 集合的长度，也就是集合中键值对的个数
       */


        //这里的Map是Java底层的一个接口,你是没有办法直接去创建接口的对象的,你要去创建
        //然后  HashMap、LinkedHashMap、TreeMap都是Map的实习类


        //一.创建一个Map集合的对象,不能直接new Map,要创建他们的实现类
        Map<String,String> m=new HashMap<>();


        //二.(添加元素)利用是双列集合的put方法发去添加元素,这里是put,不是单列集合中的add了
        //关于,put添加元素方法的细节:
        //put:添加/覆盖
        //细节1:在添加数据的时候,如果键不存在,那么直接把键值对 对象添加到Map中去,返回null,然后如果你用String 去接收的话,会得到null;
        //细节2:在添加数据的时候,如果键是存在的,那么直接把原来的键值进行覆盖,然后返回原来的键值,然后如果你用String 去接收的话,会得到原来键值;

       m.put("老公","老婆");
       m.put("可乐","3元");
       String v=m.put("骚福瑞","sb");
       //覆盖前
       System.out.println(v);//null

        System.out.println(m);//{老公=老婆, 骚福瑞=sb, 可乐=3元}

        //被覆盖后
        String v1= m.put("可乐","5元");
        System.out.println(v1);//3元
        System.out.println(m);//{老公=老婆, 骚福瑞=sb, 可乐=5元}

        System.out.println("------------------------------------------------------------------------------");
        //三.删除元素
        //细节:根据对应的键去删除双列集合中的对应键值对,然后返回的是值
       String s=  m.remove("可乐");
        System.out.println(s);//5元
        System.out.println(m);//{老公=老婆, 骚福瑞=sb}

        System.out.println("------------------------------------------------------------------------------");

        //四.清空,利用clear,没有返回值
      //  m.clear();
        System.out.println(m);//{}

        System.out.println("------------------------------------------------------------------------------");

        //五.判断集合是否包含
        //这有2个方法一个是判断是否存在值的,一个是判断是否存在键的
        //containsKey 和 containsValue
       boolean res= m.containsKey("老公");
       boolean ans=m.containsValue("3元");
        System.out.println(res);//true
        System.out.println(ans);//false

        System.out.println("------------------------------------------------------------------------------");
        //六.集合的长度
        int len=m.size();
        System.out.println(len);//2


    }

}

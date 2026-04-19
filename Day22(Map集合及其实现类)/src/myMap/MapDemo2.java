package myMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        //这里讲讲Map的三种遍历方式
        //1.键找值
        //2.键值对
        //3.lamda表达式


        //一.创建一个Map集合
        Map<String,String>m=new HashMap<>();

        //二.添加元素
        m.put("a","b");
        m.put("c","d");
        m.put("e","f");


        //一.第一种遍历方式:键找值
        //先去获取所有的key元素,利用 keySet方法,然后用一个单列集合去接收
        Set<String> s = m.keySet();
        System.out.println(s);//

        //然后我们开始遍历,用得到的键去获取对应的值即可
        //涉及到最后得到结果,有三种的遍历方式

        //1.利用增强fori去遍历
        for (String key : s) {
            //利用get(Key),然后这个方法就会返回出一个对应的键值
            String v= m.get(key);
            //System.out.print(v+" ");//b d f
            System.out.println(key+"="+v);
        }

        System.out.println("-------------------------------------------------");

        //2.利用迭代器进行遍历
        Iterator<String>it=s.iterator();
        while(it.hasNext()){
           String S= it.next();
              String v=m.get(S);
            System.out.println(S+"="+v);
            //a=b
            //c=d
            //e=f
        }
        System.out.println("-------------------------------------------------");

        //3.利用forEach去遍历
        /* s.forEach(new Consumer<String>() {
             @Override
             public void accept(String s) {
                 String Value=m.get(s);
                 System.out.println(s+"="+ Value);
             }
             //a=b
             //c=d
             //e=f
         });
       */
         //这里我们可以把他们进行一个lamda方式的简写
        s.forEach( s1-> {
                String Value=m.get(s1);
                System.out.println(s1+"="+ Value);
            }
            //a=b
            //c=d
            //e=f
        );


    }
}

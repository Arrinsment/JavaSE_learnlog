package Interator;

import java.util.ArrayList;
import java.util.Collection;

public class InteratorDemo3 {
    public static void main(String[] args) {

        //这里我们用lambda表达式去遍历
        //这里我们主要用到的是forEach(然后往里面加个Consumer)

        //创建一个集合往里面添加元素

        /* Collection系列集合三种通用的遍历方式：
       1. 迭代器遍历
       2. 增强for遍历
       3. lambda表达式遍历

       lambda表达式遍历:
       default void forEach(Consumer<? super T> action):
       */


        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");


       /* coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //我们这里直接进行简写:
        coll.forEach( s ->System.out.println(s));
    }
}
     //zhangsan
     //lisi
     //wangwu
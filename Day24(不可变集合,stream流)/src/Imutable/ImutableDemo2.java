package Imutable;

import java.util.Iterator;
import java.util.Set;

public class ImutableDemo2 {
    public static void main(String[] args) {

        //set集合细节,里面的内容必须保证唯一性,就是不能不是重复的

        //这里讲讲不可变集合中的set集合
        Set<String> set = Set.of("张三, 李四, 王五, 赵六");

        //同样也是添加后,不能在进行修改了,只能进行查询


        //遍历
        System.out.println("---------------------------------------");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
           String s= it.next();
            System.out.println(s);
        }


    }
}

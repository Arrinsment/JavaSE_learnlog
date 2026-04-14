package Interator;

import java.util.ArrayList;
import java.util.Collection;

public class InteratorDemo2 {
    public static void main(String[] args) {

        //这里我们讲讲for增强遍历

        //增强for格式:
        //for(数据类型 变量名:集合/数组)


        //1.创建集合并添加元素
        Collection<String>coll=new ArrayList<>();

        coll.add("aaa");
        coll.add("ccc");
        coll.add("ddd");

        //利用增强for循环进行遍历
        //s其实就是一个第三方变量,循环过程中,依次表示集合中的每一个数据
       /* for(String s:coll){
            System.out.println(s);
        }*/

        //如果直接用coll.for 那么自然就会知道

        /*for (String s : coll) {  //aaa ccc ddd
            System.out.println(s);
        }*/


        //细节2:假如我把这里是的s换成了qqq,集合里面的数据也是不会变的
        for (String s : coll) {
            s="qqq";
        }
        System.out.println(coll) ;//[aaa, ccc, ddd]
    }
}

package SetDemo1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        //TreeSet的特点:
        //- 不重复、无索引、可排序
        //- 可排序: 按照元素的默认规则（有小到大）排序。就是他自动进行了排序
        //- TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好

        //1.这里我们先创建一个TreeSet的set集合,然后添加数字并进行遍历,因为他会自动进行排序,所以我们直接进行遍历即可
        TreeSet<Integer>ts=new TreeSet<>();

        //2.往set集合里面加入数字
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);

        System.out.println(ts);//[1, 2, 3, 4, 5]
        //3.进行遍历

        //一.迭代器遍历
        Iterator<Integer>it=ts.iterator();
        while(it.hasNext()){
           int i=it.next();
            System.out.print(i+" ");//1 2 3 4 5

        }
        System.out.println();
        System.out.println("--------------------------------------");

        //二.增强fori
        for (int i:ts){
            System.out.print(i+" ");//1 2 3 4 5
        }
        System.out.println();
        System.out.println("--------------------------------------");

        //三.lamda表达式
        ts.forEach( i-> System.out.print(i+" "));//1 2 3 4 5

    }
}

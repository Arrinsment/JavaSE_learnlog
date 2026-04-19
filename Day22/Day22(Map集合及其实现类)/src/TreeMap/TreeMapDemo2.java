package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {


      /*  TreeMap集合：基本应用
        需求1：
        键：整数表示id
        值：字符串表示商品名称
        要求1：按照id的升序排列

        要求2：按照id的降序排列*/


        //一.创建一个对象
       /* TreeMap<Integer,String>tm=new TreeMap<>();

        //添加元素
        tm.put(4,"可乐");
        tm.put(2,"雷壁");
        tm.put(3,"奶啤");
        tm.put(1,"加多宝");

        //他默认是从小到最高排序的,这不恰好就是满足要求1吗?
        System.out.println(tm);//{1=加多宝, 2=雷壁, 3=奶啤, 4=可乐}*/


        //要求2:我们直接在TreeMap后面去new comparaTor即可
        TreeMap<Integer,String> tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //添加元素
        tm.put(4,"可乐");
        tm.put(2,"雷壁");
        tm.put(3,"奶啤");
        tm.put(1,"加多宝");

        System.out.println(tm);//{4=可乐, 3=奶啤, 2=雷壁, 1=加多宝}
        //这里我们可以发现他是从大到小进行排序的



    }
}

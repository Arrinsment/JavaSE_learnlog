package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {

    //Collections
    //- java.util.Collections: 是集合工具类
    //- 作用: Collections不是集合，而是集合的工具类。

    //常见的API:
    //Collections常用的API
    //| 方法名称 | 说明 |
    //| public static <T> boolean addAll(Collection<T> c, T... elements) | 批量添加元素 |
    //| public static void shuffle(List<?> list) | 打乱List集合元素的顺序 |
    //| public static <T> void sort(List<T> list) | 排序 |
    //| public static <T> void sort(List<T> list, Comparator<T> c) | 根据指定的规则进行排序 |
    //| public static <T> int binarySearch (List<T> list, T key) | 以二分查找法查找元素 |
    //| public static <T> void copy(List<T> dest, List<T> src) | 拷贝集合中的元素 |
    //| public static <T> int fill (List<T> list, T obj) | 使用指定的元素填充集合 |
    //| public static <T> void max/min(Collection<T> coll) | 根据默认的自然排序获取最大/小值 |
    //| public static <T> void swap(List<?> list, int i, int j) | 交换集合中指定位置的元素 |

    //直接类名去调用即可
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();


        System.out.println("------------- 1.批量添加元素-------------------------");
        Collections.addAll(list,"Precise","Patient","Logical","Elegant","Resourceful","Structured","Creative","Relentless","Humble","My");
        System.out.println(list);//[Precise, Patient, Logical, Elegant, Resourceful, Structured, Creative, Relentless, Humble, My]
        //这是追加式拷贝：列表会变长。



        System.out.println("------------- 2.打乱List集合元素的顺序-------------------------");
        //shuffle的含义:洗牌的意思
        Collections.shuffle(list);
        System.out.println(list);//[Humble, Patient, Relentless, My, Creative, Logical, Precise, Resourceful, Structured, Elegant]


        System.out.println("------------- 3.排序-------------------------");

        //这个排序默认就是冲小到大的
        //添加元素
        Collections.addAll(list2,1,5,6,2,4,3,8,9,7);
        Collections.sort(list2);
        System.out.println(list2);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        //这里为了方便下面的collection的方法去玩,还是先去把他们进行洗牌,shuffle
        Collections.shuffle(list2);
        System.out.println(list2);//[2, 3, 7, 4, 1, 5, 8, 9, 6]

        System.out.println("------------- 4.根据指定的规则进行排序-------------");
         Collections.sort(list2, new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 return o2-o1;
             }
         });
        System.out.println(list2);//[9, 8, 7, 6, 5, 4, 3, 2, 1]


        System.out.println("---------------5.以二分查找法查找元素------------------------------");

        // Collections.sort(list2);先升序排序,为了和防止和下面的方法冲突,先注释掉,所以现在的list2是降序的
        //二分查找的核心思想是：每次排除一半的元素，但前提是列表必须已经 升序排序。
        //找到返回索引，找不到返回 (-(插入点) - 1)
             int a = Collections.binarySearch(list2,1);
             int d = Collections.binarySearch(list2,800);
                 System.out.println(a);//0
                 System.out.println(d);//-10,从下标为9的位置就发现找不到了,所以为-9-1


        System.out.println("--------------- 6.拷贝集合中的元素 --------------------------");
        //这是替换式拷贝：目标列表的长度不变，只是把每个位置上的旧值换成新值。
        // public static <T> void copy(List<T> dest, List<T> src),是把source的元素拷贝到destination

        ArrayList<Integer>des=new ArrayList<>();
        Collections.addAll(des,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
        System.out.println(des);//[11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
        //把list2的元素全部都覆盖式拷贝到des去
        Collections.copy(des,list2);
        System.out.println(des);//[9, 8, 7, 6, 5, 4, 3, 2, 1, 20, 21, 22, 23, 24, 25, 26]
        //这是覆盖式拷贝,新值去换旧值,把11, 12, 13, 14, 15, 16, 17, 18, 19全部换成了list2的值,9,8,7,6,5,4,3,2,1


        System.out.println("--------------- 7.使用指定的元素填充集合--------------------------");
        // Collections.fill(list2,33);
        //元素全部都被33去填充
        //System.out.println(list2);//[33, 33, 33, 33, 33, 33, 33, 33, 33]



        System.out.println("--------------- 8.根据默认的自然排序获取最大/小值-------------------");
        int maxnum= Collections.max(list2);
        int minnum= Collections.min(list2);
        System.out.println(maxnum);//9
        System.out.println(minnum);//1


        System.out.println("----------------9.交换集合中指定位置的元素----------------------------");

        System.out.println(list2);//[9, 8, 7, 6, 5, 4, 3, 2, 1]

        //把下标为1的元素和下标为8的元素进行交换
        Collections.swap(list2,1,8);

        System.out.println(list2);//[9, 1, 7, 6, 5, 4, 3, 2, 8]













    }

}

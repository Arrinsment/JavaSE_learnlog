package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {

    public static void main(String[] args) {


        //LinkedHashMap
        //- 由键决定：有序、不重复、无索引。
        //- 这里的有序指的是保证存储和取出的元素顺序一致
        //- 原理：底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。

        /* LinkedHashMap:
        由键决定：
        有序、不重复、无索引。
        有序：
        保证存储和取出的顺序一致
        原理：
         底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
         * /
         */

        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("a",123);
        lhm.put("a",111);
        lhm.put("b",134);
        lhm.put("c",145);
        lhm.put("d",167);


        //这里存和取得顺序是完全一样的
        System.out.println(lhm);//{a=111, b=134, c=145, d=167}



    }
}


package List;

import java.util.ArrayList;
import java.util.List;

public class listDemo2 {
    public static void main(String[] args) {

        //list删除集合的2种方法
        //1.直接删除元素
        //2.通过索引删除元素

        //1.创建一个集合

        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        //remove(index)
        //1.假如你直接remove 删除,这里的index是索引
        list.remove(1);
        System.out.println(list);//[1, 3]


        //remove(Object)
        //2.这里通过直接删除元素
        Integer i=Integer.valueOf(1);
        list.remove(i);

        //2. 删除元素

        //请问：此时删除的是1这个元素，还是1索引上的元素？
        //为什么？

        //因为在调用方法的时候，如果方法出现了重载现象
        //优先调用，实参跟形参类型一致的那个方法。(remove如果后面是index就删除元素.如果后面是object就删除对象)

        System.out.println(list);//[3]




    }
}
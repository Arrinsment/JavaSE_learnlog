package Imutable;

import java.util.Iterator;
import java.util.List;

public class ImutableDemo1 {

    public static void main(String[] args) {

         //这里的Immutable是不可变的意思
        //这里主要讲讲不可变集合,就是创建以后,不能被修改那种

        //创建不可变的List集合
        //List<String> list = List.of("张三", "李四", "王五", "赵六");//这里的of里面的形参是可变参数

        List<String> list=List.of("张三", "李四", "王五", "赵六");
        //这里一旦创建后,就不能去修改了,我们可以去查询

        //遍历:
        System.out.println("-------------------------------------------------------");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("--------------------------------------------------------");
        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){

           String s =  it.next();
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------");
        //普通遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

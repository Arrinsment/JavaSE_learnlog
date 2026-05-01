package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class streamDemo8 {
    public static void main(String[] args) {
        //map    转换流中的数据类型
        //注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");

        //现在去把名字后面的数字单独打印出来

        //第一个参数代表集合的类型,第二个参数代表要去转换的类型,返回的也是这个类型


        list.stream().map(new Function<String, Integer>() {
            //按住Ctrl + O 选择要进行重写的方法
            @Override
            public Integer apply(String s) {
                String[] s1 = s.split("-");
                return   Integer.parseInt(s1[1]);
            }
        }).forEach(s-> System.out.print(s+" "));//15 14 13 20 100 40 35 37

        System.out.println();
        list.stream().map(s ->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.print(s+" "));//15 14 13 20 100 40 35 37


    }
}

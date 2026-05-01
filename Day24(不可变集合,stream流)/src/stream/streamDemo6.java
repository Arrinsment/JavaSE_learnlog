package stream;

import java.util.ArrayList;
import java.util.Collections;

public class streamDemo6 {
    public static void main(String[] args) {
        //Stream流的中间方法
        //名称	说明
        //Stream<T> filter(Predicate<? super T> predicate)	过滤
        //Stream<T> limit(long maxSize)	获取前几个元素
        //Stream<T> skip(long n)	跳过前几个元素
        //Stream<T> distinct()	元素去重，依赖 hashCode 和 equals 方法
        //static <T> Stream<T> concat(Stream a, Stream b)	合并 a 和 b 两个流为一个流
        //Stream<R> map(Function<T, R> mapper)	转换流中的数据类型
        //注意1：中间方法，返回新的 Stream 流，原来的 Stream 流只能使用一次，建议使用链式编程。
        //注意2：修改 Stream 流中的数据，不会影响原来集合或者数组中的数据。

        //先去讲下:filter,limit,skip这三个:
        // Stream流的中间方法
        //
        //filter     // 过滤
        //limit      // 获取前几个元素
        //skip       // 跳过前几个元素
        //
        //// 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //// 注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //filter 如果是张开头就去留下
        //先去获取一条stream流
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //这里的s就是集合中的每一个元素
                //可以利用s.startwith("张");如果是张就返回true;不是就返回false
                return s.startsWith("张");
            }
        }).forEach(s-> System.out.print(s+" "));//张无忌 张强 张三丰 张翠山 张良 */


        //上面这种写法稍微有点麻烦
        list.stream().filter(s->s.startsWith("张")).forEach(s -> System.out.print(s+" "));//张无忌 张强 张三丰 张翠山 张良

        System.out.println();
        //limit   // 获取前几个元素
        //skip    // 跳过前几个元素

        //"张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
        //使用stream流不会对,集合中的元素进行修改,同一条stream流不能被反复去使用

        //1.limit 去获取前n个元素
        list.stream().limit(4).forEach(s -> System.out.print(s+" "));//张无忌 周芷若 赵敏 张强

        System.out.println();
        //2.skip  去跳过前n个元素
        list.stream().skip(4).forEach(s -> System.out.print(s+" "));//张三丰 张翠山 张良 王二麻子 谢广坤

        //课堂练习：
        //"张强", "张三丰", "张翠山"

        System.out.println();
        list.stream().skip(3).limit(3).forEach(s-> System.out.print(s+" "));//张强 张三丰 张翠山


    }
}

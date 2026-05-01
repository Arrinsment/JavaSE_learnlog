package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamDemo2 {
    public static void main(String[] args) {

        //# Stream流的使用步骤：
        //1. 先得到一条Stream流（流水线），并把数据放上去
        //2. 使用中间方法对流水线上的数据进行操作
        //3. 使用终结方法对流水线上的数据进行操作

        //② 利用Stream流中的API进行各种操作
        // 中间方法:过滤  转换,方法调用完毕之后，还可以调用其他方法
        // 终结方法:打印  统计,最后一步，调用完毕之后，不能调用其他方法


        //这里我们先去得到一条stream流水线
        //单列集合：default Stream<E> stream()，是 Collection 中的默认方法
        //双列集合：无，无法直接使用 Stream 流
        //数组：public static <T> Stream<T> stream(T[] array)，是 Arrays 工具类中的静态方法
        //一堆零散数据：public static<T> Stream<T> of(T... values)，是 Stream 接口中的静态方法



        //这里主要对 单列集合：default Stream<E> stream()，是 Collection 中的默认方法讲解
        //一.利用单列集合去获取一条stream流水线
        //1.创建一个集合
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g");

        //2.获取一条stream流水线,单列集合可以直接去获取
        Stream<String> stream1 = list.stream();
        //然后我们去使用终结方法,打印:

        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");//a b c d e f g
            }
        });


        //其实这里我们可以直接可以直接一下strem流就去把他们搞定
        list.stream().forEach(s-> System.out.print(s+"  "));//a  b  c  d  e  f  g









    }
}

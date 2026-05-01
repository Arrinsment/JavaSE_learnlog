package stream;

import java.util.stream.Stream;

public class streamDemo5 {
    public static void main(String[] args) {

        //一堆零散数据：public static<T> Stream<T> of(T... values)，是 Stream 接口中的静态方法
        //这里的数据类型必须全部都是相同的

        //这里oftream 的开头s是要求大写的
        Stream.of(1,2,3,4,5).forEach(s-> System.out.print(s+" "));
        System.out.println();
        Stream.of("a","b","c","d","e").forEach(s-> System.out.print(s+" "));

    }
}

package stream;

import java.util.Arrays;

public class streamDemo4 {
    public static void main(String[] args) {

        //数组：public static <T> Stream<T> stream(T[] array)，是 Arrays 工具类中的静态方法

        //基本类型数组
        int []arr={5,2,3,7,1};
        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));//5 2 3 7 1

        System.out.println();
        //引用数据类型数组
        String []s={"a","c","b","e","d"};
        Arrays.stream(s).forEach(s1-> System.out.print(s1+" "));//a c b e d


    }
}

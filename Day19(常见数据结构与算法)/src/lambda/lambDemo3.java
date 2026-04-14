package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambDemo3 {
    public static void main(String[] args) {



        //这里讲讲lambda的省略规则:
        //1.参数类型可以省略不写
        //2.如果只有一个参数,参数类型可以省略,同时()也可以省略.
        //3.如果lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略


        //这里我们先创建一个排序数组,然后如果你要用这个这个排序的话你要把基本数据类型先转换成为对应的包装类

        Integer []arr={2,9,6,3,4,5,1};
        Arrays.sort(arr, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return 01-02;
                    }
                }

        );


        //lambda的完整格式:
        //这里我们使用一下利用lambda的一个完整写法
        Arrays.sort(arr, (Integer o1, Integer o2)->{
                        return 01-02;
                    }
        );
       //()->{}的形式


        //lamda的省略格式:
        //1.参数类型可以省略不写
        //2.如果只有一个参数,参数类型可以省略,同时()也可以省略.
        //3.如果lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略

        //这里我们选择使用的是:降序
        Arrays.sort(arr, ( o1,  o2)-> o2-o1);
        System.out.println(Arrays.toString(arr));//[9, 6, 5, 4, 3, 2, 1]

}
}

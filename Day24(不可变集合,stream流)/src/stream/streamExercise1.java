package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class streamExercise1 {
    public static void main(String[] args) {
        //# 数据过滤
        //定义一个集合，并添加一些整数1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //过滤奇数，只留下偶数。
        //并将结果保存起来,保存一般保存在集合中去

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );

        //存在集合中
        List<Integer> list2 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);//[2, 4, 6, 8, 10]
        Integer[] list3 = list.stream().filter(s -> s % 2 == 0).toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        for (Integer in : list3) {
            System.out.print(in+" ");//2 4 6 8 10
        }


    }
}

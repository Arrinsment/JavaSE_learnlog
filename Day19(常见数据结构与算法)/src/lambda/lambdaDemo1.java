package lambda;

import java.util.Arrays;

public class lambdaDemo1 {
    public static void main(String[] args) {

        //现在我们初识别一下 lambda ,其中一个作用可以简化sort排序里面的内部类
        Integer []arr={1, 6,2,3,5,7,4,8,9};


/*
         原本的写法:
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        */

       /* compare(o1, o2) 方法需要返回一个整数：
        返回值	含义
        负数（如 -1） o1 < o2，o1 应该排在 o2 前面
        正数（如 1）	 o1 > o2，o1 应该排在 o2 后面
        0	两个对象相等，顺序不变
        */



        //用lambda的简化:
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o2-o1;
            }
        );



    }
}

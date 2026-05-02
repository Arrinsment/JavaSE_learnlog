package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class FunctionDemo7 {
    public static void main(String[] args) {

        ///*
        //方法引用（数组的构造方法）
        //格式
        //    数据类型[]::new
        //目的：
        //    创建一个指定类型的数组
        //需求：
        //    集合中存储一些整数，收集到数组当中
        //*/
        //

        //1.创建集合并添加元素
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        List<Integer> list2 = Arrays.stream(list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        })).collect(Collectors.toList());
        System.out.println(list2);//[1, 2, 3, 4, 5]

        Integer[] in = list2.stream().toArray(Integer[]::new);

    }
    //小结:
    //1. 什么是方法引用？
    //把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体
    //2. :: 是什么符号？
    //方法引用符
    //3. 方法引用时要注意什么？
    //需要有函数式接口
    //被引用方法必须已经存在
    //被引用方法的形参和返回值需要跟抽象方法保持一致
    //被引用方法的功能要满足当前的需求


    //引用静态方法
    //类名 :: 静态方法

    //引用成员方法:
    //对象 :: 成员方法
    //this :: 成员方法
    //super::成员方法

    //引用构造方法
    //类名::new

    //使用类名引用成员方法
    //类名::成员方法
    //不能引用所有类中的成员方法
    //如果抽象方法的第一个参数是A类型的
    //只能引用A类中的方法


    //引用数组的构造方法
    //数据类型[]::new






}


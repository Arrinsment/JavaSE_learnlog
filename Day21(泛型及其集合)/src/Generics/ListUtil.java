package Generics;

import java.util.ArrayList;

public class ListUtil {

    //这里主要写写泛型方法
    //1.当我们不知道具体形参方法的时候:
    //像GenericsDemo2 那样直接在类名后面去写<E>
    //或者直接在方法static旁边去写个<E>


    //下面我们对第二种方法进行一个代码演示


    //先对工具类方法私有化,不让外界去创建对象
    private  ListUtil(){};


    //定义一个addALL 去添加元素,然后我们去定义一个方法
    public static<E> void  addAll (ArrayList<E>list,E e,E e2){

        list.add(e);
        list.add(e2);
    }


}

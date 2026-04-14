package Generics;

import java.util.ArrayList;

public class GenericsDemo3 {

    public static void main(String[] args) {


        ArrayList<String>list =new ArrayList<>();
        //然后我们直接在工具类中去调用方法
        ListUtil.addAll(list,"aaa","bbb");

        System.out.println(list);
    }

}

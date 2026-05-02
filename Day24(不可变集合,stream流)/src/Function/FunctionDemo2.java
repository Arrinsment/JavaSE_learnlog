package Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;


public class FunctionDemo2 {
    public static void main(String[] args) {

        //# 引用静态方法:
        //**格式：** 类名::静态方法
        //**范例：** Integer::parseInt
        //## 练习：
        //集合中有以下数字，要求把他们都变成int类型
        //"1" "2" "3" "4" "5"

        //创建一个集合
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");


        //把Integer类型的转换为String类型的
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
            //第一个参数为流中的数据,第二个参数为要去转换的数据类型
        }).forEach(s-> System.out.println(s));

        //1. 方法需要已经存在
        //2. 方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //3. 方法的功能需要把形参的字符串转换成整数

        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));


    }
}

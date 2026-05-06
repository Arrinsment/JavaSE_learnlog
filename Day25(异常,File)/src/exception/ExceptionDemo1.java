package exception;

import java.text.ParseException;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {

        //1. 异常是什么？
        //- 程序中可能出现的问题
        //2. 异常体系的最上层父类是谁？异常分为几类？
        //- 父类：Exception。
        //- 异常分为两类：编译时异常、运行时异常
        //3. 编译时异常和运行时异常的区别？
        //- **编译时异常**：没有继承RuntimeException的异常，直接继承于Exception。
        //  编译阶段就会错误提示
        //- **运行时异常**：
        //  - RuntimeException本身和子类。
        //  - 编译阶段没有错误提示，运行时出现的




        //一.编译时异常(在编译阶段，必须要手动处理，否则代码报错)
        /*String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);*/


       //二.运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]); //ArrayIndexOutOfBoundsException



    }
}

package myapiBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {

        //这里我们主要写BigDecimal的一些常见方法
        BigDecimal b= BigDecimal.valueOf(0.9);
        BigDecimal b1= BigDecimal.valueOf(2.3);
        BigDecimal b2= BigDecimal.valueOf(10.0);
        BigDecimal b0= BigDecimal.valueOf(2.0);


        //一,加法:add
        BigDecimal b3=b1.add(b);
        System.out.println(b3);//3.2


        //二.减法:subtract
        BigDecimal b4=b1.subtract(b3);
        System.out.println(b4);

        //三.乘法:multiply
        BigDecimal b5=b1.multiply(b4);
        System.out.println(b5);

        //四.除法:divide
        //假如可以直接除尽比如值是10.0/2.0,那么直接调用,如果除不尽比如10.0/3.0 会报错
        BigDecimal b6=b2.divide(b0);
        System.out.println(b6);

        //五.除法我们这里就要使用divide的舍入模式了
        //scale:保留几位小数, Roundingmode:舍入模式
        //后面的是参数模式:这里只用了解四舍五入即可 HALF_UP ,其他舍入方式遇到了去API帮助文档去查即可
        BigDecimal b7=b2.divide(b1,3, RoundingMode.HALF_UP);
        System.out.println(b7);


    }
}

package Day16.src.myapiBigDecimal;

import java.math.BigDecimal;


public class BigDecimalDemo1 {

    public static void main(String[] args) {



        //一.直接创建BigDecimal对象,然后传递字符串去调用(),这里是精确的
        //和BigInteger一样传入的应该是个" "
        BigDecimal b1=new BigDecimal("0.09");
        BigDecimal b2=new BigDecimal("0.08");
        System.out.println(b1);//0.09
        System.out.println(b2);//0.08



        //二.直接创建BigDecimal对象,然后传递double类型的去调用(),这里是不精确的,不建议去使用的
        BigDecimal b3=new BigDecimal(0.09);
        BigDecimal b4=new BigDecimal(0.08);
        System.out.println(b3);//0.0899999999999999966693309261245303787291049957275390625
        System.out.println(b4);//  0.08000000000000000166533453693773481063544750213623046875

        //三.通过静态方法获取对象,也是用的Valueof 和BigInteger也是相同的

        //细节
        //1.当传入的double数字不大时候用value,静态方法
        //2.当传入的double数字很大时候用直接传入字符串即可,用构造方法
        //3.和BigInteger范围不同 当在[0,10]的之间的整数 valueof是已经在java底层创建了对象,你直接调用即可,但是小数全部都是new出来大的
        //我们发现这个和传入字符串一样也是精确的
        BigDecimal b5= BigDecimal.valueOf(10);
        System.out.println(b5);//10
        BigDecimal b6= BigDecimal.valueOf(1);
        System.out.println(b6);//1
        BigDecimal b7= BigDecimal.valueOf(1.35);
        System.out.println(b7);//1.35

        //





    }
}

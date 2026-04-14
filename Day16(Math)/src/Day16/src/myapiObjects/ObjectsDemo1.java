package Day16.src.myapiObjects;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {

        student s1=new student();
        student s2=new student(18,"张三");
        s1 = null;

        //一.Objects
        //Objects,是java中的一个工具类

        //我已经重写equals的比较方法了,变为属性比较了,假如现在s1是个null,我直接比较会报错(空指针异常).要先进行一个非空判断
        if(s1!=null) {

            boolean flag = s1.equals(s2);
            System.out.println(flag);
        }
        else{
            System.out.println("空指针异常");
        }


         //如果上面的每次我都自己写就太麻烦了
         //这个时候使用Objects的方法就刚刚好,
         //1. equals,先做非空判断,比较2个对象
         // a.equals(null) 通常返回 false” 是指在遵循Java规范的标准实现中

        boolean flag = Objects.equals(s1,s2);
        //这里的 a.equals(null) 通常返回 false” 是指在 遵循 Java 规范的标准实现中
        //然后具体细节如下: 先判断s1==s2,如果相等直接返回true,若不相等,先判断s1是不是空,如果是空直接返回false,如果不是空,
        // 再看s2与s1的比较结果,相同返回true,不相同返回false
        // return (a == b) || (a != null && a.equals(b));


        System.out.println(flag);//false



        //2.isNull,先做非空判断,是null,返回true,反之
        boolean flag1=Objects.isNull(s1);
        System.out.println(flag1);//true
        boolean flag2=Objects.isNull(s2);
        System.out.println(flag2);//false


        //2.noNull,先做非空判断,是null,返回false,反之
        boolean flag3=Objects.nonNull(s1);
        System.out.println(flag3);//false
        boolean flag4=Objects.nonNull(s2);
        System.out.println(flag4);//true

    }
}

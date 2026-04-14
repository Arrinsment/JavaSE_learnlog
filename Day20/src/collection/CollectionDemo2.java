package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<student>s=new ArrayList<>();

        student S1=new student(23,"zhangsan");
        student S2=new student(24,"wangwu");
        student S3=new student(25,"yanger");
        s.add(S1);
        s.add(S2);
        s.add(S3);

        student S4=new student(23,"zhangsan");
        //这里我们contains去判断是否包含s4
        System.out.println(s.contains(S4));//false

        //这里默认是false的原因是,contains的底层是用equals去写的,然后是用父类Object的这个类的比较
        //如果你不直接用对equals 进行方法重写默认比较的是地址值(引用数据类型),而不是属性值

        //现在equals方法重写后结果就是true了

        //那为什么字符串不用这样去对equals方法重写,是因为 java已经在底层为我们写好了

    }
}

package myapiObject;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //这里我们主要讲讲 Object里面的equals方法
        student s1=new student("zhangsan",18);
        student s2=new student("zhangsan",18);

         //equals 方法重写前:
         //System.out.println(s1.equals(s2));//比较的是地址值,结果为false

        //如果我们直接比较,比较的是他们的地址值
        //但问题是比较地址值是没有用的,我们应该比较他们的内部的属性值
        //这个时候我们直接在student类中进行方法重写即可,然后这个方法重写不需要你自己去写的,直接按Alt+ins即可了去找就可以了

         //equals 方法重写后:
        System.out.println(s1.equals(s2));//比较的是s1,与s2的内部属性值,结果为true

        //这里有一道大厂面试题目
        String s=new String("abc");//或者直接写出String="abc";
        StringBuilder sb=new StringBuilder("abc");

        //下面的结果是 true or false?

        System.out.println(s.equals(sb));
        //首先面对这题,如果是s去调用的话,会先看里面的内容是不是字符串(比如这里的sb),不是直接false,如果是,然后直接比较字符串内容本身是不是相等的,
        // 如果是相等的返回true,如果不是返回false,//false

        //因为这里的s,是字符串而里面的sb不是字符串,所以直接返回false即可

        //我说的,如果是假如的话,如果这里的sb是字符串,那直接比较字符串本身的内容即可
        System.out.println(sb.equals(s));

        //这里是sb去调用的equals,由于并没有单独的为StringBuilder 去创建一个equals这个方法,所以我们比较的是他的父类Object里面的类
        //比较的就是对象的地址值,sb和s的地址值是不相同的所以答案是false,//false


    }
}

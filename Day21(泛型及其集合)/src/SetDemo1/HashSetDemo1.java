package SetDemo1;

public class HashSetDemo1 {

    public static void main(String[] args) {

       /*   哈希值：
          对象的整数表现形式
         1. 如果没有重写hashCode方法，不同计算出的哈希值是不同的
         2. 如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
         3. 但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）*/

        //先创建一个标准的Student类

        //1.创建对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);
        System.out.println(s1);//如果你不进行toString方法重写,(println调用)打印的是类名@哈希码的十六进制SetDemo1.Student@a8e9e1e4”,
        // 进行了重写打印的可以是内容(按照你重写的方式)

        // 1. 如果没有重写hashCode方法，不同计算出的哈希值是不同的,这里是直接调用 hashCode()
       System.out.println(s1.hashCode());//990368553
        System.out.println(s2.hashCode());//1096979270
        System.out.println("-----------------------------------------------------------------------------");

        //2. 如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        //这里不用我们自己手动去写,在student类中,直接Alt+ins 然后去重新点击 equals and Hashcode,然后就被重写了
        System.out.println(s1.hashCode());//-1461067292
        System.out.println(s2.hashCode());//-1461067292

        System.out.println("-----------------------------------------------------------------------------");
        //3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
        //只要是字符串,java内部已经对equal和hashcode重写过了
        //然后如果没有重写过Object 的quals方法默认比较的是地址值
        System.out.println("abc".hashCode());
        System.out.println("acd".hashCode());


    }
}

package SetDemo1;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        /* 需求：创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现控制台遍历该集合。
        要求：学生对象的成员变量值相同，我们就认为是同一个对象*/

        //这里我们使用Hashset去重,注意如果是你自己创建的引用数据类型,要对Hashcode 进行重写 不然比较的就是地址值,而不是Hash值
        //如果是int或者是Integer类型,Java底层已经对他们进行了去重

        //1.创建student类型的对象
        Student s1=new Student("ZHAN",18);
        Student s2=new Student("LIHUA",19);
        Student s3=new Student("LIHUA",19);

        //如果Hash值不同,那么就是按照数组,链表,红黑树的方式去存入,如果相同,就直接不存入然后达到去重的效果

        //2.创建一个Hash对象
        HashSet<Student>hs=new HashSet<>();
        System.out.println(hs.add(s1));//true
        System.out.println(hs.add(s2));//true
        System.out.println(hs.add(s3));//false

       //3.打印一下HashSet值
        //这个是不能保证存储顺序,存和取得顺序不一样
        System.out.println(hs);//[Student{name='LIHUA', age=19}, Student{name='ZHAN', age=18}]

        //HashSet小结:
        /*1. HashSet集合的底层数据结构是什么样的？
        底层是哈希表（数组 + 链表/红黑树，JDK8+）。

        2. HashSet添加元素的过程？
        计算哈希值 → 计算索引位置 → 若该位置无元素则直接存放；若有元素则比较哈希值和equals，相同则不存，不同则挂载到链表/红黑树后面。

        3. HashSet为什么存和取的顺序不一样？
        元素存储位置由哈希值决定，不按插入顺序排列。

        4. HashSet为什么没有索引？
        底层是哈希表结构，元素位置由哈希算法计算得出，不是连续整数索引。
       (哈希表 = 一个特殊的数组，它的"下标"是通过哈希算法的哈希值计算出来的)

        5. HashSet是利用什么机制保证去重的？
        利用 hashCode() 和 equals() 方法。先比较哈希值，再比较内容，都相同则视为重复元素。*/


    }
}

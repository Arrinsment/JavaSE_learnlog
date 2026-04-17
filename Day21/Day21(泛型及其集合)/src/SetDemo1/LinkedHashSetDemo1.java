package SetDemo1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {

        //这个是继承于HashSet的,但他是双链表的,所以可以保证,存与取得顺序相同

        //1.创建student类型的对象
        Student s1=new Student("ZHAN",18);
        Student s2=new Student("LIHUA",19);
        Student s3=new Student("LIHUA",19);
        Student s4=new Student("jiangwan",17);


        //创建一个LinkedHashset
        LinkedHashSet<Student>lh=new LinkedHashSet<>();
        System.out.println(lh.add(s1));
        System.out.println(lh.add(s2));
        System.out.println(lh.add(s3));
        System.out.println(lh.add(s4));
        System.out.println("---------------------------------");
        System.out.println(lh);//[Student{name='ZHAN', age=18}, Student{name='LIHUA', age=19}, Student{name='jiangwan', age=17}]

         /* linkedHashSet小结:

        1. LinkedInHashSet集合的特点和原理是怎么样的？
        - 有序、不重复、无索引
                - 底层基于哈希表，使用双链表记录添加顺序
        2. 在以后如果要数据去重，我们使用哪个？
        默认使用HashSet
        如果要求去重且存取有序，才使用LinkedHashSet*/

    }
}

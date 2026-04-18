package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo2 {
    public static void main(String[] args) {


        /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生
       */


        //这里有个小点:如果键的值是自定义对象,那么键的Hashcode和equals方法我们要去重写,如果是String 类型的Java底层已经给我们写好了
        //因为我们要求 姓名和年龄相同就是同一个对象,所以对应键的的hashcode值应该相同,如果你不去重写,就一定是不相同的
        //这里有个关键的点,就是如果对象是自定义对象,那么我们就要要求去重写

        // 一.先去创建一个Student对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);


        //这里我们创建一个和王五一样的,但我们把他进行添加籍贯不一样
       // Student s4=new Student("wangwu",25);




        //二.创建一个HashMap对象
        HashMap<Student,String>hm=new HashMap<>();


        //三.添加Student元素和籍贯
        hm.put(s1,"北京");
        hm.put(s2,"上海");
        hm.put(s3,"广州");
       // hm.put(s4,"美国"); 添加了的化,以后籍贯就是美国了

        //开始去遍历

        //一.利用 键找值 的方式去遍历,和myMap的遍历方式中的三种遍历方式是一样的
        Set<Student> s = hm.keySet();
        for (Student k : s) {
             String value=hm.get(k);
            System.out.println(k+"="+value);
        }
      /*  Student{name = wangwu, age = 25}=广州
        Student{name = lisi, age = 24}=上海
        Student{name = zhangsan, age = 23}=北京*/

        System.out.println("------------------------------------------------------------");
        //二.利用键值对的方式去遍历
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


        System.out.println("------------------------------------------------------------");


        //三.利用lamda表达式去遍历,就是利用foreach
        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student key, String s) {
                System.out.println(key+"="+s);
            }
        });



        System.out.println("------------------------------------------------------------");





    }
}

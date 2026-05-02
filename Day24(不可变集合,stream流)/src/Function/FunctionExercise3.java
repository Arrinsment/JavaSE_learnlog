package Function;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionExercise3 {
    public static void main(String[] args) {


        //* 需求：
        //*    创建集合添加学生对象
        //*    学生对象属性：name，age
        //* 要求：
        //*    把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
        //*    使用方法引用完成


        Student s1=new Student("张三",23);
        Student s2=new Student("李四",24);

        ArrayList<Student>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
      /*  list.stream().map(new Function<Student, String>() {


            @Override
            public String apply(Student s) {
               return s.getName()+"-"+s.getAge();
            }
        }).toArray(String[]::new);*/

        String[] s= list.stream().map(FunctionExercise3::apply).toArray(String[]::new);

        System.out.println(Arrays.toString(s));//[张三-23, 李四-24]

        String[] s3 = list.stream().map(Student::TOYIQI).toArray(String[]::new);

        System.out.println(Arrays.toString(s3));//[张三-23, 李四-24]


    }


    public static String apply(Student s) {
        return s.getName()+"-"+s.getAge();
    }
}

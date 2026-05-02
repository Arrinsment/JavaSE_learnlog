package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionExercise1 {
    public static void main(String[] args) {

        /*
       需求：
       集合中存储一些字符串的数据，比如：张三,23。
       收集到Student类型的数组当中
       */

        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,25");


       /* list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new  Student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList());
*/

        Student[] s= list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(s));//[Student{name = 张三, age = 23}, Student{name = 李四, age = 24}, Student{name = 王五, age = 25}]


    }
}

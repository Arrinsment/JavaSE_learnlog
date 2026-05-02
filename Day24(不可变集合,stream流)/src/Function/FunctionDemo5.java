package Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo5 {
    public static void main(String[] args) {

        /*
         方法引用（引用构造方法）
         格式
         类名::new

         目的：
         创建这个类的对象

         需求：
         集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中

         方法引用的规则：
         1. 需要有函数式接口
         2. 被引用的方法必须已经存在
         3. 被引用的形参和返回值，需要跟抽象方法的形参返回值保持一致
         4. 被引用方法的功能需要满足当前的需求

        */

        //1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2. 添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37");

      /* List<Student> co = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList());
        System.out.println(co);*///[Student{name = 张无忌, age = 15}, Student{name = 周芷若, age = 14}, Student{name = 赵敏, age = 13}, Student{name = 张强, age = 20}, Student{name = 张三丰, age = 100}, Student{name = 张翠山, age = 40}, Student{name = 张良, age = 35}, Student{name = 王二麻子, age = 37}]

        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list1);//[Student{name = 张无忌, age = 15}, Student{name = 周芷若, age = 14}, Student{name = 赵敏, age = 13}, Student{name = 张强, age = 20}, Student{name = 张三丰, age = 100}, Student{name = 张翠山, age = 40}, Student{name = 张良, age = 35}, Student{name = 王二麻子, age = 37}]


    }
}

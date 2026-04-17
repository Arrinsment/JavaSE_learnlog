package SetDemo1;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

          ///* 需求：创建5个学生对象
        //属性：(姓名,年龄,语文成绩,数学成绩,英语成绩),
        //按照总分从低到高输出到控制台
        //如果总分一样，按照语文成绩排
        //如果语文一样，按照数学成绩排
        //如果数学成绩一样，按照英语成绩排
        //如果英文成绩一样，按照年龄排
        //如果年龄一样，按照姓名的字母顺序排
        //如果都一样，认为是同一个学生，不存。

        //为了去方便去写这条题目,我们选择去新建一个student2 类,然后规则我们自己去定

        //一.创建一个学生对象
      Student2 S1=new Student2("ZHANG",23,99,99,100);
      Student2 S2=new Student2("HK",22,98,98,99);
      Student2 S3=new Student2("LIm",25,97,97,98);
      Student2 S4=new Student2("CH",22,96,96,97);
      Student2 S5=new Student2("GK",20,95,95,96);

        TreeSet<Student2>ts=new TreeSet<>();

        //把学生对象添加进去集合中去
        ts.add(S1);
        ts.add(S2);
        ts.add(S3);
        ts.add(S4);
        ts.add(S5);

        //直接把集合进行打印即可
        System.out.println(ts);//[student2{name = GK, age = 20, chinese = 95, math = 95, english = 96}, student2{name = CH, age = 22, chinese = 96, math = 96, english = 97}, student2{name = LIm, age = 25, chinese = 97, math = 97, english = 98}, student2{name = HK, age = 22, chinese = 98, math = 98, english = 99}, student2{name = ZHANG, age = 23, chinese = 99, math = 99, english = 100}]


        //练习:要求在遍历集合的时候,可以看见总分1. TreeSet集合的特点是怎么样的？

        for(Student2 t:ts){
            System.out.println(t+"总分:"+(t.getChinese()+t.getAge()+t.getEnglish()));
        }

        /*student2{name = GK, age = 20, chinese = 95, math = 95, english = 96}总分:211
        student2{name = CH, age = 22, chinese = 96, math = 96, english = 97}总分:215
        student2{name = LIm, age = 25, chinese = 97, math = 97, english = 98}总分:220
        student2{name = Hy, age = 22, chinese = 98, math = 98, english = 99}总分:219
        student2{name = ZHANG, age = 23, chinese = 99, math = 99, english = 100}总分:222*/

    }
}

          //小结:
          //- 可排序、不重复、无索引
          //- 底层基于红黑树实现排序，增删改查性能较好
          //2. TreeSet集合自定义排序规则有几种方式
          //- 方式一：Javabean类实现Comparable接口，指定比较规则
          //- 方式二：创建集合时，自定义Comparator比较器对象，指定比较规则
          //3. 方法返回值的特点
          //- 负数：表示当前要添加的元素是小的，存左边
          //- 正数：表示当前要添加的元素是大的，存右边
          //- 0：表示当前要添加的元素已经存在，舍弃

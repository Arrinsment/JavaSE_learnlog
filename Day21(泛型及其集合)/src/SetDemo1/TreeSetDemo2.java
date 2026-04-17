package SetDemo1;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {


       /* 根据你提供的图片，提取的文字内容如下：
                TreeSet 的两种比较方式
        方式一：
        默认排序/自然排序：JavaBean类实现Comparable接口指定比较规则
        方式二：
        比较器排序：创建TreeSet对象时候，传递比较器Comparator指定规则
        使用原则：默认使用第一种，如果第一种不能满足当前需求，就使用第二种
              */



          //这个TreeSet 底层是红黑树

        //下面对方式一:进行一个代码演示:
          /*
          需求：创建TreeSet集合，并添加3个学生对象
          学生对像属性：
          姓名、年龄。
          要求按照学生的年龄进行排序
          同年龄按照姓名字母排列（暂不考虑中文）
          同姓名，同年龄认为是同一个人
          */

        //Student要去实习comparable接口,然后里面的comparaTO方法我们要去重写,这样才可以按照年龄进行排序
        //这里你可以取student中自己去看

        Student  s1=new Student("zhangsan",23);
        Student  s2=new Student("LiHua",20);
        Student  s3=new Student("liujia",22);

        //创建一个TreeSet集合

        TreeSet<Student>ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);//[Student{name='LiHua', age=20}, Student{name='liujia', age=22}, Student{name='zhangsan', age=23}]


    }
}

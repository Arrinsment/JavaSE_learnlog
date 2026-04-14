package a03staticdemo1;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {

          //定义一个集合获取三个学生中 年龄最大值

        student s1=new student("shiyun",18,"女");
        student s2=new student("yangyao",20,"男");
        student s3=new student("wanwan",21,"女");

         //这里我们创建一个集合,然后存入数据
        ArrayList<student> list=new ArrayList<>();

         //把创建的学生对象放入里面去
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //这里我们写一个studentUtil工具类然后 开始获取年龄最大值
             int maxAge= studentUtil.studentutil(list);
        System.out.println(maxAge);

    }

}

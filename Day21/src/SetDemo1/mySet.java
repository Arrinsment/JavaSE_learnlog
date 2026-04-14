package SetDemo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mySet {
    public static void main(String[] args) {


        //set集合的特点:
        //无序,不重复,无索引
        //set集合的方法基本上与collection的Api方法一致


        //利用set方式的集合添加字符串,并使用多种遍历方式
          //迭代器
          //增强for
          //lambda表达式

        //1.创建一个set集合对象
        Set<String> s=new HashSet<>();

        //添加元素
        //这里添加元素,要求添加是不重复的
        //所以这里的返回值Boolean 就是有意义的了,因为你要去判断添加的元素是不是重复的
        Boolean S =s.add("zhangsan");
        Boolean S2 =s.add("zhangsan");
       // System.out.println(s);//[zhangsan]
       // System.out.println(S);//true
       // System.out.println(S2);//false


        //然后这里无论你添加还是存入都是无序的
        boolean s3 = s.add("lishi");
        boolean S4 = s.add("wangwu");

        System.out.println(s);//[lishi, zhangsan, wangwu],这里完全是无序的

        //然后我们开始对这个进行遍历


        //1.利用迭代器 itetator
        Iterator<String> iterator = s.iterator();
        while(iterator.hasNext()){
                                               //lishi
                                               ////zhangsan
            String S3= iterator.next();        // //wangwu
            System.out.println(S3);
        }

        System.out.println("-----------------------");
        //2.利用增强for
        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println("-----------------------");
        //3.利用lambda表达式
        s.forEach( Str1-> System.out.println(Str1));//lishi
                                                    //zhangsan
                                                    //wangwu





    }
}

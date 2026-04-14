package Exercise;

import java.util.Arrays;
import java.util.Comparator;

public class exercise1 {
    public static void main(String[] args) {

        /* 定义数组并存储一些女朋友对象，利用 Arrays 中的 sort 方法进行排序。
        要求1：属性有姓名、年龄、身高。
        要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
       （姓名中不要有中文或特殊字符，会涉及到后面的知识）
      */


        //在程序中进行字符串 可以用compareTo这个方法去比较,它是按照 ASCLL码的值的方式去比较的,比如a:97,b:98,然后返回值,直接就是一个-1即可(就是他们的差值)
        // String s="a";
        // String d="b";
        //int i =s.compareTo(d);//i=-1


        //然后关于你在用引用数据类型进行排序的时候 还是有几个小点要去注意的
        /*compare(o1, o2) 方法需要返回一个整数：
        返回值	return 含义
        负数（如 -1）o1 < o2，o1 应该排在 o2 前面
        正数（如 1）	o1 > o2，o1 应该排在 o2 后面
        0	两个对象相等，顺序不变*/

        Girl g1=new Girl("baishiyun",18,1.70);
        Girl g2=new Girl("nangongyaoyin",19,1.67);
        Girl g3=new Girl("jiangwanwan",20,1.65);

        Girl[] arr={g1,g2,g3};

        //下面我们利用Arrays 数组进行排序


        Arrays.sort(arr, new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {

                // 要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
                //然后关于你在用引用数据类型进行排序的时候 还是有几个小点要去注意的
                // compare(o1, o2) 方法需要返回一个整数：

                double temp = o1.getAge()-o2.getAge();
                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;

                 //返回值	return 含义
                 //负数（如 -1）o1 < o2，o1 应该排在 o2 前面
                // 正数（如 1）	o1 > o2，o1 应该排在 o2 后面
                // 0            两个对象相等，顺序不变*/

                     if(temp<0){return -1;}
                     else if(temp>0){return 1;}
                     else {return 0;}
            }
        });

        //这里我们开始进行lambda的简写
        Arrays.sort(arr, ( o1,  o2)->{

                double temp = o1.getAge()-o2.getAge();
                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp<0){return -1;}
                else if(temp>0){return 1;}
                else {return 0;}

        });

        System.out.println(Arrays.toString(arr));

    }
}

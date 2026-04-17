package SetDemo1;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {



       /* 方式二：
        比较器排序：创建TreeSet对象时候，传递比较器Comparator指定规则
        使用原则：默认使用第一种，如果第一种不能满足当前需求，就使用第二种*/

        /*需求：请自行选择比较器排序和自然排序两种方式；
        要求：存入四个字符串，“c”，“ab”，“df”，“qwer”按照长度排序，如果一样长则按照首字母排序*/

        //根据这个需求,我们对方式二进行一个代码演示;



        //先创建一个 TreeSet集合
       /* TreeSet<String>ts=new TreeSet<>();
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");*/

        //直接打印
        //System.out.println(ts); //[ab, c, df, qwer]
        //这里如果我们打印的话,他是按照首字母进行排序的,如果首首母一样,他在按照第二个字母进行排序;


        //但这和需求不太一样,需求:存入四个字符串，“c”，“ab”，“df”，“qwer”按照长度排序，如果一样长则按照首字母排序

        //---->所以这个时候我们要去用比较器:Comparator


        //一.创建对象
      /*  TreeSet<String>ts=new TreeSet<>(new Comparator<String>() {
            //o1:表示当前要存入的元素
            //o2:表示已经在红黑树中存在的元素
            //返回值的规则和在Student的规则中是一样的
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();

                //我们这里先判断他是不是等于0如果是等于0,那么就代表是长度想等的,我们就去调用comparaTo方法即可
                //comparaTo在student方法中有
                //现在会过头来看,这个o1和o2都是String 类型的,我的意思是这个comparaTo是java底层都已经写好了的
                //然后这个String 规则是先按照首字母的AScll码值进行比较,相同我们则比较第二个

                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        });*/


        //lamda表达式简化版:
        //可以把他改为lamda表达式,注意如果是lamda表达式:接口必须是函数式接口(@FunctionalInterface),可以Ctrl+B我们去查看
        TreeSet<String>ts=new TreeSet<>(( o1, o2)->{
                int i=o1.length()-o2.length();

                //我们这里先判断他是不是等于0如果是等于0,那么就代表是长度想等的,我们就去调用comparaTo方法即可
                //comparaTo在student方法中有
                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        );


        //二.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);//[c, ab, df, qwer]

    }
}

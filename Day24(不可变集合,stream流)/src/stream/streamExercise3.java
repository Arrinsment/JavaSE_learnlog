package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamExercise3 {
    public static void main(String[] args) {

        /*# 数据操作

        现在有两个ArrayList集合，
        第一个集合中：存储6名男演员的名字和年龄。第二个集合中：存储6名女演员的名字和年龄。
        姓名和年龄中间用逗号隔开。比如：张三,23

        要求完成如下的操作：

        1. 男演员只要名字为3个字的前两人
        2. 女演员只要姓杨的，并且不要第一个
        3. 把过滤后的男演员姓名和女演员姓名合并到一起
        4. 将上一步的演员信息封装成Actor对象。
        5. 将所有的演员对象都保存到List集合中。

        **备注**：演员类Actor，属性有：name，age*/


        ArrayList<String>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Actor>ac=new ArrayList<>();

        Collections.addAll(list1,"张若昀,35", "李现,32", "王一博,27", "肖战,30", "杨洋,33", "胡一天,29");
        Collections.addAll(list2,"杨幂,30", "刘亦菲,34", "杨紫,28", "迪丽热巴,31", "杨颖,32", "周冬雨,29");


        List<String> list3 = list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(3).collect(Collectors.toList());
        List<String> list4 = list2.stream().skip(1).filter(s -> s.split(",")[0].charAt(0) == '杨').collect(Collectors.toList());

        //把list3和list4的流合并在一起
        List<String> list5 = Stream.concat(list3.stream(), list4.stream()).collect(Collectors.toList());


        for (int i = 0; i < list5.size(); i++) {
            String [] s=list5.get(i).split(",");
            Actor act = new Actor();
            act.setAge(Integer.parseInt(s[1]));
            act.setName(s[0]);
            ac.add(act);
        }
        for (int i = 0; i < ac.size(); i++) {
            System.out.println(ac.get(i).getAge()+" "+ac.get(i).getName());
        }

        System.out.println("--------------------------------------------------------------------------");
        //关键是对steam的常见方法用熟练

        //然后老师是直接利用map集合把String类型的转换为 Actor类型的
        /*Stream.concat(list3.stream(), list4.stream()).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {

                return new  Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        });*/


        //lamda表达式
        List<Actor> list = Stream.concat(list3.stream(), list4.stream()).map(s -> new Actor(s.split(",")[0],
                Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());

        System.out.println(list);

    }
}

package stream;

import java.util.ArrayList;

public class streamDemo1 {
    public static void main(String[] args) {

        //这里我们简单讲下stream流
        //创建集合添加元素，完成以下需求：
        //1. 把所有以“张”开头的元素存储到新集合中
        //2. 把“张”开头的，长度为3的元素再存储到新集合中
        //3. 遍历打印最终结果


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");


        //常规写法:
        ArrayList<String>list2=new ArrayList<>();

        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }

       ArrayList<String>list3=new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        System.out.println(list3);//[张无忌, 张三丰]


        //但我们发现前面的太麻烦了
        //这里直接使用stream流会简单许多
        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

    }
}

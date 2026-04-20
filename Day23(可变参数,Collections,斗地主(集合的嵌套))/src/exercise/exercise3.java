package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class exercise3 {

    public static void main(String[] args) {


    /* 班级里有10个学生
      要求：
      被点到的学生不会再被点到。
      但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。 */

       //先实现一个Arraylist
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰","杜琦燕", "袁明媛");
        Collections.shuffle(list);
       //System.out.println(list.get(0));

        ArrayList<String>list2=new ArrayList<>();
       int length=list.size();

       //读取一个元素,然后我们就去从集合中去删除一个元素

        for (int i = 0; i < 2; i++) {
            for (int q = 0; q < length; q++) {
                //这里Shift+F6 可以一键把相同的全部改了
                String name= list.remove(0);
                System.out.println(name);
                //把从list1删去的元素添加到另外一个集合list2里面
                list2.add(name);
            }
            list.addAll(list2);
            list2.clear();
            System.out.println("----------------------------------------");

        }


    }

}

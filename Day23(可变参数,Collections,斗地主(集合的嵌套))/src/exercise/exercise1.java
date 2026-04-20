package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exercise1 {
    public static void main(String[] args) {


        //随机点名器一:
        /* 班级里有N个学生，学生属性:姓名、年龄、性别。
        实现随机点名器。 */

        //方法一:创建一个集合,然后往集合中去存入名字,然后通过索引去获取名字
        System.out.println("--------------------------------------法一------------------------------------");
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"路飞","鸣人","孙悟空","埼玉","艾伦·耶格尔","炭治郎","柯南","利威尔","五条悟","绫波丽");
        Random r=new Random();
        int r1=r.nextInt(list.size());
        System.out.println(list.get(r1));


        System.out.println("--------------------------------------法二--------------------------------------");
        //法二:不用Random,直接把用Collections方法里面的shuffle:洗牌,方法,把集合中的元素全部随机打乱,然后去获取,一个固定的元素即可
        Collections.shuffle(list);
        System.out.println(list.get(0));






    }
}

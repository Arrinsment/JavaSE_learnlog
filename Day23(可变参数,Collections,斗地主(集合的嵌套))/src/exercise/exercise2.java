package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exercise2 {
    public static void main(String[] args) {

        /* 班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生
        "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰",
                "杜琦燕", "袁明媛", "李猜", "田蜜蜜",
        */

        //这里比较难的就是70%和30%,这里直接用7个0和3个1去代替,1代表男生,0代表女生
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Random r=new Random();
        int num=r.nextInt(list.size());
        System.out.println(list.get(num));
        ArrayList<String>boylist=new ArrayList<>();
        ArrayList<String>girllist=new ArrayList<>();
        Collections.addAll(boylist, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girllist,"杜琦燕", "袁明媛", "李猜", "田蜜蜜");


        if(1==list.get(num)){
            Collections.shuffle(boylist);
            System.out.println(boylist.get(0));

        }
        else{
            Collections.shuffle(girllist);
            System.out.println(girllist.get(0));

        }

    }
}

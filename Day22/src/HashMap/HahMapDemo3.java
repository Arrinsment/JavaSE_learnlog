package HashMap;

import java.util.*;

public class HahMapDemo3 {
    public static void main(String[] args){

        /*
        某个班级80名学生，现在需要组成秋游活动，
        班长提供了四个景点依次是（A、B、C、D），
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */

        //这里最好不要去用计数器,因为假如你并不知道景点的数量是多少,你也不知道有多少个计数器

        //一.先去模拟学生选了什景点
        String []arr={"A","B","C","D"};
        ArrayList<String>list=new ArrayList<>();

        Random sc=new Random();
        for(int i=0;i<80;i++){
           int a =sc.nextInt(arr.length);
            list.add(arr[a]);
        }

        //创建一个HashMap集合
        HashMap<String,Integer>hm=new HashMap<>();

        //先去遍历list,获取他每个key值
        for (String s : list) {
            if(hm.containsKey(s)) {
                //这里有个get方法返回的就是对应键的值
                int count = hm.get(s) + 1;
                hm.put(s, count);
            }
           else{
              hm.put(s,1);
                }
            }


        //然后我们去遍历,
        System.out.println(hm);//不固定,{A=18, B=24, C=19, D=19}

        //请统计出最终哪个景点想去的人数最多:
        //我先去利用键值对去获取最大的值,然后在去获取值对应的键,这个过程要分开

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        int max=0;
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : entries) {
            if(max==entry.getValue()){
                System.out.println(entry.getKey());
            }
        }


    }
}

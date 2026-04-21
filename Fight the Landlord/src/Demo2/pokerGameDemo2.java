package Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pokerGameDemo2 {


    //这里先进行控制台版的斗地主的书写
    //完成控制台版的三步：
    //准备牌
    //洗牌
    //发牌
    //
    //"♠", "♣", "♥", "♦"
    //"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
    //*/



    //排序方法1:按序号进行排序
    //把序号当作他们的键,把键对应着一个值
    static  HashMap<Integer,String>hm=new HashMap<>();
    static ArrayList<Integer>list=new ArrayList<>();
    static  int num=1;
    static{
    String []s1={"♠", "♣", "♥", "♦"};
    String []s2={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


    //存入牌
        for (String sH : s2) {
            for (String sN : s1) {
                hm.put(num,sH+sN);
                list.add(num);
                num++;
            }
        }
        hm.put(num,"小王");
        list.add(num);
        num++;
        hm.put(num,"大王");
        list.add(num);

    }
    pokerGameDemo2(){

       //洗牌
        Collections.shuffle(list);
        System.out.println(list);

       //这里我们去使用TreeSet 因为可以去自动排序
       //发牌

        TreeSet<Integer>dipai=new TreeSet<>();
        TreeSet<Integer>player1=new TreeSet<>();
        TreeSet<Integer>player2=new TreeSet<>();
        TreeSet<Integer>player3=new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int a=list.get(i);
            if(i<3){
                dipai.add(a);
            }
            else if(i%3==0){
                player1.add(a);
            }
            else  if(i%3==1){
                player2.add(a);
            }
            else if(i%3==2){
                player3.add(i);
            }

        }

        //开始去发牌
        lookpoker(dipai,"dopai");
        lookpoker(player1,"钢脑壳");
        lookpoker(player2,"大帅逼");
        lookpoker(dipai,"蛋筒");
    }
    public  void lookpoker(TreeSet<Integer>list,String name){
        System.out.print(name+"=");
        for (Integer i : list) {
            System.out.print(hm.get(i));
        }
        System.out.println();


    }
}

package Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class pokerGameDemo3 {

    //这里先进行控制台版的斗地主的书写
    //完成控制台版的三步：
    //准备牌
    //洗牌
    //发牌
    //
    //"♠", "♣", "♥", "♦"
    //"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
    //*/
    //静态才可以去访问静态,然后牌盒ArrayList同时也可以被其他对象去使用
    static ArrayList<String> list=new ArrayList<>();
    static HashMap<String,Integer>hm=new HashMap<>();
    //创建一个Map集合,然后按照价值去进行排序,就是我们自己给不同的牌去赋予价值

    static {
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);
    }


    static {

        String []s1={"♠", "♣", "♥", "♦"};
        String []s2={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String sH : s1) {
            for (String sP : s2) {
                list.add(sH+""+sP);
            }
        }
        list.add(" 大王");
        list.add(" 小王");
    }

    public   pokerGameDemo3(){

        ArrayList<String>dipai=new ArrayList<>();
        ArrayList<String>player1=new ArrayList<>();
        ArrayList<String>player2=new ArrayList<>();
        ArrayList<String>player3=new ArrayList<>();

        //洗牌:利用Collections中的shuffle方法去把牌都打乱
        Collections.shuffle(list);

        //发牌:先发三张底牌,然后三人,每人依次发一张底牌即可
        for (int i = 0; i <list.size(); i++) {
            if(i<3){
                dipai.add(list.get(i));
                continue;//底牌要先去存起来,然后不能发给玩家,要用continue
            }

            //通过对三进行取模,从而判断给谁,==1,给player1,|==2,给player2|==3,给player3;
            else if(i%3==1){
                player1.add(list.get(i));
            }
            else if(i%3==2){
                player2.add(list.get(i));
            }
            else if(i%3==0){
                player3.add(list.get(i));
            }

        }


         //排序:
          order(dipai);
          order(player1);
          order(player2);
          order(player3);

        //发牌
        lookPoker("底牌",dipai);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);

    }


    public void order(ArrayList<String>list) { //♥J,

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String s1=o1.substring(0,1);
                String s2=o2.substring(0,1);

                   int num1 = getval(o1);
                   int num2 = getval(o2);

                return (num1-num2==0)?s1.compareTo(s2):num1-num2;

            }
        });
    }


    public int getval(String o1){
        String s=o1.substring(1);//♥J,
        if(hm.containsKey(s)){
            return hm.get(s);
        }
        else{
         return  Integer.parseInt(s);
        }

    }

    public void lookPoker(String name,ArrayList<String>list) {
        System.out.print(name + ":");
        System.out.println(list);

    }
}

package Demo1;

import java.util.ArrayList;
import java.util.Collections;

public  class pokerGame {


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
    static  ArrayList<String>list=new ArrayList<>();

    static {

        String []s1={"♠", "♣", "♥", "♦"};
        String []s2={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String sH : s1) {
            for (String sP : s2) {
                list.add(sH+""+sP);
            }
        }
        list.add("大王");
        list.add("小王");
    }

    public   pokerGame(){

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
        //发牌
        lookPoker("底牌",dipai);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);

    }
    public void lookPoker(String name,ArrayList<String>list){
        System.out.print(name+":");
        System.out.println(list);

    }

}
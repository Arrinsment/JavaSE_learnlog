package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class
Exercise {
    public static void main(String[] args) {

        //键盘录入一些1-200的数把他们加入集合中,直到和累计在200为止

        //这我们先创建一个集合
        Scanner sc=new Scanner(System.in);

        //创建一个集合
        ArrayList<Integer>list=new ArrayList<>();

        while (true){
            String s = sc.nextLine();
            int a=Integer.parseInt(s);
            if(a<1||a>200){
                System.out.println("你输入的数据错误,请重新输入");
                continue;
            }
            list.add(a);
          int b= getSum(list);
          if(b==1){
              System.out.println("已经加到了200");
              break;
          }else{
              System.out.println("还要重新输入");
          }

        }

    }

    private static int getSum(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int sum=0;
            sum+=list.get(i);
            if(sum>=200){

                return 1;
            }
        }
       return -1;

    }
}

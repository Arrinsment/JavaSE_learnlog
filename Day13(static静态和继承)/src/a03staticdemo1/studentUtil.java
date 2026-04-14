package a03staticdemo1;

import java.util.ArrayList;

public class studentUtil {

     //记得私有化
     private  studentUtil(){}

    public static int studentutil(ArrayList<student> list){ //现在来看其实 这是一种静态方法
           int max=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
                   int tempage =list.get(i).getAge();
              if( tempage>max){
                  max=list.get(i).getAge();
              }
        }
        return max;
    }
}

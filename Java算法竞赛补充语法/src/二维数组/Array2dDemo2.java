package 二维数组;

import java.util.ArrayList;
import java.util.Collections;

public class Array2dDemo2 {
    public static void main(String[] args) {

      //二.动态的二维数组ArrayList<Arraylist<E>>list=new ArrayList<>();
      //特点:特点
        //动态增删行/列，每行列数可不同
        // 慢、占内存、代码长

       //创建一个动态二维集合
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();

     //一常见操作:添加行(row):
               //先创建一个行,然后去往里面去添加元素
                ArrayList<Integer>row=new ArrayList<>();
                Collections.addAll(row,1,2,3);
                list.add(row);

                ArrayList<Integer>row2=new ArrayList<>();
                Collections.addAll(row2,4,5,6);
                list.add(row2);


     //往具体的某行中去添加元素
        list.get(0).add(1);//在第一行的末尾去添加元素


     //二.常见操作:访问/修改:
        //1.访问
        list.get(0).get(0);
        //2.修改
        list.get(0).set(0,100);//把1行1列的元素修改为100


     //三.常见操作:删除
        //list.get(i).remove(j);//删除第i行,第j列的元素
        //list.remove(i) //删除第i行的元素
        
     //四.常见操作:获取行列的长度
           int rows= list.get(0).size();//获取第0行的长度
           int cols=list.size();//获取有几行的长度


     //五.常见操作去遍历
        for (int i = 0; i < list.size(); i++) {
            //先去获取行,然后去获取列,接下来在去遍历
            ArrayList<Integer> list1 = list.get(i);
            for (int i1 = 0; i1 < list1.size(); i1++) {
                System.out.println(list1.get(i1));
            }
        }

    }
}

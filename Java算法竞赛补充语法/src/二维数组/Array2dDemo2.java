package 二维数组;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2dDemo2 {
    public static void main(String[] args) {

      //二.动态的二维数组ArrayList<Arraylist<E>>list=new ArrayList<>();
      //特点:特点
        //动态增删行/列，每行列数可不同
        // 慢、占内存、代码长


     //一常见操作:添加行:
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();


     //添加行:因为你并不知道具体要有多少行,所以要去添加行
     //方式1:添加一个空行,待会往里面去加数据即可
        list.add(new ArrayList<>());
     //方式2:一个带元素的行,要往()要加Arrays.asList
       list.add(new ArrayList<>(Arrays.asList(1,2,3)));

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
      for(int i=0;i<list.size();i++){
          list.add(new ArrayList<>());
          for(int j=0;i<list.get(i).size();j++){
              System.out.print(list.get(i).get(j)+" ");
          }
          System.out.println();
      }




    }
}

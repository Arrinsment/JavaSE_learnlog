package love3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static Scanner sc = new Scanner(System.in);
     static  int n= sc.nextInt();
     static  int []arr=new int[10];
     static ArrayList<int []>list=new ArrayList<>();

    public static void main(String[] args) {

         if(n>30){
             System.out.println("0");
             return;
         }
         for (int i=1;i<=3;i++){
             arr[0]=i;
             dfs(i,1);
         }


         if(list.size()==0){
             System.out.println(0);
             return;
         }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).length; i1++) {
                System.out.print(list.get(i)[i1]+" ");
            }
            System.out.println();
            }

    }

      public  static void dfs(int sum,int start){

             if(start==10){
                 if(sum==n){

                   //数据存储出现错误  list.add(arr);
                   //为什么这里不能之间去存入arr?
                   //“为什么这里不能直接存入 arr？”
                     //因为你存的是 arr 的引用（地址）。
                     //后面递归会继续修改 arr 的内容，导致之前存的方案也被改掉。
                     //clone() 的作用是：把当前 arr 的内容复制一份新的，之后改 arr 不影响这份副本。
                     //你可以这样理解：
                     //list.add(arr) → 存的是“指向 arr 的指针”，后来 arr 变了，指针指向的内容也变了
                     //list.add(arr.clone()) → 存的是“拍了一张照片”，后来 arr 怎么变，照片不变
                     //这是 Java 引用类型的经典坑，你这次踩过就不会再忘了。

                     //说白了:如果你直接去存arr的话,以后arr改了,也会跟着去改,但你可以利用clone
                     //把他拷贝一份放入list中去,以后你arr怎么去改都不会去影响


                     list.add(arr.clone());
                 }
                 return;
             }

            for (int i=1;i<=3;i++){
                arr[start]=i;
                dfs(sum+i,start+1);
            }

      }

}

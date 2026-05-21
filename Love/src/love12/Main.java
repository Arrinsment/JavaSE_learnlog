package love12;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //这道题,最简单的写法就是把先把小的分类在一起,就是先把小的去合并了
        //然后本题其实就是哈夫曼树
        //就是去像一颗树一样,重下往上去合并,父节点就是要去加上的,然后又把父节点当作子节点,又去合并以此类推
        //本题要去用到优先队列,他每次会去取出最小的,然后用完就丢弃

        PriorityQueue<Integer>list=new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.offer(sc.nextInt());
        }

        //建议这种求和还是去用long
         long total=0;

        //这里是大于等于2堆的时候才去合并
        while (list.size()>=2){
            //这里是类似一颗树的样子
          int x=list.poll();
          int y=list.poll();
          int sum=x+y;
          total+=sum;
            list.offer(sum);
        }
        System.out.println(total);
    }

}

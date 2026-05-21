package 队列;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {

        //这里讲讲PriorityQueue:优先队列
        //这个PriorityQueue 用于贪心/Dijkstra
        //这个PriorityQueue的底层是基于二叉堆(默认就是堆)去实现的时间复杂度为log(n)

        //优先队列 :一个“自动排序”的容器
        //你放进去一堆数，它自动把最小的（或最大的）放在最前面
        //他默认的是最小二叉堆,就是最小的元素在队首

        //如果你要是最大的在队首,自己加个比较器对象即可
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        //这里讲讲PriorityQueue常见的方法:
        //offer()/add()	                 插入元素
        //poll()	                 取出并删除最小的元素       //没有返回null
        //peek()	                 看一眼最小(最大)的（不删除）//没有返回null
        //size()	                 元素个数


        //创建一个PriorityQueue对象

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        //插入元素
        pq.offer(10);
        pq.offer(1);
        pq.offer(20);
        pq.offer(5);

        //这里是优先队列默认会把最小的排在前面1

        //size()	                 元素个数
        System.out.println(pq.size());//4
        System.out.println("--------------------------------------------");

        //peek()	                 看一眼最小(最大)的（不删除）
        System.out.println(pq.peek());//1

        System.out.println("--------------------------------------------");



        //poll()	                 取出并删除最小的元素
        System.out.println(pq.poll());//1
        System.out.println(pq.poll());//5
        System.out.println(pq.poll());//10
        System.out.println(pq.poll());//20
        System.out.println(pq.poll());//null





    }
}

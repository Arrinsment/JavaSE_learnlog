package 队列;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {

        //这里讲讲普通的队列
        //使用于BFS
        //Queue是队列的含义
        //队列定义:先进先出,食堂排队

        //常见方法:
        //offer(e)：插入元素到队尾（推荐用这个）            队列已满、无法添加元素 时返回 false
        //
        //poll()：删除并返回队首元素（推荐用这个）           队列为空时返回 null。
        //
        //peek()：查看队首元素（不删除，推荐用这个）         队列为空时返回 null。
        //
        //size():判断有多少个元素
        //
        //isEmpty判断是否为空

        //代码实现

        //创建一个普通队列对象,如果用LinkedList<>();永远不用担心链表满的情况
        Queue<Integer>queue=new LinkedList<>();


        //往队尾去添加元素
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("--------------------------------------------------");
        //isEmpty判断是否为空
        System.out.println(queue.isEmpty());//false

        System.out.println("---------------------------------------------------");
        //size():判断有多少个元素
        System.out.println(queue.size());//4


        System.out.println("----------------------------------------------------");
        //peek(),去看队首,就是最先进入的那个元素,无法直接看队尾的元素
        System.out.println(queue.peek());//1


        System.out.println("-------------------------------------------");
        //poll(),删除并返回队首元素
        System.out.println(queue.poll());//1
        System.out.println(queue.poll());//2
        System.out.println(queue.poll());//3
        System.out.println(queue.poll());//4
        System.out.println(queue.poll());//null


    }
}


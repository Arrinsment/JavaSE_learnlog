package Exercise;

public class exercise3 {
    public static void main(String[] args) {

        //递归经典题目,猴子吃桃子

        /*猴子吃桃子
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？
        */

        System.out.println(Monkeyky(10));
    }

    public static int Monkeyky(int x){
        if (x==1){
            return 1;
        }
        return 2*Monkeyky(x-1)+2;//简洁的代码
    }
}

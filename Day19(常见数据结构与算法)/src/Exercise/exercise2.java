package Exercise;

public class exercise2 {
    public static void main(String[] args) {

        //这里我们讲讲斐波那契数列

        System.out.println(digui(12));
    }

    public static  int digui(int a) {

        //是有2个出口的

        if(a==1||a==2){
            return  1;
        }

        //直接返回递归式即可
       return  digui(a - 2) + digui(a - 1);
    }
}

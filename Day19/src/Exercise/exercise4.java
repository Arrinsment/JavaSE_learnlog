package Exercise;

public class exercise4 {
    public static void main(String[] args) {

        /*可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？*/

        System.out.println(fn(10));
    }

    public static int fn(int x){

        if(x==1){
            return 1;
        }
        if(x==2){
            return 2;
        }
        return fn(x-1)+fn(x-2);
    }
}

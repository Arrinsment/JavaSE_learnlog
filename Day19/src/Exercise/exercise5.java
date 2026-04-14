package Exercise;

public class exercise5 {

    public static void main(String[] args) {

        /*可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶,有的时候一次爬三个楼梯
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？*/

        //假如小明爬到了20了,他只用 17阶往上爬3步,或者18往上爬2步,或者19爬1步即可
        System.out.println(fn(20));//121415
    }

    public static int fn(int x){
        if(x==1){
            return 1;
        }
        if(x==2){
            return 2;
        }
        if(x==3){
            return 4;
        }

        return fn(x-1)+fn(x-2)+fn(x-3);
    }

}

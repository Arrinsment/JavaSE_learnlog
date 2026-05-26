package Love17;

import java.util.Scanner;

public class Main {

    static  Scanner sc =new Scanner(System.in);
    static  int  L=sc.nextInt();
    static  int  N=sc.nextInt();
    static  int  M=sc.nextInt();
    static  int []arr=new int[N+2];


    public static void main(String[] args) {

       //这又是一道就二分答案的题目

        for (int i = 1; i <=N; i++) {
            arr[i]=sc.nextInt();
        }
        arr[0]=0;
        arr[N+1]=L;

        //这个逻辑是如果我的每块石头距离都大于d,那么一距离一定大于比d小的数
        //因为d>=d-n(n>=0)
        //然后相当于我们就是去找每个石头距离最大的那个距离即可
        //利用二分答案去找,意思我提前先去猜一个答案,就是mid,第一个就是猜测的d,然后后续的都是
        //不断逼进的结果,直到正确答案

        //这就是二分答案：猜答案，验证，调整范围，直到找到最优解。
        //最短跳跃距离的最大值。

        int left=1;
        //最短是1
        //最长的是L
        int right=L;
        int ans=0;

        while(left<=right){

            int mid=(left+right)/2;
            if(check(mid)){
                //找到继续去找更大的
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(ans);

    }

    public static  boolean check(int d){

        int remove=0;
        int last=arr[0];
        //第一块和最后一块石头不能够去移动的
        for (int i = 1; i < arr.length; i++) {

            if((arr[i]-last)<d){
                remove++;
            }
            else {
                //更新位置
                last=arr[i];
            }
        }
         return  remove<=M;
    }
}

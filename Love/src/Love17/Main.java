package Love17;

import java.util.Scanner;

public class Main {

       static Scanner sc= new Scanner(System.in);
       static int N=sc.nextInt();
       static int M=sc.nextInt();
       static int []arr=new int[N];

    public static void main(String[] args) {


    //这里是和的最大值是X,那么X+1也肯定满足,因为我去求最小的
    //数学语言是m<=f(x),则m<=f(x)+N,N是一个自然数

       /* 如果你能承受 5 块钱的成本完成任务，那么给你 6 块钱当然也能完成。
        如果你 5 块钱不够，那么 4 块钱肯定更不够。
        钱多，越容易买”的直觉。
        钱理解为x轴,容易买,理解为y轴,钱越多就越容易买,这里就是去找钱刚刚可以买的地方
        这个过程就是一个单调递增的过程,然后我的任务就是去找到最少的钱,然后让最大的那个也可以去买到,然后完成任务,这就是"最大值最小",因为这个过程是单增的才可以用二分法,去逼近答案
*/
    //本题的意思是分完段后去,找一个段和的X,然后这个段和的x比其他段和的都大, 这个段和x尽可能的小

     //然后利用贪心去分段,就是我去看分的段数,是否满足题目给的段数即可

        long max=0;
        long total=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            total+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }

        long left=max;
        long right=total;
        long ans=0;
        while (left<=right) {

            long mid = (left + right) / 2;
            if (check(mid)) {

                //这里最好去想,钱买东西那个单调图
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }

    public static boolean check(long d){

        long start=0;
        long cnt=1;//初始段数为1,把第一段放在里面去
        for (int i = 0; i < arr.length; i++) {
            if(start+arr[i]>d){
                //移动,分段加1,把当前的arr[i]分给下一段
                cnt++;
                start=arr[i];
            }else {
                start+=arr[i];
            }
        }

        return cnt<=M;//这里可以少分,然后我自己去分成题目满足的条件即可
    }

}

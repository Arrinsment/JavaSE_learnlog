package love13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


      //这道题目又是典型的01背包动态规划题目
        //dp[i][j] 表示的是我在第i个物品前,还剩j元的情况获取的最大重要度

        //和上一题采药对应起来都是去求的最大的的东西

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]arr=new int[m+1][m+1];
        for (int i = 1; i <=m; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        int [][]dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                //选与不选
                //不选
                dp[i][j]=dp[i-1][j];
                if(j>=arr[i][0]){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-arr[i][0]]+arr[i][1]*arr[i][0]);
                }
            }
        }

        System.out.println(dp[m][n]);

    }
}

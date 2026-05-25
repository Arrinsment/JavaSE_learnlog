package love14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //这道题又是一道简单的贪心题目

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]arr=new int[m][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        //然后自定义从小到排序
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(n==0){
                break;
            }

            if(n-arr[i][1]>=0){
                sum+=arr[i][1]*arr[i][0];
                n-=arr[i][1];
            }else {
                 sum+= n*arr[i][0];
                 n=0;
            }
        }

        System.out.println(sum);

    }

}

package love16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][2];

        int j=1;
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=i+1;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               return  o1[0]-o2[0];
            }
        });

        //这里去统计要用到前缀和
        long []prefix=new long[n];

        prefix[0]=arr[0][0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i][0];
        }
        long sum=0;
        for (int i = 0; i < prefix.length-1; i++) {
            sum+=prefix[i];
        }
        double a=sum*1.0/n;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][1]+" ");
        }
        System.out.println();
        System.out.printf("%.2f",a);

    }
}







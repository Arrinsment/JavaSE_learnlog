package love10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //排队接水题目是典型的贪心题目
        //贪心:每次都在当下选最优的策略
        //当然局部最优不一定等同于全局最优,但一定最接近全局最优

        //比如排队接水
        //必须要把最小的放在最前面,因为如果你把最大的放在前面,后面每个人都会去等最大的[100,2,4,5]直接爆炸

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n+1][n+1];

        //这里是创建一个二维数组去存入数据 0去存入时间,1去存入
        //然后这里二维数组也是用的很巧妙的,很好的,就是我固定一边,然后把他当一维数组去用
        //比如arr[x][0]和arr[x][1]

        //56 1
        //12 2
        // 1 3

       for(int i=1;i<=n;i++){
           arr[i][0]=sc.nextInt();
           arr[i][1]=i;
       }

       //接下来就是去排序,根据题目要求,自己去自定义排序规则
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                //假如你在二维数组中去存入了不同的行数,每行都有2个数据,时间和标号
                //这里的o1和o2就是不同的行数
                //o1-o2是负数就直接排在前面,比如1和2
                if(o1[0]!=o2[0]){
                    return  o1[0]-o2[0];
                }
                else {
                    return  o1[1] -o2[1];
                }
            }
        });

        //这里的求和要用到前缀和
        //前缀和就是把数组的所有进行求和便于你快速去求一段区间的和
        //就和高中的数列有点像,当然前缀和本身也是一种数组
        //我会在这篇题解单上去单独去罗列一些,目前要用到前缀和知识

        //定义一个前缀和数组
        long []prefix=new long[n+1];
        //初始化前缀和
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i][0];
        }

        //利用前缀和去计算,前缀和的数组用long,因为防止太小了,防止去溢出
        long total=0;
        for(int i=1;i<n;i++){
            total+=prefix[i];
        }

        for(int i=1;i<=n;i++){
            System.out.print(arr[i][1]+" ");
        }
        System.out.println();
        System.out.printf("%.2f",total*1.0/n);

    }
}

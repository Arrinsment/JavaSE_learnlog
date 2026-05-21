package love11;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //本题还是典型的贪心题目
        //和之前的01背包不一样,本题是部分背包
        //就是他是全部装满的,哪怕他不够全部装完,也可以按比例去装一部分

        //本题有个性价比的概念就是用金币总数去除以背包容量就行
        //其实写在这里我想说:很多东西真的就只可以靠自己的感觉,去感觉出来的吗?
        //你如果没有严谨的理论数据,这真的可行吗
        //比如
        // 本题测试点:
        //   4 50
        //   10 60
        //   20 100
        //   25 100
        //   15 45,这很明显 10 60的性价比一定是高于 20 100的


        //一.输入数据
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[][] arr=new  double[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=sc.nextDouble();
            arr[i][1]=sc.nextDouble();
        }


        //然后按照性价比去降序排序
        Arrays.sort(arr, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
               //这里强制转换精度可能会丢失
               // return (int)(o2[1]/o2[0]-o1[1]/o1[0]);
               double a=o2[1]/o2[0];
               double b=o1[1]/o1[0];
               //直接使用Double.compare(a,b)\
               //a>b返回正数1
               //a==b返回0
               //a<b 返回负数-1
               //要是你不知道这个方法也可以去用if-else去写
               return   Double.compare(a,b);

            }
        });


        double total=0;
        for (int i = 0; i < arr.length; i++) {

            if(m>=arr[i][0]){
                total+=arr[i][1];
                m-=arr[i][0];
            }
            else {
                double c=arr[i][1]/arr[i][0];
                total+= m*c;
                break;
            }
        }

        System.out.printf("%.2f",total);






    }

}

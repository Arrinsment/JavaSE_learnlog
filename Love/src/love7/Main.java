package love7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner sc=new Scanner(System.in);
    static int N=sc.nextInt();
    static int M=sc.nextInt();
    static String []arr=new String[N];
    static int[] wcost=new int[N];
    static int[] bcost=new int[N];
    static int[] ccost=new int[N];
    static ArrayList<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        //必须要去吃掉有nextInt()导致的缓冲区
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }


        //然后去计算代价,就是每个区域区划分不同的颜色要分别取付出什么
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                char c=arr[i].charAt(j);
                if(c!='W')wcost[i]++;
                if(c!='B')bcost[i]++;
                if(c!='R')ccost[i]++;
            }
        }


        //这里是去模拟分界线,就是你要去手动去找到分界线

        for(int w=0;w<=N-3;w++){//白色分界线
            for(int b=w+1;b<=N-2;b++){//蓝色分界线
                int count=0;
                 //白蓝,成功去划分为了2条边界线


                //去计算代价
                for(int i=0;i<=w;i++){
                    count+=wcost[i];
                }

                for(int i=w+1;i<=b;i++){
                    count+=bcost[i];
                }

                for(int i=b+1;i<=N-1;i++){
                    count+=ccost[i];
                }
                list.add(count);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));

    }
}

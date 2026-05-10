package Love1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        //这里next***都会留下换行符,除了nextLine外的,而nextLine会吃掉换行符返回前面的内容,然后会卡在那里
        //这个时候要手动关闭,让一个空的去吃掉nextline
        int []costW=new int[N];
        int []costB=new int[N];
        int []costR=new int[N];
        String []arr=new String[N];

        //这是里用到的思想是枚举分界线的思想

        //就是我们主动去找到那条分界线
        //本题面对一大块数据其实我们可以确定2条分界线,就可以分除三块了
        //redline blueline[0-redline]涂白色,[redline+1,blueline]涂蓝色,[blueline+1,N-1]涂红色

        //存入数据:
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }

        //然后先去预处理,假如该行假如要改成白,蓝,红要去改多少
        //在N行中,我都去记录一下,如果要改成白,蓝,红要去付出多少
        for (int i = 0; i <N; i++) {
            for(int i1=0;i1<M;i1++){
                char c=arr[i].charAt(i1);
                if(c!='W')  costW[i]++;
                if(c!='B')  costB[i]++;
                if(c!='R')  costR[i]++;
            }
        }

         int min=Integer.MAX_VALUE;
         int cnt=0;

        //现在去找分界线:
        for(int wl=0;wl<=N-3;wl++){
            for(int rd=wl+1;rd<=N-2;rd++){
                cnt=0;
                //然后利用分界线去确定范围
                for(int i=0;i<=wl;i++){
                    cnt+=costW[i];
                }
                for(int i=wl+1;i<=rd;i++){
                    cnt+=costB[i];
                }
                for(int i=rd+1;i<N;i++){
                    cnt+=costR[i];
                }

                min=Math.min(min,cnt);
            }

            }
        //这个时间复杂度是大约是O(n的三次方),n<=500就肯定不会超时

        System.out.println(min);

    }
}

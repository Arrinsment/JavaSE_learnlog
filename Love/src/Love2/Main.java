package Love2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int []arr=new int[4];
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Integer>a=new ArrayList<>();
    static ArrayList<Integer>b=new ArrayList<>();
    static ArrayList<Integer>c=new ArrayList<>();
    static ArrayList<Integer>d=new ArrayList<>();
    static ArrayList<Integer>ra=new ArrayList<>();
    static ArrayList<Integer>rb=new ArrayList<>();
    static ArrayList<Integer>rd=new ArrayList<>();
    static ArrayList<Integer>rc=new ArrayList<>();


    //这里你原来已经初始化arr,new int[4]每个已经s0了.相当于下面的a,b,c,d数组元素都是0
    //那你读毛的数据进去
    static  int mida=0;
    static  int midb=0;
    static  int midc=0;
    static  int midd=0;

    public static void main(String[] args) {

        //这道题的如果你想要去用dfs去写
        //那么你一定要去掌握p1049(01背包弱数据下的dfs版本)

        //这题,主要是有左脑,与右脑要同时去处理题目,比如有4道题目分给左脑或者右脑
        //假如一科习题集:每道题目花费的时间 2 4 3

        //推导过程:
        //全给右脑,左脑不管,花2+4+3=9秒.右脑给4+3,左脑给2,花7秒,取决于大的,
        //然后右脑4,左脑给5,只花5秒,用动态思维去看!发现左右脑越接近,时间就最少
        //也就是越接近总时间的一半时间越小,/2以后向上取整即可,然后利用01背包的知识去解这题即可

        //01:背包
        //比如 2 4 3每个时间,有选与不选2种可能,然后dfs,得到每个结果,如果大于等于向上取整后的总时间一半
        //存起来最后去找存起来中最小的.就是最小时间

        //存入每个科目有多少道习题集:
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //往每个科目的题目去存入时间
        for (int i = 0; i < arr[0]; i++) {
            int s= sc.nextInt();
            a.add(s);
            mida+=s;
        }
        mida=(int)Math.ceil(mida*1.0/2);

       for (int i = 0; i < arr[1]; i++) {
            int s= sc.nextInt();
            b.add(s);
            midb+=s;
        }
        midb=(int)Math.ceil(midb*1.0/2);
        for (int i = 0; i <arr[2] ; i++) {
            int s= sc.nextInt();
            c.add(s);
            midc+=s;
        }
        midc=(int)Math.ceil(midc*1.0/2);
        for(int i=0;i<arr[3];i++){
            int s= sc.nextInt();
            d.add(s);
            midd+=s;
        }
        midd=(int)Math.ceil(midd*1.0/2);


        dfs(0,0);
        dfs1(0,0);
        dfs2(0,0);
        dfs3(0,0);

        Collections.sort(ra);
        Collections.sort(rb);
        Collections.sort(rc);
        Collections.sort(rd);

        System.out.println(ra.get(0)+rb.get(0)+rc.get(0)+rd.get(0));
    }


    public static void dfs(int idx,int sum){
        if(a.size()==idx){
            if(sum>=mida){
                ra.add(sum);
            }
            return;
        }
        //不选
        dfs(idx+1,sum);

        //选
        dfs(idx+1,sum+a.get(idx));
    }
    public static void dfs1(int idx,int sum){
        if(b.size()==idx){
            if(sum>=midb){
                rb.add(sum);
            }
            return;
        }

        //不选
        dfs1(idx+1,sum);

        //选
        dfs1(idx+1,sum+b.get(idx));
    }
    public static void dfs2(int idx,int sum){
        if(c.size()==idx){
            if(sum>=midc){
                rc.add(sum);
            }
            return;
        }

        //不选
        dfs2(idx+1,sum);

        //选
        dfs2(idx+1,sum+c.get(idx));
    }
    public static void dfs3(int idx,int sum){
        if(d.size()==idx){
            if(sum>=midd){
                rd.add(sum);
            }
            return;
        }
        //不选
        dfs3(idx+1,sum);

        //选
        dfs3(idx+1,sum+d.get(idx));
    }


}


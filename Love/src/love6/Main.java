package love6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    static Scanner sc=new Scanner(System.in);
    static int [] arr=new int[4];
    static ArrayList<Integer>list=new ArrayList<>();
    static ArrayList<Integer>list2=new ArrayList<>();
    static ArrayList<Integer>list3=new ArrayList<>();
    static ArrayList<Integer>list4=new ArrayList<>();
    static  int mida=0;
    static  int midb=0;
    static  int midc=0;
    static  int midd=0;
    static ArrayList<Integer>res1=new ArrayList<>();
    static ArrayList<Integer>res2=new ArrayList<>();
    static ArrayList<Integer>res3=new ArrayList<>();
    static ArrayList<Integer>res4=new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //list
        for (int i = 0; i < arr[0]; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            mida+=list.get(i);
        }
        mida=(int)Math.ceil(mida*1.0/2);
        //list2
        for (int i = 0; i < arr[1]; i++) {
            list2.add(sc.nextInt());
        }
        for (int i = 0; i < list2.size(); i++) {
            midb+=list2.get(i);
        }
        midb=(int)Math.ceil(midb*1.0/2);
        //list3
        for (int i = 0; i < arr[2]; i++) {
            list3.add(sc.nextInt());
        }
        for (int i = 0; i < list3.size(); i++) {
            midc+=list3.get(i);
        }
        midc=(int)Math.ceil(midc*1.0/2);
        //list4
        for (int i = 0; i < arr[3]; i++) {
            list4.add(sc.nextInt());
        }
        for (int i = 0; i < list4.size(); i++) {
            midd+=list4.get(i);
        }
        midd=(int)Math.ceil(midd*1.0/2);

        dfs(0,0);
        dfs2(0,0);
        dfs3(0,0);
        dfs4(0,0);

        Collections.sort(res1);
        Collections.sort(res2);
        Collections.sort(res3);
        Collections.sort(res4);
        System.out.println(res1.get(0)+res2.get(0)+res3.get(0)+res4.get(0));

    }

    public  static void dfs(int start,int sum){
            if(start==list.size()){
                if(sum>=mida){
                    res1.add(sum);
                }
                return;
            }

        //不选
        dfs(start+1,sum);


        //选
        dfs(start+1,sum+list.get(start));


    }

    public  static void dfs2(int start,int sum){
        if(start==list2.size()){
            if(sum>=midb){
                res2.add(sum);
            }
            return;
        }

        //不选
        dfs2(start+1,sum);


        //选
        dfs2(start+1,sum+list2.get(start));

    }

    public  static void dfs3(int start,int sum){
        if(start==list3.size()){
            if(sum>=midc){
                res3.add(sum);
            }
            return;
        }

        //不选
        dfs3(start+1,sum);


        //选
        dfs3(start+1,sum+list3.get(start));

    }


    public  static void dfs4(int start,int sum){
        if(start==list4.size()){
            if(sum>=midd){
                res4.add(sum);
            }
            return;
        }

        //不选
        dfs4(start+1,sum);


        //选
        dfs4(start+1,sum+list4.get(start));

    }

}

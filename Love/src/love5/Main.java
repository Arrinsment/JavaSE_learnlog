package love5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<int[]>list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static boolean []used=new boolean[n+5];
    static int []arr=new int[n];
    static int m=sc.nextInt();

    public static void main(String[] args) {

        int index=0;
        int []arr2=new int[n];
        list.add(arr.clone());

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=sc.nextInt();
        }
         dfs(0);
        for (int i = 0; i <list.size(); i++) {
            if (is_arr(arr2,list.get(i))){
                index=i;
                break;
            }
        }
        index=index+m;

        for (int i : list.get(index)) {
            System.out.print(i+" ");
        }
    }
    public static void dfs(int start){
        if(start==n){
            list.add(arr.clone());
            return;
        }

        for(int i=1;i<=n;i++){
            if(!used[i]){
                arr[start]=i;
                used[i]=true;
                dfs(start+1);
                used[i]=false;
            }
        }
    }

    public static  boolean is_arr (int []arr2,int []arr1){
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

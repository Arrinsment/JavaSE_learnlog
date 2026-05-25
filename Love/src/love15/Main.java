package love15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr=new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<m;i++){
            int res=sc.nextInt();
             int a= binarySearch(arr,res);

            System.out.print(a+" ");
        }

    }

      //写一个标准的二分查找函数,找不到返回-1即可
      //然后他这本题我们注意是去找第一次这个元素出现的位置
      //找到了,继续去找,就可以找打第一次出现的地方


     public  static  int  binarySearch(int []arr,int target){

        int right=arr.length-1;
        int left=1;//最少返回的是1
         int ans=-1;

        while (left<=right){
            int mid=(left+right)/2;

            //寻找左边界,找到了还要继续去找
            if(arr[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else  {
                left=mid+1;
            }
        }
        return ans;
     }

}

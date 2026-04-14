package BinarySearch;

public class BinarySearchDemo1 {
    public static void main(String[] args) {

         //二分查找又叫折半查找
         //前提数组的顺序必须是有序的
         //核心是每次排除一半的范围

        //主要是你脑袋要去想那个动图
        //而现在用动态思维来看核心就是 mid((min+max)/2),如果mid在number的左边,max不变,然后 min=mid+1(把mid左边的全部丢弃,包括mid)
        //如果mid在在在num的右边 min不变,max=mid-1;
        //以此类推直到mid指向num
        //假如min>max的时候那么数据不存在

        int []arr={7,23,79,81,103,127,131,147};
        int number=131;
         int result=  BinarySearch(arr,number);
        System.out.println(result);

    }
       public static int BinarySearch(int []arr,int number){
          int min=0;
          int max=arr.length-1;

          while (true){

              int mid =(min+max)/2;
              if (min>max){
                  return -1;
              }
              else if(arr[mid]<number){
                  min=mid+1;
              }
              else if (arr[mid]>number){
                  max=mid-1;
              }
              else if (arr[mid]==number)
              return mid;
          }

          //我边写的时候边想 脑袋有图就是方便 比如arr[mid]<number,不就意味着mid左边的那些是废物吗?完全没有用包括mid,全部舍弃即可然后min跑在mid前面即可
           //同理arr[mid]>number,不就意味着mid 右边的那些是废物吗?完全没有用,包括mid,全部舍弃即可然后max跑在mid左边(后面)即可


       }

}

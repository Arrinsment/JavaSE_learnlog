package QuickSearch;

public class quickSearchDemo1 {
    public static void main(String[] args) {

        //这里我们去讲讲快速排序
        //第一轮:把0索引的数字作为基准数,确定基准数在数组中的正确位置.
        //达到效果:比基准数小的数字全部在左边,比基准数大的全部在右边
        //后面的是以此类推

        //说白了就是把比这个数大的放在右边,比这个数小的放在左边

        int []arr={6,1,2,7,9,10,4,5,10,8};
        //我们先把0索引的元素定为基准元素,然后你同时要确定startIndex 和 endIndex
        //具体思路是一个从后往前看,找到比0索引元素小的就停,同时startIndex的下标要++.,endIndex的下标要--;
        //一个从前往后看,找到比0索引元素大的就停
        //然后这2个索引指向的元素就发生交换即可
        //然后你修改的时候最好不要去改动 startIndex 和 endIndex,而是格外创建变量去赋值,你的目的是去对数组的元素的数据进行排名

        getQuickSearch(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void getQuickSearch(int[] arr, int startIndex, int endIndex) {

        if(startIndex>endIndex){
            return;
        }

        int baseNumber=arr[startIndex];
        int start=startIndex;
        int end=endIndex;


           while (start!=end){
               //先确定endIndex
               while (true){
                   if(end<=start||arr[end]<baseNumber){
                       //这里是有个先后顺序的,不然arr[-1]会越界
                       //找到了
                       break;
                   }
                   end--;
               }
               while (true){
                   if(end<=start||arr[start]>baseNumber){
                       //找到了
                       break;// [3,6,2]->[3,2,6}
                   }
                   start++;
               }
               //然后2个进行交换即可
               int temp=0;
               temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
           }
        //当全部交换完毕后,把基本数与下标为endIndex 或者startIndex进行调换即可
        int temp=0;
        temp=arr[startIndex];
        arr[startIndex]=arr[start];
        arr[start]=temp;
        //现在6左边的就都比6小,然后6右边的就都比6大了

        //然后我们可以 以6为基准,把左边的利用递归,又一次重复这个动作,把右边的利用递归,右边的右一次重复这个动作即可
        //左边
        getQuickSearch(arr,startIndex,start-1);
        //右边
        getQuickSearch(arr,start+1,endIndex);
    }
}

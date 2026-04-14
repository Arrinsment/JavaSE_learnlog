package sortDemo;

public class insertDemo1 {
    public static void main(String[] args) {



        //插入排序:
        //将0索引的元素到N索引的元素看做是有序的,把N+1索引的最后一个元素当成是无序的,
        //遍历无序的数据,将遍历到的元素插入到有序序列适当的位置,如遇到相同数据插在后面
        //N的范围0~最大索引


        int []arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};


        //首先我们要先找到起始索引,但还是有一种情况就是数据本身就是排号的,先把索引暂定为-1
        int startIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                //获取起始索引的位置
                startIndex=i+1;
                break;
            }
        }


        //然后我们从起始索引开始去进行插入排序
        for (int i = startIndex; i < arr.length; i++) {
            int j=i;

            while(j>0&&arr[j]<arr[j-1]){ //这里每次都和左边的排序

                int temp=0;
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

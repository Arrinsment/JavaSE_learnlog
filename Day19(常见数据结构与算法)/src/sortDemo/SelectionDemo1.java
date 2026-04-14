package sortDemo;

public class SelectionDemo1 {
    public static void main(String[] args) {

        //这里我们讲讲选择排序
        //1.从0索引开始依次与后面的元素进行比较
        //2.小的放前面,大的放后面
         //3.第一次循环结束后最小的数据已经是确定了
        //4.第二次循环从1索引开始以此类推

      int []arr={5,3,1,2,4};

        for (int i = 0; i < arr.length-1; i++) {
            //只用循环4次即可,最后一个元素已经是确定了
            for (int j = i+1; j < arr.length; j++) {
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

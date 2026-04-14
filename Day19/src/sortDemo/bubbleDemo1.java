package sortDemo;

public class bubbleDemo1 {
    public static void main(String[] args) {


        //这里我们进行冒泡排序
        //冒泡排序的核心的思想
        //像冒泡泡一样每次都把最大的泡泡冒在上面
        //每次循环都会把最大的数放在最上面
        //32451->23415->23145->21345>12345

        //假如一共有n个数字,那么会应该会循环n-1次

        //现在去思考一下这个问题的自由度与约束
        //每次循环,把一个最大数,移到最后面后,那么这个数直接丢弃了,减去最外层的数,就代表减去丢弃的那个数,(从0开始去数的)
        //意思你把索引倒过来去减去即可,-0即丢弃最后一个,-1即丢弃倒数第二个,直到把最后一个也减去

        int []arr={3,2,4,5,1};
        for (int j = 0; j < arr.length; j++) {
            for (int i=0;i<arr.length-1-j;i++){
                int temp=0;
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

package BasicSearch;

public class BasicSearcExercise1 {
    public static void main(String[] args) {

        //这里是查找算法

        //练习一:需求:定义一个方法利用基本查找,查找某个元素,并返回索引
        //这里不用考虑元素是否重复
        //数据如下{131,127,147,81,103,23,7,19}
        int number=81;
        int [] arr=new int[]{131,127,147,81,103,23,7,19};

        int index = getIndex(arr, number);
        System.out.println(index);
    }
    public static int getIndex(int []arr,int num){

        for (int i = 0; i < arr.length; i++) {
         if(arr[i]==num){
             return  i;
         }

        }
        return  -1;
    }



}

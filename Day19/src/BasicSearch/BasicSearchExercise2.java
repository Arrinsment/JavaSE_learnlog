package BasicSearch;

import java.util.ArrayList;

public class BasicSearchExercise2 {
    public static void main(String[] args) {


        //基本查找练习二:
        //需求:需求:定义一个方法利用基本查找,查找某个元素,并返回索引
        //这里要考虑元素是否重复
        //数据如下{131,127,147,81,103,23,7,19}
        int number=81;
        int []arr={131,127,147,81,103,23,7,81};
        //若我们要去查找81,这里我们可以选择利用集合和数组把相同的元素放在里面
        ArrayList<Integer> list= getIndex(arr,number);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<Integer> getIndex(int[]arr,int num ){
        //在java中当你在定义的时候最左边的,除开名字就是返回值的类型,比如 int[],Array<Character>
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                list.add(i);
            }
        }
        return list;
    }


}

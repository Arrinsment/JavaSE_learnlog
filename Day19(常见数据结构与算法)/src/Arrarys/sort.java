package Arrarys;

import java.util.Arrays;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        //这里我们进行sort的升序

        Integer []arr={1,2,3,4,5,6,7,8,9};
        //进行升序排序的时候,

        //o1-o2是升序排列
        //02-01是降序排列
        Arrays.sort(arr,new Comparator<Integer>(){

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                } );

        System.out.println(Arrays.toString(arr));
        //[9, 8, 7, 6, 5, 4, 3, 2, 1] 降序排列
    }
}

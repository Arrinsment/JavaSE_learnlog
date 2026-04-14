package Arrarys;

import java.util.Arrays;

public class arraryDemo1 {
    public static void main(String[] args) {
        //这里我们讲讲Arrays和他的常见方法

        /*public static String toString(数组)    把数组拼接成一个字符串
        public static int binarySearch (数组, 查找的元素)    二分查找法查找元素
        public static int[] copyOf(原数组, 新数组长度)    拷贝数组
        public static int[] copyOfRange(原数组, 起始索引, 结束索引)  拷贝数组（指定范围）
        public static void fill(数组, 元素)    填充数组
        public static void sort(数组)    按照默认方式进行数组排序
        public static void sort(数组, 排序规则)    按照指定的规则排序
        */


        //1.利用Arrays的toString 将数组变成一个字符串

        System.out.println("------------toString-----------");
        int []arr={1,2,3,4,5,6,9,9,8};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 9, 9, 8]
        //底层还不是StringBuilder那套


        System.out.println("--------------binarySearch----------");

        //2.利用Arrays的BinarySearch去查找元素
        //细节1：二分查找的前提：数组中的元素必须是有序，数组中的元素必须是升序的(这里java底层写的这个方法要求就是升序的)
        //细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是 -插入点 - 1
       //疑问：为什么要减1呢？
       //解释：如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        // 如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
      //为了避免这样的情况，Java在这个基础上又减一。
        System.out.println(Arrays.binarySearch(arr,3));//2
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,11));//-10

        System.out.println("------------------copyOf---------------------");
        //3.拷贝数组
        ////copyOf:拷贝数组
        ////参数一：老数组
        ////参数二：新数组的长度
        //
        ////方法的底层会根据第二个参数来创建新的数组
        ////如果新数组的长度是小于老数组的长度，会部分拷贝
        ////如果新数组的长度是等于老数组的长度，会完全拷贝
        ////如果新数组的长度是大于老数组的长度，会补上默认初始值

        int []newarr=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newarr));//[1, 2, 3, 4, 5, 6, 9, 9, 8, 0]
        //底层是之前学的系统System的拷贝数组的方式

        System.out.println("----------------- copyOfRange--------------------");
        //copyOfaRnge(拷贝数组,指定范围)
        //细节包头不包尾
        int []newarr2=Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newarr2));//1, 2, 3, 4, 5, 6, 9, 9, 8]


        System.out.println("------------------fill---------------------");
        //用Arrays的fill去填充,就是你原来数组的值都是变成被fill所填充的那个值了
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));//[1, 1, 1, 1, 1, 1, 1, 1, 1]


        System.out.println("------------------sort---------------------");
        //这里默认的都是升序排序
        int []newarr3={2,4,6,3,9,1,7};
        Arrays.sort(newarr3);
        System.out.println(Arrays.toString(newarr3));//[1, 2, 3, 4, 6, 7, 9]




    }
}

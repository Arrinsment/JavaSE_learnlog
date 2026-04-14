package Day16.src.myapiSystem;

public class myApiSystemDemo1 {
    public static void main(String[] args) {

        //一.关闭虚拟机
        //最近又看了看这个System的开头的S是大写的
        //状态码一般有0和非0 2种,非0我们一般传入的是1
        //参数传入如果是0,就是在正常情况下关闭的虚拟机,正常停止
        //参数传入如果是非0,就是异常情况下关闭的虚拟机,异常停止
        // 直接调用System.exit()
        //System.exit(0);
        System.out.println("关闭了吗?");//虚拟机已经关闭了,下面的不会去执行了,什么都不会打印
        System.out.println("-------------------------------------------------------------------");


        //二.获取当前时间毫秒,System.currentTimeMillis(),返回值是个 long类型的
        //以1970早上8点起为原始时间,因为我国在东八区有时差,计算到现在计算机距离多少毫秒!,1秒等于1000毫秒,但美国那边是0:00
        long l=System.currentTimeMillis();
        System.out.println(l);
        //作用:我们可以在程序开始的时候,定义一 long start=System.currentTimeMillis();
        //我们可以在程序结束的时候在定义一个long end=System.currentTimeMillis();
        //然后我们把他们相减就是跑完这个程序要用的时间
        System.out.println("---------------------------------------------------------------------");

        //三.进行数组复制,System.arraycopy(arr1,srcPos,arr2,desPos,length);
        //我们开始进行数组复制,从arr1开始复制,把arr1拷贝到arr2,从arr1的 第srcPos的索引 去拷贝,拷贝到arr2的 第desPos索引 上去,后边的length是拷贝的元素个数\
        int[]arr1=new int[]{1,2,3,4,5,6,7,8,9};
        int[]arr2=new int[9];
        //这里我们只拷贝3,4,5
        System.arraycopy(arr1,2,arr2,2,3);
        //遍历一下
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        //这里有几点小细节:
        //1.如果是基本数据类型,那么数据类型必须保持一致,不然会报错
        //2.在进行数组拷贝的时候要注意数组的长度不要越界了
        //3.如果拷贝的不是基本数据类型,是引用数据类型,子类是可以拷贝给父类类型的,但拷贝的时候,要注意,父类(大)转换为子类(小)要强制转换



    }
}

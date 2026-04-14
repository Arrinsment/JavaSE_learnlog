package Day16.src.myapiBigInteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //这里开始写一些常见的BigInteger的方法,例如一些加减乘除,然后获取商和余数那些

        //因为这些值可能比较小,所以我们直接用BigInteger 去获取他的对象即可

        BigInteger b1=BigInteger.valueOf(19);
        BigInteger b2=BigInteger.valueOf(14);

        //1.加法add add
        BigInteger result=b1.add(b2);
        System.out.println(result);//33

        //2.减法 subtract
        BigInteger result1=b1.subtract(b2);
        System.out.println(result1);//5

        //3.乘法 multiply
        BigInteger result2=b1.multiply(b2);
        System.out.println(result2);//266

        //4.除法   divide获取商
        BigInteger result3=b1.divide(b2);
        System.out.println(result3);//1

        //5.除法   divideAndRemainder 获取商和余数
        //这里用一个数组去接收,这个数组又2个元素,index为0的表示商,index为1的表示余数
        BigInteger[] arr = b1.divideAndRemainder(b2);
        System.out.println(arr[0]);//商//1
        System.out.println(arr[1]);//余数//5

        //6.比较值是否相同 用equals,这里直接比较的是值
        Boolean flag=b1.equals(b2);
        System.out.println(flag);//false

        //7.pow 计算幂
        BigInteger result4=b1.pow(2);
        System.out.println(result4);//361

        //8.返回较大值max,较小值min
        BigInteger max=b1.max(b2);
        BigInteger min =b2.min(b1);
        System.out.println(max);//19
        System.out.println(min);//14

        //9.转换为int类型超出范围有错误,利用的是 intValue
        int result5=b1.intValue();
        System.out.println(result5);//19
    }
}

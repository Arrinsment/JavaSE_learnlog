package Day16.src.myapiBigInteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

        //这里讲讲BigInteger的含义,Big表示大数的意思,Integer表示整数的意思,这里获取的是大整数的意思

        //这里的BigInteger要创建对象在访问

        // 方式一: public BigInteger(int num,Random rnd) ,表示随机获取大整数,范围[0~2num次方-1]
        Random r=new Random();
        BigInteger B=new BigInteger(4,r);//表示会生成[0,2的4次方-1]的一个随机数,[0,15]
        System.out.println(B);


        //方式二:获取一个指定的大整数
        //public BigInteger(String val);
         //我往字符串随机传入一个"整数"字符串,他就会直接获取出来,然后里面的一定是整数
        BigInteger B2=new BigInteger("11111111111111111111111111111111111");
        System.out.println(B2);//控制台上打印:11111111111111111111111111111111111


       //方式三:获取一个指定进制的大整数
        //public BigInteger(String val,int radix);//这里的radix是进制的意思
        BigInteger B3=new BigInteger("100",10);//这里会在控制台上打印10进制的100
        BigInteger B4=new BigInteger("100",2);//这里会在控制台上打印2进制下的100,然后把它转换10进制给我,也就是4给我
        //BigInteger B5=new BigInteger("123",2);//这里会报错因为,二进制没有123;
        //细节:
        //1.字符串的数字必须是整肃
        //2.字符串的进制(radix)必须与数字(val)吻合

        //方式四:静态方法获取BigInteger的对象,内部有优化,这里利用的是 valueOf 但没有创建对象而是直接调用 BigInteger.valuOf名字 去调用
        //和上面方式二的区别是:
        //1.表示的范围很小是long的范围

        //2.java在底层 把-16,16的数字,已经把对象写好了你直接调用即可
        BigInteger B6= BigInteger.valueOf(100);
        System.out.println(B6);//100

        BigInteger B7= BigInteger.valueOf(16);
        BigInteger B8= BigInteger.valueOf(16);
        System.out.println(B7==B8);//这里的结果返回是true,因为对象都是相同的,java已经创建好了

        BigInteger B9= BigInteger.valueOf(17);
        BigInteger B10= BigInteger.valueOf(17);
        System.out.println(B9==B10);//这里的结果是false ,因为 对象比较的地址不同



        //然后这里面还有一个细节,对象一旦创建,内部的属性值不会发生改变
        BigInteger B11=BigInteger.valueOf(4);
        BigInteger B12=BigInteger.valueOf(5);
        BigInteger result=B11.add(B12);
        System.out.println(result);//这里的值是9,他不会改变B11和B12的值,而是产生了一个新的BigInteger对象去记录3



    }
}

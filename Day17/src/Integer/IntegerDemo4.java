package Integer;

public class IntegerDemo4 {

    public static void main(String[] args) {

        //这里我们讲讲integer的一些常见的成员方法

        //把整数转化为二进制与八进制,十六进制,然后你得到得这些 二进制,八进制与十六进制,返回得都是字符串


        //1.//把100转化为二进制,返回值都是String类型的
        String str1=Integer.toBinaryString(100);
        System.out.println(str1);

        //2.//把100转化为八进制
        String str2=Integer.toOctalString(100);
        System.out.println(str2);

        //3.把100转化为16进制
        String str3=Integer.toHexString(100);
        System.out.println(str3);

       //4.将字符串类型的整数转化为int类型的整数
        //Java是一种强类型的语言:不同的数据类型的转化必须要求类型转化才行
        //这里用到的方法是parseInt 把它一个字符串类型转化为int类型
        int a=Integer.parseInt("1111111");
        System.out.println(a+1);//1111112
        //细节1:parseInt()括号里面的数字必须是数字类型的字符串,不然你怎么转
        //细节2:除了Character类型都有对应的parase***

        //比如把一个字符串类型变为boolean类型
        String str="true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);//true

    }
}

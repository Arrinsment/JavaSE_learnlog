package Integer;

import java.util.Scanner;

public class IntegerDemo5 {
    public static void main(String[] args) {
        //这里讲讲这个包装类在如何更好的用在键盘录入上面

        Scanner sc=new Scanner(System.in);

       /* String a = sc.next();
        System.out.println(a);*/



        //这里可以录入任何东西,但不能录入空格,因为一遇到空格 就自动断开了,
        //比如我这里录入的是aa bb结果只会在控制台上打印aa

        //所以以后我们统一用 next.line(),然后这里接收到的还是一个字符串的形式
        //然后需要用上面数据直接用包装类的知识去转换即可

       /* String str=sc.nextLine();//1111
        int a1=Integer.parseInt(str);
        System.out.println(a1);//1111*/

        String str1=sc.nextLine();//2.5
        double a2=Double.parseDouble(str1);
        System.out.println(a2+1);//3.5



    }
}

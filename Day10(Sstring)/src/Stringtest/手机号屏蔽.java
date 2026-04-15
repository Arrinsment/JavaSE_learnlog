package Stringtest;

import java.util.Scanner;

public class 手机号屏蔽 {
    public static void main(String[] args) {

        //题目要求是输入 一段号码然后 把中间的进行屏蔽
        //比如18181635569 181****5569
        //分析可以利用 String.substring(int beginningIndex, int endIndex)/String.substring( int beginningIndex)直接截完,String是自己字符串
        //substring 是子链的意思,是包头不包尾的[begin,end), index 是字符串下标

        //1.键盘录入一个电话号码
        Scanner sc=new Scanner(System.in);
        String phoneNumber = sc.next();
        System.out.println(phoneNumber);

        //2.利用substring(子链)
        String beginSubstring =  phoneNumber.substring(0,3);
        String endSubstring = phoneNumber.substring(7);

        //3.进行字符串的拼接
        String result=beginSubstring+"****"+endSubstring;

        //4.打印输出
        System.out.println(result);

    }
}

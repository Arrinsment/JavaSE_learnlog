package Stringtest;

import java.util.Scanner;

public class 判断对称字符串 {
    public static void main(String[] args) {
        //输入一个字符串,然后判断它是不是对称字符串
        //对称字符串:123321,1111

        //通过分析题意发现 对称字符串就是正着和反着 都相同的字符串
        //然后StringBuilder 的使用2种场景
        //1.拼接字符串
        //2.反转字符串

         //1.键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();

        //利用StringBuilder 进行字符串反转比较
        String S2 = new StringBuilder().append(s1).reverse().toString();//这里直接使用 链式编程一行就可以写完

        //最后利用equals进行比较
        //equals 返回值是boolean类型的 相等返回true 不等为 false
        if(s1.equals(S2)){
            System.out.println("是对称字符串");
        }
        else{
            System.out.println("不是对称字符串");
        }
    }
}

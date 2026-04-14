package Stringtest;

import java.util.Random;

public class 字符串的随机打乱 {
    public static void main(String[] args) {
        //键盘录入一个字符串,然后把他们随机打乱
        //打乱这里最直接的方式,就是定义一个数组然后把内容 进行随机交换
        String s = "abcdefg";
        char[] c = s.toCharArray();
        char ten = '0';
        Random SC = new Random();
        for (int i = 0; i < c.length; i++) {
            int num = SC.nextInt(s.length());
            ten = c[0];
            c[0] = c[num];
            c[num] = ten;
        }
        String result = "";
        for (int i = 0; i < c.length; i++) {
            result += c[i];
        }
        System.out.println(result);
    }
}

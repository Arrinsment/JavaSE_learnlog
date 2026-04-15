package StringDemo;

import java.util.Scanner;

public class stringDemo3 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = str.next();
        //进行遍历

        for (int i = 0; i < s.length(); i++) {
            //传入的是索引,然后根据索引去找对应的,字符串然后进行计算
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}

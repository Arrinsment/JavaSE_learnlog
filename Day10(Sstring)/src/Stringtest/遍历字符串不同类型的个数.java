package Stringtest;

import java.util.Scanner;

public class 遍历字符串不同类型的个数 {
    public static void main(String[] args) {
        //键盘录入一个字符串,统计不同类型 小写/大写/数字的个数
        Scanner str =new Scanner(System.in);
        System.out.println("请输入你的字符串");
        String s = str.next();
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i <s.length() ; i++) {
            char s1=s.charAt(i);
            //当输入的类型是char 的时候会自动 转换 为 int类型,然后去找对应的ASCII码表,意思是比较的本质都是转化为对应的ASCII码值比较
            if(s1>='a'&&s1<='z'){
                smallCount++;
            }
            else if(s1>='A'&&s1<='Z'){//其实是根据作用的对象自动去找对应的比较,但本质都是对应的ASCII码值的比较,你和'A'和直接写65比较是一样的
                bigCount++;
            }
            else if(s1>='0'&&s1<='9'){
                numberCount++;
            }
        }
        System.out.println("小写字母有"+smallCount+"个");
        System.out.println("大写字母有"+bigCount+"个");
        System.out.println("数字字母有"+numberCount+"个");
    }
}

package Stringtest;

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {
        //开发一个验证码 随机从26个小写字母和26个大写字母和数字0到9种选择,4个字符,一个数字
        //0-9是必须有的其余大小写是随机的

        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int num = rd.nextInt(52);
            sb.append(c[num]);
        }
       // System.out.println(sb);

        //现在生成一个数字,可以随机生成一个数字,先拼接在最后面,然后进行数组的随机替换
        int number = rd.nextInt(10);
        sb.append(number);
       // System.out.println(sb);

        //随机替换

        //老师的思路 是把最后一位元素和前面的元素进行随机进行交换,确实更好
        //我这样相当与最后随机交换了一次
        char ten = ' ';
        String S3 = sb.toString();
        System.out.println(S3);
        char[] c1 = S3.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int num2 = rd.nextInt(5);
            ten = c1[i];
            c1[i] = c1[num2];
            c1[num2] = ten;
        }
        String result=new String(c1);
        System.out.println(result);
    }
}

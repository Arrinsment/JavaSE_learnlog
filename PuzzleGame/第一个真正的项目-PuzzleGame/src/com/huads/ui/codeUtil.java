package com.huads.ui;

import java.util.ArrayList;
import java.util.Random;

public class codeUtil {

    //写个获取验证码的工具包
    private codeUtil(){}//把这个私有化,以防止别人创建对象

    public static String getcode(){
        //如果你不加static 你必须要创建对象才可以访问,但问题是这里我是直接调用方法就可以了
        ArrayList<Character>list=new ArrayList<>();

        //往里面存入字母
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }

        //我们随机从集合中随机选取然后拼接在一起即可
        Random sc=new Random();


       StringBuilder sb=new StringBuilder();
       for(int i=0;i<4;i++){
           int index=sc.nextInt(52);
           sb.append(list.get(index));
       }
       int num=sc.nextInt(10);
       sb.append(num);

       //转换为字符串和字符数组
        char[]ch= sb.toString().toCharArray();


        //然后把前面的和后面的数字随机交换
        int num2=sc.nextInt(4);
        char ten=' ';

        ten=ch[ch.length-1];
        ch[ch.length-1]=ch[num2];
        ch[num2]=ten;


        return new String(ch);
    }

}

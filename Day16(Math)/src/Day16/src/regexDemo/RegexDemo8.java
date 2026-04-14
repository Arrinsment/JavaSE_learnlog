package Day16.src.regexDemo;

public class RegexDemo8 {
    public static void main(String[] args) {

        //这里主要讲讲在正则表达式运算的分组

        //规则一:从1开始连续不间断
        //规则二:然后以左括号为基准,最左边的是第一组,其次为第二组,以此类推
        //(\\d+)(\\d+)(\\d+)
        //(\\d+(\\d+)(\\d+)


        //一.捕获分组:就是把这一组的数据捕获出来,再用一次

        //捕获分组的练习

        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例:a123a   b456  17891 &abc& falseabc&
        // .表示任意字符,  \\组号(x):表示把x组的内容再拿出来用一次即可(正则内部使用)

        String Regex="(.).+\\1";
        //利用matches方法去判断是否满足表达式即可
        System.out.println("a123a".matches(Regex));//true
        System.out.println("b456".matches(Regex));//false
        System.out.println("17891".matches(Regex));//true
        System.out.println("&abc&".matches(Regex));//true
        System.out.println("falseabc&".matches(Regex));//false

        System.out.println("--------------------------------------------------");
        //需求2:判断一个字符串的开始字符和结束字符是否一致?可以有多个字符
        //举例:abc123abc b456b &!@abc&!@  false123aabb
        String Regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(Regex2));
        System.out.println("b456b".matches(Regex2));
        System.out.println("&!@abc&!@".matches(Regex2));
        System.out.println("false123aabb".matches(Regex2));

        System.out.println("--------------------------------------------------");
        //需求3:判断一个字符串的开始字符和结束字符是否一致?可以有多个字符,但开始与结束内部的字符串必须全部相同
        //举例:aaa123aaa bbb456bbb 111789111 &&abc&&
        //本题选择把前面的a(以第一个为例)单独看做一组然后重复多次,后面直接和前2道题差不都即可
        //+代表出现一次或多次,*代表出现0次或多次(1次也属于多次)

        //这里(.)\\1* 这里的*作用于前面的1,因为1的意思是指我分完组后前面的内容在后面出现会在用一次(aa)(不要管后面123aaa单独看这前面的aaa)
        //而*表示可以出现0次或者多次意思 我a后面可以什么都不出现,单独一个a,也可以出现多个a
        //-->(.)\\1*,然后我后面还要在用一次这个,所以要用括号括起来,但括起来后,按'('从左往右开始数,变成了第二组了,所以我们要把\\1变为\\2
        //后面照旧即可

        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("b456b".matches(regex3));
        System.out.println("&!@abc&!@".matches(regex3));
        System.out.println("false123aabb".matches(regex3));
        System.out.println("--------------------------------------------------");


        //需求4:把我喜喜喜喜欢欢欢欢欢欢欢编编编程 用正则表达式改为我喜欢编程
        //把喜喜喜喜喜喜换为喜
        //把欢欢欢欢欢欢欢换为欢
        //把编编编换为编

        //这里的$1:表示从第一组中本身中直接拿来用即可(正则外部使用)
        String s2="我喜喜喜喜欢欢欢欢欢欢欢编编编程";
            String Regex4="(.)\\1*";
            System.out.println(s2.replaceAll(Regex4,"$1"));











    }
}

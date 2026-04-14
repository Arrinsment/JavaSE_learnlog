package Day16.src.regexDemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        //判断是否与表达式匹配,匹配返回true,public boolean matches(string regex)
        //然后我们要注意这里只能匹配一个

         //零.假如是一个单纯的字符串 比如Sring Regex="Java",那么他就会单纯去把这些去一一对应起来;

        //一.只能是a b c, [abc],只能是abc,当中的一个
        System.out.println("--------------1-----------------");
        System.out.println("a".matches("[abc]"));// true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("ab".matches("[abc]"));//也 是false,因为只能是abc三个中一个才行//false
        //要想正确,就是从左到右去匹配,第一个a和第一个[abc]匹配,第二个b和第二个[abc]去匹配
        System.out.println("ab".matches("[abc][abc]"));//true

        //二.不能出现abc,[^abc],不能是abc
        System.out.println("---------------2-----------------");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc][^abc]"));//true


        //三.表示在a-z/A-Z的范围内[a-zA-Z]
        System.out.println("---------------3------------------");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("B".matches("[a-zA-Z]"));//true
        System.out.println("zz".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]"));//true
        System.out.println("0".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[0-9a-zA-Z]"));//true

       //四.上面范围的另外一种写法 [a-d[m-p]] 表示在a-d或者m-p之间吗?
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("b".matches("[a-d[m-p]]"));//true
        System.out.println("aa".matches("[a-d[m-p]]"));//false
        System.out.println("e".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //取交集 [a-z&&[d-f]] &&表示取a-z到d-f之间的交
        //细节:若有一个&符号就表示单纯表示一个&符号 ,我们可以看做三个部分组成 [a-z&[d-f]]1.a-z,&,d-f三个部分
        System.out.println("a".matches("[a-z&[d-f]]"));//true a确实在a-z之间
        System.out.println("&".matches("[a-z&[d-f]]"));//true a确实是&

        //2.2个&&并且符号表示交集,也就是 ,d,e,f
        System.out.println("a".matches("[a-z&&[d-f]]"));//false
        System.out.println("&".matches("[a-z&&[d-f]]"));//false
        System.out.println("e".matches("[a-z&&[d-f]]"));//true

        System.out.println("----------------4-----------------");

        //[a-z[^bc]]也就是[ad-z]就是a和d-z值间
        System.out.println("a".matches("[a-z[^bc]]"));//true
        System.out.println("b".matches("[a-z[^bd]]"));//false


        System.out.println("----------------5-----------------");
        //[a-z&&[^m-p]]就是在a-z和(不在m-p间)的交集
        System.out.println("a".matches("[a-z]&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z]&&[^m-p]"));//false

    }
}

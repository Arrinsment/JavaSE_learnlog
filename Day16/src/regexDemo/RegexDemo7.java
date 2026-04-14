package regexDemo;

public class RegexDemo7 {


    public static void main(String[] args) {

        //public String replaceAll(String regex, String newStr)
        //public String[] split(String regex):

/*
    有一段字符串：小诗诗dqwefqwfqww12312小丹丹dqwefqwfqwwf12312小惠惠
    要求1：把字符串中三个姓名之间的字母替换为vs
    要求2：把字符串中的三个姓名切割出来
*/

        String s = "小诗诗dqwefqwfqww12312小丹丹dqwefqwfqwwf12312小惠惠";
        //这里讲讲正则表达式 常见的方法,除了之前的 Match()还有以下的

        //一.replaceALL
        // 要求1：把字符串中三个姓名之间的字母替换为vs,注意这个替换要求,
        //然后注意这里是取的交集&&[&&[]];
        String regex1="[\\w&&[^_]]+";
        String result=s.replaceAll(regex1, "vs");
        System.out.println(result);

        System.out.println("-------------------------------------");
        //二.split切割
        //这里的切割指的是往相同的去切割,比如 白诗韵a杨一a向楠,然后传入一个正则表达式,然后根据这个正则表达式的规则,就会进行切割
        //最后返回一个String类型的数组即可,然后数组就包括,白诗韵,杨一,向楠,三个元素即可
        String regex2="[\\w&&[^_]]+";
        //他就会按照正则表达式的规则去切割,然后返回这个在String这个数组里面
        String[] result2=s.split(regex2);
        for (int i = 0; i < 3; i++) {
            System.out.println(result2[i]);
        }
        System.out.println("-----------------------------------------------");

       //三.matches:判断字符串是否满足规则, (" 字符串").matches(正则表达式),满足正则表达式规则就返回true,不满足就返回false


    }


}

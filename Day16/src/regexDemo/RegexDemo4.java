package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {

        //patteren :表示正则文本表达式
        //matcher :文本匹配器,按照正则表达式的规则去读取字符串,从头开始去读取,就是从一段 大的字符串中获取小的字符串

        //要求去爬取 JavaXX的指定格式内容
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";


        //这里主要讲讲爬虫,就是按照正则表达式的内容去爬取指定内容

        //一.利用pattern和compile(编译) 去获取正则表达式指定规则,
        Pattern p=Pattern.compile("Java\\d{0,2}");

        //二.然后我们利用matcher 去用正则规则去读取指定内容
        //这里是这里的Matcher的m会利用p的正则规则在matcher这个文本匹配器,去str这个大串中去获取满足规则的子串,
        Matcher m=p.matcher(str);

        //三.但问题是m确实是去找了,但你并不知道找到没有,所以我们要用 m.find 这个方法,找到返回true 然后在底层记录下下标比如[0,4)
        //包头不包尾,和substring 一样但如果没有找到直接返回false即可,但这里要注意,就是比如[0,4)这里的Java他找到了,然后直接在本类中
        //返回只返回一个find的下标索引,所以要多次调用m.find,然后你第二次用m.find 他就直接去第二个子串去找了,所以我们要用循环包裹起来


        //boolean flag=m.find()

        while(m.find()) {
            //最后我们在利用m.group把下标对应的字符串,截取出来即可,他的底层是 substring,包头不包尾
            String s = m.group();
            System.out.println(s);
        }





    }
}

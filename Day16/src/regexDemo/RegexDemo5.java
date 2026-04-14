package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        //这里主要练习的还是爬虫,但这里主要练习的是按照有条件的去爬取目标数据

        //目标一:主要爬取java带有后面具体数字,但却不显示后面的具体数据,比如这里的java17,具体显示的就是java
        //这里的?相当于代表前面的java,=代表的是后面的具体数据
        //但是这个?=后面的数据是不会去显示的,只会去显示前面的数据,比如这里的java
        String Regex="Java(?=8|11|17)";
        Pattern p=Pattern.compile(Regex);
        Matcher m=p.matcher(str);
        while(m.find()){
            String s=m.group();
            System.out.println(s);
        }

        System.out.println("--------------------------------------------------------------------------------");
        //需求二:主要爬取,带版本号的java 比如这里的Java17,Java8,Java11
        String Regex2="Java(8|11|17)";//第一种写法
        String Regex3="Java(?:8|11|17)";//第二种写法,:号代表后面的内容要显示,也就是8|11|17任意出现一个即可
        Pattern p2=Pattern.compile(Regex2);
        Matcher m1=p2.matcher(str);
        while(m1.find()){
            String s2=m1.group();
            System.out.println(s2);
        }

        System.out.println("--------------------------------------------------------------------------------");
        //需求三: 主要爬取除了步带版本号的那些,
        String Regex4="Java(?!8|11|17)";
        Pattern p3=Pattern.compile(Regex4);
        Matcher m2=p3.matcher(str);
        while (m2.find()){
            String S3=m2.group();
            System.out.println(S3);
        }
    }
}

package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {

        //这里讲讲贪婪爬取和非贪婪爬取
        //贪婪爬取:尽可能多的爬取数据,java默认的就是贪婪爬取
        //非贪婪爬取:尽可能少的去爬取数据,java默认的就是非贪婪爬取

        //只写+和* 代表贪婪匹配, *是0次或多次,+是1次或多次,abbbbbbbbbbbbbbbbbbb
        //只写+?或者*? 代表非贪婪匹配 ,ab


        String s = "Java自从95年间世以来，abbbbbbbbbbbbbaaaaaaaaaaaaaaa" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //这是贪婪爬取
        String regex="ab+";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
        System.out.println("-------------------------------");

        //这是非贪婪爬取,直接在+/*后面加上一个?即可
        System.out.println("-------------------------------------");
        String regex4="ab+?";
        Pattern p4=Pattern.compile(regex4);
        Matcher m4=p4.matcher(s);
        while(m4.find()){
            System.out.println(m4.group());
        }

    }
}

package regexDemo;

public class RegexDemo1 {

    public static void main(String[] args) {

        //正则表达式初体验
        String qq="3516360455";
        //qq要求 第一位:不能为0开头,然后长度必须在6-20之间,全部为数字
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }

}

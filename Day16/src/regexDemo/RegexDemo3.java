package regexDemo;

public class RegexDemo3 {
    public static void main(String[] args) {

        //这里先讲讲转义字符 \,就是会改变反斜杠\a,比如这里的a的原本的含义
        //比如叫你打印一下双印号, System.out.println("\"");这样写才行不然JVM会以为前2个""是一对的
        //又比如 D:\自己写的小程序\\image\\animal\\animal3\\all.jpg这里的第一个\就是一个反斜杠名,会改变\animal的含义,就是让他成为一个\animal,方便系统取调用


        //这里写 常见的正则表达式,预定义字符,但还是一个字符匹配一个

        //一.表示任意字符 ,但注意只能匹配一个
        System.out.println("耀".matches("."));//true
        System.out.println("诗韵".matches("."));//false
        System.out.println("婉晚".matches(".."));//true
        System.out.println("-------------------------------------------------");

        //二. \\d表示一个一位数字
        //java中2个\\表示一个\
        System.out.println("1".matches("\\d"));//true
        System.out.println("a".matches("\\d"));//false
        System.out.println("12".matches("\\d"));//false
        System.out.println("123".matches("\\d\\d\\d"));//false

        System.out.println("------------------------------------------------");

        //  三.\\w只能表示一个单词字符(小写的w)[a-z_A-Z0-9],数字,字符,大小写英文
        System.out.println("2".matches("\\w"));  //true
        System.out.println(("a").matches("\\w"));//true
        System.out.println(("好").matches("\\w"));//false
        System.out.println(("aa").matches("\\w"));//false 只能是一个
        System.out.println(("aa").matches("\\w\\w"));//false 只能是一个
        System.out.println(("_").matches("\\w"));//true 只能是一个


        //四.如果对以上的进行取反的话,表示不是单词字符,比如汉字直接用\\W去表示即可
        System.out.println("猛".matches("\\W"));      //true
        System.out.println("猛男".matches("\\W\\W")); //true
        System.out.println("aa".matches("\\W\\W"));  //false


        //五.然后表示至少n次[a-z_A-Z0-9],  \\w{6,} 这里表示的是至少n次
        System.out.println("123ssefvg_a_44fd".matches("\\w{6,}"));//true 因为前面出现的确实至少有6次

        //六.必须对表示4次
        System.out.println("1234".matches("\\w{4}"));//true
        System.out.println("ac2e".matches("\\w{4}"));//true
        System.out.println("1s3_4".matches("\\w&&[^_]{5}"));//false





    }
}

package regexDemo;

public class RegexDemo9 {
    public static void main(String[] args) {
        //这里讲讲非捕获分组

       //非捕获分组:分组之后不需要在用本数据,仅仅是把数据括起来,你也无法分组
        //特点:是不占用组号
        //常见的符号是(?!)(?=)(?:) 都是非捕获分组,你使用了这些后就无法去分组了
        //比如"Java(17|18|19)"
        //Java(?!17|18|19) 就是后面带有17,18,19,的Java都不行
        //Java(?=17|18|19) 就是后面带有17,18,19,的Java才行,但17|18|19都不会展现只有Java
        //Java(?:17|18|19) 直接展现后面带有Java的比如Java17 Java18 Java19



















    }
}

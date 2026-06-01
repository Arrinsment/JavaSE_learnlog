import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            String s=sc.next();


            //然后我们利用String的contain()的方法去看是否包含具体的符号,去判断句具体是什么类型
            //整数,分数,还是小数

           //这个contains的形参只能传入只能传入 CharSequence 类型（比如 String、StringBuilder、CharBufferl)
          if (s.contains(".")){

              String[] s1 = s.split("\\.");//这是正则表达式,\\.才表示一个.
              //单个String的类型是没有直接reverse方法的要把他们转化为StringBilder才行
              //然后直接往StringBuilder里面去放 支付串即可
              StringBuilder sb1=new StringBuilder(s1[0]);
              StringBuilder sb2=new StringBuilder(s1[1]);
              //这里是用一个方法叫replaceFirst传入的是一个正则表达式,把开头的全部"0"换成""
              //"^0+",^:表示开头,+:一个或多个,把开头1个或者多个的"0"变成""
              String news2 = sb1.reverse().toString().replaceFirst("^0+", "");
              //"0+$",$:表示末尾,+:一个或多个,把末尾1个或者多个的"0"变成""
              //注意12.090反转后是12.9
              String news3 = sb2.reverse().toString().replaceAll("0+$", "").replaceFirst("^0+","");

              //然后判断一下,开是不是全部清空了
              if(news2.length()==0) news2="0";
              if(news3.length()==0) news3="0";

              System.out.println(news2+"."+news3);

          }
          else if (s.contains("/")){
              String[] s1 = s.split("/");
              StringBuilder sb1=new StringBuilder(s1[0]);
              StringBuilder sb2=new StringBuilder(s1[1]);
              //1/200
              String news2 = sb1.reverse().toString().replaceFirst("^0+", "");
              String news3 = sb2.reverse().toString().replaceFirst("^0+", "");
              if(news2.length()==0) news2="0";
              if(news3.length()==0) news3="0";

              System.out.println(news2+"/"+news3);

          }
          else  if(s.contains("%")){

              String sd = s.substring(0, s.length() - 1);
              StringBuilder sb1=new StringBuilder(sd);
              String s1 = sb1.reverse().toString().replaceFirst("^0+", "");
              if(s1.length()==0)s1="0";
              System.out.println(s1+"%");

          }
          else {
              StringBuilder sb=new StringBuilder(s);
              String s1 = sb.reverse().toString().replaceFirst("^0+", "");
              if(s1.length()==0)s1="0";
              System.out.println(s1);
              //无论写完了哪种类型都要去看下是否是空的,空的就去补0;

          }


      //replaceAll 的常见用法:
        //目的	正则	例子
        //删除末尾所有 0	"0+$"	"12300" → "123"
        //删除开头所有 0	"^0+"	"00123" → "123"
        //删除所有空格	"\\s+"	"a b c" → "abc"
        //删除所有数字	"\\d"	"a1b2c" → "abc"
        //"\"正则:"\\\\";

      //String s6="12A3AAB31";
        //System.out.println(s6.replaceAll("\\d",""));//xxAXAABxx
        //System.out.println(s6.replaceAll("\\d+","x"));// xAXAABx
        //"\\d+"表示连续一段数字比如第二个"12"把他们换成x


    }
}



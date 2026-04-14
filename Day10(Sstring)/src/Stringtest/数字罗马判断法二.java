package Stringtest;

import java.util.Scanner;

public class 数字罗马判断法二 {
    public static void main(String[] args) {
        //题目要求,输入一个数字,不能是字母,然后把他转换为罗马数字
        //Ⅰ j Ⅲ Ⅳ Ⅴ Ⅵ Ⅶ Ⅷ Ⅸ Ⅹ Ⅺ Ⅻ
        //输入的数字的长度要小于9个数字


        //1.键盘录入一个字符串
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的数字");
            String str = sc.next();
          //  System.out.println(str);

            //2.进行数字的校验,长度小于9全是数字,不能有字符
            boolean flag = StrCheck(str);
            if (flag) {
                //如果输入的字符是正确的,那么就开始转换
                StrToluomanum(str);
                break;
            }
            else {
                System.out.println("输入错误,请重新输入");
            }
        }
    }

    public static void StrToluomanum( String s){

     //为了把传入的数字和罗马字符相对应,我这里使用,查表法,一一对应起来,开头是" "即可对应起来
     //String []arr={" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ"," Ⅵ ","Ⅶ"," Ⅷ","Ⅸ"};
     //这里涉及到匹配所以我们可以选择使用 switch语句
        //Ⅰ Ⅱ Ⅲ Ⅳ Ⅴ Ⅵ Ⅶ Ⅷ Ⅸ Ⅹ Ⅺ Ⅻ
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){

           char c=s.charAt(i);
           //这个jdk的新特性 是自己带有break穿透的
          switch(c){
              case '1'->sb.append("Ⅰ");
              case '2'->sb.append("Ⅱ");
              case '3'->sb.append("Ⅲ");
              case '4'->sb.append("Ⅳ");
              case '5'->sb.append("Ⅴ");
              case '6'->sb.append("Ⅵ");
              case '7'->sb.append("Ⅶ");
              case '8'->sb.append("Ⅷ");
              case '9'->sb.append("Ⅸ");
              default->sb.append("");
          }
        }
        System.out.println(sb);
    }


    public static boolean StrCheck(String str){
          if(str.length()>9){
              return false;
          }
         for(int i=0;i<str.length();i++){
             char s=str.charAt(i);
             if(s<'0'||s>'9'){ //你是sb吗?一个字符,怎么可能同时小于0,又同时大与9,要么小于0,要么大于9,二选一
                 return false;
             }
         }
        return true;
    }
}

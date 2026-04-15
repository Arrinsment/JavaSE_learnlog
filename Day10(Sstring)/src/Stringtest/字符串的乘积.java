package Stringtest;

public class 字符串的乘积 {
    public static void main(String[] args) {
        //给定2个number数字字符串,要求是非负数的,num1和num2,返回num1与num2的乘积,结果用字符串的形式

         String num1="1234";
         String num2="1255234";

         //这里我们定义一个方法把String 转换为数字 charTonumber
        char[] res1=num1.toCharArray();
        char[] res2=num2.toCharArray();

           int result1  =  charTonumber(res1);
           int result2  =  charTonumber(res2);
        System.out.println(result1);
        System.out.println(result2);
        int sumres= result1*result2;
        System.out.println(sumres);

        //现在把int类型的最后在转换为字符串的
        StringBuilder sb=new StringBuilder();
        String result =sb.append(sumres).toString();
        System.out.println(result);
    }
    public static int charTonumber(char [] c){
            int sum=0;
        for (int i = 0; i < c.length; i++) {
            sum=sum*10+(c[i]-48);//这里是等于+= 会把原来的sum加上去
        }
        return sum;
    }
}

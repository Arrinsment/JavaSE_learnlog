package Stringtest;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        //题目要求输入一些数字 ,转换为带有 大写金额的 的格式


        //键盘录入一个数字
        //对了,记得对数字进行校验

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int money=0;int count=0;
        String res1="";String res2="";

       while(true) {
            money = sc.nextInt();
           if (money >= 0 && money <= 9999999) {
               System.out.println("输入正确,转化中>>>");
               break;
           } else {
               System.out.println("输入金额错误,请重新输入");//2531
           }
       }
        //为了把这些数字 转化为大写的发现 直接利用数组最好,这里我选择写一个方法
        //发现只可以一位 一位的传递 比如传个位 然后转化为大写字母
            while (money!=0){
                int ge =money%10;//是模上10,不然数组会发生越界
               // res1 += getCapitalNumber(ge);这里方向反了
                res1 = getCapitalNumber(ge)+res1;
                money/=10;
                count++;
            }
              System.out.println(res1);
              //接下来为了补齐7位数 直接在前面加 3个零即可

            res2  = getCompleteZero(count,res1);
        System.out.println(res2);
        //最后一步打上标记
              getresult(res2);

    }

   public static void getresult(String res2) {
       String result = "";
       String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
       for (int i = 0; i < res2.length(); i++) {
           char S4 = res2.charAt(i);
           result += S4;
           result += arr[i];
       }
       System.out.println(result);
   }

   public static String getCompleteZero(int count1,String remainS){
       int remaincount =7-count1;
       while (remaincount!=0){
           remainS="零"+remainS;
           remaincount--;
       }
       return remainS;
   }

    public  static String  getCapitalNumber(int s){
        String []arr={"零","壹","贰","叁","肆","伍","陆","柒","玐","玖"};
                       return arr[s];
    }
}
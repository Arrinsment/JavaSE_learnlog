package regexDemo;

public class reGexExercise1 {
    public static void main(String[] args) {

        //一.电话号码
        //利用正则表达式验证验证手机号码是否正确
        //号码:13125317749
        //规则:第一位是1,第二位是3-9,剩下的9个随便取
        //第一位表示只能以1开头1,1
        //第二位可以是3-9的任意数[3-9]
        //剩下的只能是数字\\d{9}
        System.out.println("13125317749".matches("1[3-9]\\d{9}"));//true
        System.out.println("1312533317749".matches("1[3-9]\\d{9}"));//false
        System.out.println("11125333172".matches("1[3-9]\\d{9}"));//false

        System.out.println("----------------------------------------------------------");
        //二.座机号码
        //书写正则表达式的时候从左往右去写
        //0831-5350918  020-2324242 027-42424 02122442
        //第一位是0,第2位,有2个或者三个数字,第三位是下划线
        //?表示有一位或者0位
        //然后接下来是电话号码第一位不能是0[1,9]
        String regex1="0\\d{2,3}-?[1-9]\\d{5,9}";
        System.out.println("0831-5350918".matches(regex1));//true
        System.out.println("085350918".matches(regex1));//true
        System.out.println("031-5350918".matches(regex1));//true
        System.out.println("031-0350918".matches(regex1));//false
        System.out.println("----------------------------------------------------------------");



         //另外正则表达式可以直接用插件进行生成
        //这里我们生成一个时间的
            String regex2=  "[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
            //或者这样去写
            String regex3=  "([01]\\d|2[0-3])(:([0-5]\\d)){2}";
        System.out.println("12:12:12".matches(regex3));
    }
}

package Stringtest;

public class 数组括号拼接 {
    public static void main(String[] args) {
        //一个数组比如{1,2,3}
        //然后把这些数组拼接成为 [1,2,3]
        //注意还要进行安全校验1.数组为null 2.什么都没有,长度为0 int[]arr=new int[0];
        int[]arr=null;
        String S =  arrtostring(arr);
        System.out.println(S);
        //自己定义一个数组拼接的方法

    }
    public static String arrtostring(int[]arr){
        String result="[";
        if(arr==null){
            return "";//为什么我老师这里写的是" "?;//从用户角度去想问题空不就是什么都没有嘛
        }
        else if(arr.length==0){
            return "[]";
        }
        else{
            for (int i = 0; i <arr.length ; i++) {

                if (i==arr.length-1) {
                    result += arr[i];
                }
                else {
                        result+=arr[i]+",";
                    }
                }
            result+="]";
        }
        return  result;
    }
}

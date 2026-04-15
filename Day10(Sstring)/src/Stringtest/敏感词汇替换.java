package Stringtest;

public class 敏感词汇替换 {
    public static void main(String[] args) {
        //对一些常见的敏感词进行替换
        //主要是利用String.replace(target:"旧值",replacement"新值");拿新值去替换旧值//有返回值同 substring

        //定义一些敏感词库
        String []arr={"CNM","TMD","RNM","MLJB","妈","操","傻逼"};

        String s="打你妈,真他妈是个傻逼的游戏,不会打就滚去学习,CNM,操你妈";

        //进行替换
        for (int i = 0; i < arr.length; i++) {
             s = s.replace(arr[i],"***");
        }
        System.out.println(s);
    }
}

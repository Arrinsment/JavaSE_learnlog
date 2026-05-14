package mytext;

import java.io.*;

public class text7 {
    public static void main(String[] args) throws IOException {

        ///*
        //实现一个验证程序运行次数的小程序，要求如下：
        //1. 当程序运行超过3次时给出提示：本软件只能免费使用3次，欢迎您注册会员后继续使用~
        //2. 程序运行演示如下：
        //   第一次运行控制台输出：欢迎使用本软件，第1次使用免费~
        //   第二次运行控制台输出：欢迎使用本软件，第2次使用免费~
        //   第三次运行控制台输出：欢迎使用本软件，第3次使用免费~
        //   第四次及之后运行控制台输出：本软件只能免费使用3次，欢迎您注册会员后继续使用~
        //*/
        //这里有个的和以前用循环去写的不太一样,这里要反复去运行,所以数据要永久去保存,只有把数据永久保存在文件中


        //这里的文件名字是count.txt 初始值是0
        //关于IO流有个小原则
        //随用随创建
        //不用马上就关闭

        BufferedReader bfr=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\count.txt"));
        int count=Integer.parseInt(bfr.readLine());
        if (count<3){
            System.out.println(" 第"+(count+1)+"次运行控制台输出：欢迎使用本软件，第"+(count+1)+"次使用免费~");
        }
        else {
            System.out.println(" 第四次及之后运行控制台输出：本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }

        count++;
        BufferedWriter bfw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\count.txt"));
        bfw.write(count+"");//这里如果你直接写入的一个数字,比如97,他会解码为a输出,所以要输入字符串

        bfw.close();
        bfr.close();


    }
}

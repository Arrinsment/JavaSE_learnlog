package IOtest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) throws IOException {



        ///*
        //需求：写一个登陆小案例。
        //
        //步骤：
        //将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        //保存格式为: username=zhangsan&password=123
        //让用户键盘录入用户名和密码
        //比较用户录入的和正确的用户名密码是否一致
        //如果一致则打印登陆成功
        //如果不一致则打印登陆失败
        //*/


        //创建一个BufferReader对象,去读取整行数据
        BufferedReader br=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\IOtest2\\userinfo.txt"));

        String str = br.readLine();
        //System.out.println(str);//username=zhangsan&password=123

        br.close();

        //接下来进行切割
        String[] split = str.split("&");
        String[] arr = split[0].split("=");
        String[] arr2 = split[1].split("=");

        String name=arr[1];
        String passworld=arr2[1];

        System.out.println(name+" "+ passworld);

        //进行密码核对
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名");
        String name1=sc.next();
        System.out.println("输入密码");
        String pass=sc.next();

        if(name.equals(name1)&&passworld.equals(pass)){
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败");
        }


    }

}

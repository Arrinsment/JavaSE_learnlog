package IOtest2;

import java.io.*;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws IOException {

        // 需求：写一个登陆小案例（添加锁定账号功能）
        // 步骤：
        // 将正确的用户名和密码手动保存在本地的userinfo1.txt文件中。
        // 保存格式为:username=zhangsan&password=123&count=0
        // 让用户键盘录入用户名和密码
        // 比较用户录入的和正确的用户名密码是否一致
        // 如果一致则打印登陆成功
        // 如果不一致则打印登陆失败，连续输错三次被锁定

        BufferedWriter br1=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\IOtest2\\userinfo1.txt"));
         br1.write("username=zhangsan&password=123&count=0");

         //close() 会先自动刷新缓冲区，再关闭通道。
         br1.close();

        //读取数据
        BufferedReader br=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\IOtest2\\userinfo1.txt"));

        String str = br.readLine();
        String[] arr = str.split("&");

        String[] arr2 = arr[0].split("=");
        String[] arr3 = arr[1].split("=");
        String[] arr4=  arr[2].split("=");

           String name=arr2[1];
           String pass=arr3[1];
           String num= arr4[1];
           int num2=Integer.parseInt(num);

        Scanner sc = new Scanner(System.in);


       while(true){

              if(num2==3){
                  System.out.println("账号被锁定");
                  break;
              }
           System.out.println("请输入你的名字");
           String name2=sc.next();
           System.out.println("请输入你的密码");
           String userpass=sc.next();

           if(name.equals(name2)&&pass.equals(userpass)){
               System.out.println("登录成功");
               break;
           }
           else{
               System.out.println("登录失败,您还有"+(2-num2) +"次机会");
               num2++;

               BufferedWriter br2=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\IOtest2\\userinfo1.txt"));

               String res="username=zhangsan&password=123&count="+num2;

               br2.write(res);
               br2.close();

         }
       }

       //每次输入完,你想看到当前的txt都要手动刷新一下
    }
}

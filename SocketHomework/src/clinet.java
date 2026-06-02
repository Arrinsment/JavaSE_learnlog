import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class clinet {

    public static void main(String[] args) throws IOException {

        //写一个socket网路连接,让客服端和服务端建立一个初步连接
        Socket s=new Socket("127.0.0.1",10000);



        while (true) {
            System.out.println("--------欢迎来到诗韵聊天室---------");
            System.out.println("请输入你的选择");
            System.out.println("1.登录");
            System.out.println("2.注册");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            switch (n){
                case 1-> login(s);
                case 2-> System.out.println("注册");
                default -> System.out.println("没有这个选项,请重新输入");

            }
        }
        //下面就开始去写登录逻辑,就是用户肯定要去输入用户名和密码,然后和配置文件里面的去核对
        //为什么要用配置文件,因为你以后统一添加和删除用户比较方便
    }

    public static void login( Socket socket) throws IOException {

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //写项目都是写一步然后测一步
      //他这里是往服务端去发送用户的密码与账号,服务端与配置文件的比对后觉得确实有,然后我就去去转发
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String username=sc.next();
        System.out.println("请输入你的密码");
        String userpassworld=sc.next();

        //???为什么这里要去执行这个第一次登录

        //第一次执行的是登录操作
        bw.write("login");
        bw.newLine();
        bw.flush();


        StringBuilder s=new StringBuilder();
        s.append("username=").append(username).append("&").append("password=").append(userpassworld);
        bw.write(s.toString());
        bw.newLine();
        //写了让他马上是呈现
        bw.flush();


        //然后这里继续把服务端写回的数据进行一个写回
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s1 = br.readLine();

        //这个br是没有刷新flush这个方法的,他读了就直接读了
        //flush() 的意思是“把缓冲区里的数据发出去”。
        // 输入流的缓冲区里是从外面读进来的数据，不是要发出去的数据，
        // 所以不需要“发”这个动作。

        //就好比你寄出信的时候要要调用flush,快点把信寄出,免得一直放在邮局
        //而收信,就是收到了


        //这里自己规定一个状态码,用来简化字符串的状态
        //1:密码输入正确 2:密码输入错误 3:用户名错误,请重新输入
        System.out.println(s1);
        br.close();

        if(s1.equals("1")){
            System.out.println("登录成功");
         //登录成功后就开始往外面去发数据
            talk2all(bw);
        }else if(s1.equals("2")){
            System.out.println("密码输入错误");
       }
        else {
            System.out.println("用户名错误,请重新输入");
        }
    }

    private static void talk2all(BufferedWriter bw) throws IOException {
        System.out.println("请输入你想说的话");
        bw.write(new Scanner(System.in).next());
        bw.newLine();
        bw.flush();

    }

}

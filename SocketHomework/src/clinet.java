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
            String S=sc.next();
            switch (S){
                case "1"-> login(s);
                case "2"-> regiser();
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

        //就好比你寄出信的时候要要调用flush,快点把信寄出,免得一直放在邮局,然后这个flush并没有关闭发送通道
        //而收信,就是收到了


        //这里自己规定一个状态码,用来简化字符串的状态
        //1:密码输入正确 2:密码输入错误 3:用户名错误,请重新输入
        System.out.println(s1);

        //记住：从同一个 Socket 获取的输入流和输出流是绑定的，关闭其中一个可能会影响另一个。
        //通常只关最外层的流,或直接关 Socket 自动释放所有资源。
        //说白了这个输入流和输出流都是从Socket中来的不要随意去关闭任意一个,如果关闭了
        //都会导致其他无法正常写入或者写出
        //都是从socket里面分出来的,关闭一个必然会影响另外一个
        //除非你是使用
        // br.close();

        if(s1.equals("1")){
            System.out.println("登录成功");

         //登录成功后就开始往外面去发数据
         //注意此时服务端会不断往每个客服端去发消息,就是群发消息
         //就是张三像客服端发的消息,服务端会接收后,转发给其他人
         //然后单独开一个线程去接收服务端发的消息,然后发送给其他人

            new Thread(new Myrun11(socket)).start();

            talk2all(bw);

        }else if(s1.equals("2")){
            System.out.println("密码输入错误");
       }
        else {
            System.out.println("用户名错误,请重新输入");
        }
    }

    public static void talk2all(BufferedWriter bw) throws IOException {
        while (true) {
            System.out.println("请输入你想说的话");
            bw.write(new Scanner(System.in).next());
            bw.newLine();
            bw.flush();
        }
    }


    public static  void regiser() throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\SocketHomework\\src\\servicedir\\userinfo.txt",true));
        System.out.println("请输入您要注册的名字");
        String username=sc.next();
        System.out.println("请输入您要注册的账户密码");
        String userpassworld=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(username).append("=").append(userpassworld);
        bw.write(sb.toString());
        bw.newLine();
        bw.close();

    }
}

//记住：从同一个 Socket 获取的输入流和输出流是绑定的，关闭其中一个可能会影响另一个。
// 通常只关最外层的流（或直接关 Socket 自动释放所有资源）。

//网络编程里：先开的后关，后开的先关。但核心是——所有流都在最后一起关，不要中途关。
class Myrun11 implements  Runnable{
    Socket socket;

    //写一个构造方法
    public Myrun11(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //这里只可以try不能抛,因为他父类不能try

            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String s = br.readLine();
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
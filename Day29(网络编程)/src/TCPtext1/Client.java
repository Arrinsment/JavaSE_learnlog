package TCPtext1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {


        // TCP通信练习1 --- 多发多收
        // 客户端：多次发送数据
        // 服务器：接收多次接收数据，并打印

        Socket socket=new Socket("127.0.0.1",10000);


        Scanner sc = new Scanner(System.in);


        //创建一个输出流去输出数据new
        OutputStream s1=socket.getOutputStream();


        while (true) {
            //去输入数据
            System.out.println("请输入你要发送的数据");
            String s=sc.next();
            //写入的是字节
            s1.write(s.getBytes());
        }


    }
}

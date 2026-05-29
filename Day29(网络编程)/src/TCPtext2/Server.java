package TCPtext2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main(String[] args) throws IOException {


        // 客户端：发送一条数据，接收服务端反馈的消息并打印
        // 服务器：接收数据并打印，再给客户端反馈消息

        ServerSocket s=new ServerSocket(10000);

        Socket socket = s.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int len =0;
        // 细节：
        // read方法会从连接通道中读取数据
        // 但是，需要有一个结束标记，此处的循环才会停止
        // 否则，程序就会一直停在read方法这里，等待读取下面的数据

        while ((len=br.read())!=-1){
            System.out.print((char)len);
        }


        Scanner sc = new Scanner(System.in);

        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请输入你要输入的话");
            String S = sc.next();
            if("886".equals(S)){
                break;
            }
            os.write(S.getBytes());
        }


    }
}

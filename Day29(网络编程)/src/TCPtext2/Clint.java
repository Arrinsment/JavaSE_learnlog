package TCPtext2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Clint {

    public static void main(String[] args) throws IOException {


        // 客户端：发送一条数据，接收服务端反馈的消息并打印
        // 服务器：接收数据并打印，再给客户端反馈消息


        Socket socket=new Socket("127.0.0.1",10000);
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

        socket.shutdownOutput();
        //就是调用这个方法后服务端的read读取后,就返回-1,不在继续读取
        //客户端                                    服务端
        //   │                                         │
        //   │  1. 发送数据（多次）                      │  2. read() 读取并打印
        //   │ ─────────────────────────────────────→  │
        //   │                                         │
        //   │  3. 调用 shutdownOutput()                │
        //   │ ─────────────────────────────────────→  │
        //   │                                         │  4. read() 读完数据后，收到"发完了"信号
        //   │                                         │      ↓
        //   │                                         │  5. read() 返回 -1
        //   │                                         │      ↓
        //   │                                         │  6. 循环结束，继续执行后续代码


        //假如这里你用的BuffedReader/BuffedWriter那么在shutdownOutput()中,那么read读取到的就是null




        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int len =0;
        while ((len=br.read())!=-1){
            System.out.print((char)len);
        }

        socket.close();




    }
}

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

        //要去打上一个关闭标记,因为在TCP中,你也不知道要多久,多久才真正输入完成,
        //不像IO流的文件那样读取到末尾,就自动返回-1了

        socket.shutdownOutput();


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int len =0;
        while ((len=br.read())!=-1){
            System.out.print((char)len);
        }

        socket.close();




    }
}

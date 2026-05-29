package TCPtext1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket s=new ServerSocket(10000);


        Socket socket = s.accept();

        //接收成功 利用返回的socket,去接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while (true) {
            int len=0;

            while ((len=br.read())!=-1){

                System.out.print((char)len);
            }
            System.out.println();
        }


    }
}

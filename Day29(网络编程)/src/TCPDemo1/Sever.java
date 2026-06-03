package TCPDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {

        //这里的Sever是服务端的意思

        // 服务器
        // ServerSocket

        // 1. 创建服务器端的Socket对象(ServerSocket)
        // ServerSocket(int port)

        // 2. 监听客户端连接，返回一个Socket对象
        // Socket accept()

        // 3. 获取输入流，读数据，并把数据显示在控制台
        // InputStream getInputStream()

        // 4. 释放资源
        // void close()

        //Ctrl+Alt+L自动对齐

        // 1. 创建服务器端的Socket对象(ServerSocket)
        // ServerSocket(int port)

        //和1000的端口进行绑定,便于服务端去传递代码
        ServerSocket ss=new ServerSocket(1000);

        //服务端代码会一直在这里死等,直到有用户来连接
        Socket socket = ss.accept();

        InputStream is=socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //他这里虽然叫字符转换流,并不是直接就把字节转换为了字符,而是按照编码规则比如这里默认的就是UTF-8,把三个字节变成以组字节了

        int b=0;
        while ((b=br.read())!=-1){
            System.out.println((char)b);
        }

        socket.close();
        is.close();
        //然后is这个流和socket有关,就是包括在socket里面的
        //其实直接关闭socket即可








    }
}

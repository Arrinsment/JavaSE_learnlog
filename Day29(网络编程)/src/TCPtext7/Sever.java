package TCPtext7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {

        //这里的Sever是服务端的意思
        //127.0.0.1 :10000 端口号是10000
        // 端口号
        // 应用程序在设备中唯一的标识。
        // 端口号：由两个字节表示的整数，取值范围：0~65535
        // 其中0~1023之间的端口号用于一些知名的网络服务或者应用。
        // 我们自己使用1024以上的端口号就可以了。
        // 注意：一个端口号只能被一个应用程序使用。


        //这里是bs架构就是从浏览器向本地去发送消息


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
        ServerSocket ss=new ServerSocket(10000);

        //服务端代码会一直在这里死等,直到有用户来连接
        Socket socket = ss.accept();

        InputStream is=socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //他这里虽然叫字符转换流,并不是直接就把字节转换为了字符,而是按照编码规则比如这里默认的就是UTF-8,把三个字节变成以组字节了

        int b=0;
        while ((b=br.read())!=-1){
            System.out.print((char)b);
        }

        socket.close();
        is.close();


        //这个bs架构
        //GET / HTTP/1.1
        //Host: 127.0.0.1:10000
        //Connection: keep-alive
        //Cache-Control: max-age=0
        //sec-ch-ua: "Google Chrome";v="125", "Chromium";v="125", "Not.A/Brand";v="24"
        //sec-ch-ua-mobile: ?0
        //sec-ch-ua-platform: "Windows"
        //Upgrade-Insecure-Requests: 1
        //User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36
        //Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
        //Sec-Fetch-Site: none
        //Sec-Fetch-Mode: navigate
        //Sec-Fetch-User: ?1
        //Sec-Fetch-Dest: document
        //Accept-Encoding: gzip, deflate, br, zstd
        //Accept-Language: zh-CN,zh;q=0.9

    }
}

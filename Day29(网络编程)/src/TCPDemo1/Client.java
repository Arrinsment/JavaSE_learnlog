package TCPDemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {


        //这里的Client是客服端的意思

        // 客户端
        // Socket
        //
        // 1. 创建客户端的Socket对象(Socket)与指定服务端连接
        // Socket(String host, int port)
        //
        // 2. 获取输出流，写数据
        // OutputStream getOutputStream()
        //
        // 3. 释放资源
        // void close()


        //一.创建一个Socket对象
        //细节:创建对象的时候会连接客服端
        //如果连接不上代码会报错

        Socket socket=new Socket("127.0.0.0",1000);
        //这里是利用三次握手去确保连接的


        //2. 获取输出流，写数据
        //OutputStream getOutputStream()
        //这里你已经知道这里是建立一个连接通道,然后你要去知道,这里是直接使用socket,getOutputStream去调用即可,因为你通过spcket已经知道iphe端口号了
        OutputStream op=socket.getOutputStream();
        op.write("你好你好".getBytes());


        // 3. 释放资源
        // void close()

        //这个op通道是建立在socket里面对的,你自己把socket关闭,就已经把op通道关闭了
        //就是我关闭前肯定要去确保数据已经完全传输完毕,不然你直接利用socket.close把数据连接通道关闭了,假如数据还在传怎么可行
        //这是肯定不行的,然后这里运用到的协议就是四次挥手,确保数据传输完毕后,然后去断开
        //就是你在这个协议下面去使用四次挥手才有意义


        op.close();
        socket.close();




        // TCP通信程序（三次握手）
        // 确保连接建立
        // 第一次：客户端向服务器发出连接请求，等待服务器确认
        // 第二次：服务器向客户端返回一个响应，告诉客户端收到了请求
        // 第三次：客户端向服务器再次发出确认信息，连接建立




        // TCP通信程序（四次挥手）
        // 确保连接断开，且数据处理完毕
        // 第一次：客户端向服务器发出取消连接请求
        // 第二次：服务器向客户端返回一个响应，表示收到客户端取消请求
        // 第三次：服务器将最后的数据处理完毕，向客户端发出确认取消信息
        // 第四次：客户端再次发送确认消息，连接取消

    }
}

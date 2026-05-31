package TCPtext5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws IOException {


        // TCP通信练习5 --- 上传文件（多线程版）
        // 需求：服务器不停止，能同时接收多个用户上传的图片
        // 方案：用多线程改写（循环方案不合理）

        //本题的意思是就是我一个服务端,然后我去客服端批量的去上传数据
        //但很明显,如果我同时大量的去上传数据,可能的会导致数据上传不完整,我现在就是一个服务端线程去对应客服端

        //本质就是让服务端的程序不停止即可,因为里面有个ss.accept()这个函数,就是接受到客服端的发完的消息后才继续往下去发,
        //所以完全可以用循环去包裹起来

        ServerSocket s=new ServerSocket(10000);

        while (true) {
            Socket socket = s.accept();

            new Thread(new Myrunnable(socket)).start();
        }


    }

}


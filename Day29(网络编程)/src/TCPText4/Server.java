package TCPText4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {


    public static void main(String[] args) throws IOException {


     //服务端:接受客服端发送的文件,然后给出反馈
     //客服端:给服务端发送文件,接受客服端的反馈


        ServerSocket s=new ServerSocket(10000);

        Socket socket = s.accept();


        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        String str = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Javacode\\JavaSE_learnlog\\Day29(网络编程)\\image2\\"+str+".jpg"));

        byte[]bytes=new byte[1024];  //"D:\\Javacode\\JavaSE_learnlog\\Day29(网络编程)\\image2\\

        int len=0;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        BufferedOutputStream bos1=new BufferedOutputStream(socket.getOutputStream());
        bos1.write("你好已经发送".getBytes());
        //close() 内部会先调用 flush()，把缓冲区数据发出去，然后再释放资源。
        bos1.flush();


        socket.close();


    }

}


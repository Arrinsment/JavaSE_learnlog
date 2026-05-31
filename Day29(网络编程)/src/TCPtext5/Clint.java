package TCPtext5;

import java.io.*;
import java.net.Socket;

public class Clint {


    public static void main(String[] args) throws IOException {


        // TCP通信练习5 --- 上传文件（多线程版）
        // 需求：服务器不停止，能同时接收多个用户上传的图片
        // 方案：用多线程改写（循环方案不合理）


        Socket ss=new Socket("127.0.0.1",10000);

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day29(网络编程)\\image\\IMG_3798(20260408-104340).PNG"));

       BufferedOutputStream bos=new BufferedOutputStream(ss.getOutputStream());

       byte []bytes=new byte[1024];//IMG_3798(20260408-104340).PNG

       int len=0;

       while ((len=bis.read(bytes))!=-1){
           bos.write(bytes,0,len);
       }

       ss.shutdownOutput();

       BufferedReader br=new BufferedReader(new InputStreamReader(ss.getInputStream()));

        System.out.println(br.readLine());


        ss.close();



    }

}

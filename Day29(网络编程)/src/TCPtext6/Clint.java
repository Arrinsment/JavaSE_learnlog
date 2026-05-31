package TCPtext6;

import java.io.*;
import java.net.Socket;

public class Clint {


    public static void main(String[] args) throws IOException {


        //TCP通信练习6 —— 上传文件（线程池优化）
        //频繁创建线程并销毁非常浪费系统资源，所以需要用线程池优化


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

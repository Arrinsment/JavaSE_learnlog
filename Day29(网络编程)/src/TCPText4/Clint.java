package TCPText4;

import java.io.*;
import java.net.Socket;

public class Clint {

    public static void main(String[] args) throws IOException {


        //服务端:接受客服端发送的文件,然后给出反馈
        //客服端:给服务端发送文件,接受客服端的反馈

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

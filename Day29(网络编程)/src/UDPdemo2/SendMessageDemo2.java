package UDPdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo2 {

    public static void main(String[] args) throws IOException {


        /*
        按照下面的要求实现程序
        UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
        UDP接收 数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
       */

        DatagramSocket ds=new DatagramSocket();//不在()中取指定端口,就随机去用一个端口去发放

        while (true) {
            //准备数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想说的话:");
            String s=sc.next();
            if("886".equals(s)){
                break;
            }

            byte[] bytes = s.getBytes();
            //发送到本机的ip地址
            InetAddress address = InetAddress.getByName("127.0.0.1");
            //设置一个端口号
            int port=10086;
            //打包数据
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

            //发送数据
            ds.send(dp);
        }

        //结束资源

    }
}

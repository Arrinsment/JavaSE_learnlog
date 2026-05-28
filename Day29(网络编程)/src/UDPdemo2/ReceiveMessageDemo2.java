package UDPdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo2 {
    public static void main(String[] args) throws IOException {


        DatagramSocket ds=new DatagramSocket(10086);

        //准备工作
        byte[]bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        while (true) {
            //真正接收数据
            ds.receive(dp);

            //解析数据
            byte[] data = dp.getData();
            int port = dp.getPort();
            String hostAddress = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();
            int len=dp.getLength();

                                                                                                           //这里获取的是实际字节长度
            System.out.println("名字为:"+hostName+"端口号为:"+dp.getPort()+"IP地址为:"+hostAddress+"接收到:"+new String(data,0,len));


        }

    }
}

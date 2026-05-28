package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo1 {

    public static void main(String[] args) throws IOException {

        // UDP通信程序（接收数据）
        // 1. 找快递公司
        // 创建接收端的DatagramSocket对象
        // 2. 接收箱子
        // 接收打包好的数据
        // 3. 从箱子里面获取礼物
        // 解析数据包
        // 4. 签收走人
        // 释放资源


        // 1. 找快递公司
        // 创建接收端的DatagramSocket对象
        DatagramSocket ds=new DatagramSocket(10086);


        // 2. 接收箱子
        // 接收打包好的数据
        //创建一个字节数组去接收数据
        byte []bytes=new byte[1024*1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        //程序执行到这里的时候会在这里去死等,等待发送端去发送数据
        ds.receive(dp);


        //3,从箱子中去获取礼物
        //获取字节
        byte[] data = dp.getData();
        //获取长度
        int length = dp.getLength();
        //获取
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        String s = new String(data,0,length);

        System.out.println("接收到数据:"+s);
        System.out.println("发送端的ip地址是"+address+"端口号:"+port);

        //释放资源
        ds.close();

        //先打开接送端,然后去打开发送端
        //你不张开,我怎么进来

    }

}

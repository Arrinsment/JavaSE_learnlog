package UDP;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {


        // UDP通信程序（发送数据）(这个是我只管去发,但我不管我是否发成功)
        // 1. 找快递公司
        // 创建发送端的DatagramSocket对象
        // 2. 打包礼物
        // 数据打包（DatagramPacket）
        // 3. 快递公司发送包裹
        // 发送数据
        // 4. 付钱走人
        // 释放资源


        //一.去找一个快递公司(创建一个DatagramSocket对象)
        // 细节：
        // 绑定端口，以后我们就是通过这个端口往外发送
        // 空参：所有可用的端口中随机一个进行使用
        // 有参：指定端口号进行绑定
        //比如我从55160这个端口去发送,然后发送到10086这个端口,然后我接收的时候也保证是这个端口即可
        DatagramSocket ds = new DatagramSocket();


        //二.去打包礼物,数据打包（DatagramPacket）
        String str="你好厉害呀!!!!";
        byte[] bytes = str.getBytes();
        //ip,发送到本机
        InetAddress address= InetAddress.getByName("127.0.0.1");
        //端口号
        int port=10086;
        //这里的bytes.length代表的是全部,我要把bytes的全部数据发送过去
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);


        //三.发送数据
        ds.send(dp);

        //四.释放数据
        ds.close();

        //这个是我只管去发,但我不管我是否发成功




    }
}

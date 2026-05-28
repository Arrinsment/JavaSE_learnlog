package netAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class netAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {



        // static InetAddress getByName(String host)
        // 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址

        // String getHostName()
        // 获取此IP地址的主机名

        // String getHostAddress()
        // 返回文本显示中的IP地址字符串


        //一.获取主机的InetAddress的对象
        //address,IP对象,就是一台电脑的对象


       /* InetAddress  address=InetAddress.getByName("192.168.1.100");
        System.out.println(address);//192.168.1.100*/


        InetAddress address=InetAddress.getByName("LAPTOP-UKTDPUR4");
        System.out.println(address);//LAPTOP-UKTDPUR4/192.168.150.1


        System.out.println(address.getHostName());//LAPTOP-UKTDPUR4
        System.out.println(address.getHostAddress());//192.168.150.1





    }
}





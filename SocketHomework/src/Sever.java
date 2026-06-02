import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Sever {

    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(10000);
        //创建一个装配置文件的properties集合,本质就是一个Map集合
        Properties P=new Properties();
        //然后创建一个文件
        FileInputStream fi=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\SocketHomework\\src\\servicedir\\userinfo.txt");
        //装置配置文件去
        P.load(fi);
        fi.close();

        while (true) {

            //等待用户连接中
            Socket socket = ss.accept();
            System.out.println("客服端连接成功");
            new Thread(new MyRun(socket,P)).start();

        }
        //假如一次性有多个用户去登录,每个用户就去对应一个线程即可
    }
}
class  MyRun implements Runnable{
      //注意我们这里传入进来的账号是和配置文件的账号去比较的

      //这里就是相当与一个普通的Student类类似的构造方法
    Socket socket;
    Properties properties;

    public MyRun(Socket socket, Properties p) {
        this.properties=p;
        this.socket=socket;
    }
    @Override
    public void run() {

        BufferedReader br= null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }


        String s = null;
        try {
            //这里不是治标不治本吗?
        //   while (true) {
               s = br.readLine();
               switch (s) {
                   case "login" -> login(br);
               }
       //    }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void login(BufferedReader br) throws IOException {

        System.out.println("用户执行了登录操作");
        String s = br.readLine();
        System.out.println(s);//username=zhangsan&password=123

        //获取密码和用户名
        String[] split = s.split("&");
        String userName=split[0].split("=")[1];
        String passWorld=split[1].split("=")[1];

        System.out.println("用户名:"+userName);
        System.out.println("密码:"+passWorld);

        //就是把包普通配置文件集合去当map集合去用即可
        //判断完成后,还要给客服端去写回消息,用方法去写回,会简单很多

        if(properties.containsKey(userName)){

            String userpassworld =(String) properties.get(userName);
            if(passWorld.equals(userpassworld)){
                Writemessage("1");
                talkall(br,userName);

            }else{
                //用户名存在
                Writemessage("2");
            }
        }else {
            Writemessage("3");
        }
    }

    private void talkall(BufferedReader br,String username) throws IOException {

        String s=br.readLine();
        System.out.println(username+"发送了一条消息"+s);

    }

    public  void Writemessage(String things) throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(things);
        bw.flush();
    }

}

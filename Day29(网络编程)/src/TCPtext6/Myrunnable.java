package TCPtext6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class Myrunnable implements  Runnable{

     Socket socket;

    public Myrunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            String str = UUID.randomUUID().toString().replace("-", "");
            //细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket!=null){

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                //这里其实直接socket.close就可以了,还要非空判断的原因,是因为你并不确定,别人会不会传null进来
               /* accept() 正常返回，socket 确实不为 null。但finally里的判断是防御性编程，防止其他意外情况（比如构造方法传入了 null）。
                很多老程序员写代码的习惯是：「只要可能为 null，就用之前判断一下」，这样代码更健壮。*/
            }
        }




    }
}

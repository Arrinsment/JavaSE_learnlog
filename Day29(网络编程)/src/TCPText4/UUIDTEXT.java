package TCPText4;

import java.util.UUID;

public class UUIDTEXT {
    public static void main(String[] args) {

        //这里的UUID可以四川一个随机的字符串,然后保证字符串的内容是随机的
        //然后直接类名去调用即可

        //为了去解决重名的问题
        String str = UUID.randomUUID().toString().replace("-", "");
        System.out.println(str);


    }
}

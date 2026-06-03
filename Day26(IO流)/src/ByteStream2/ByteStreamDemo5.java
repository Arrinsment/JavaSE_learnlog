package ByteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {

        //循环读取一次性只读取一个字节,还是太慢了
        //其实可以一次性去读取多个字节

        //public int read(byte[] buffer) 一次读一个字节数组数据

        //先去创建一个 FileInputStream对象
        FileInputStream f=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\b");

        //现在b中是abcde
        //创建一个byte数组,长度为2,初始化都是0
        byte[] bytes=new byte[2];

        int len= f.read(bytes);//会从左到右,去读取长度为2,并把对应的Ascll码存入,比如b中abcde 就存人ab的Ascall码{97,98}
                                //返回值代表具体读取几个
        System.out.println(len);//2
        String s=new String(bytes);
        System.out.println(s);//ab

        int len2 = f.read(bytes);
        System.out.println(len);//2
        String s2=new String(bytes);
        System.out.println(s2);//de

        //b中有a,b,c,d,e
        //[a,b]->(a,b被c,d覆盖)->[c,d]->(只读取到了一个e,e把c给覆盖了,但d没有)->[e,d],现在是c中是没有让你去读取的了,然后返回-1,还是->[e,d]

        //但很明显我希望我的最后只打印e,而不是ed,我可以利用String 里面的一个构造方法 String s4 =new String(bytes,0,len),从第0个开始读取,读取len个长度


      /*  int len3 = f.read(bytes);
        System.out.println(len3);//1
        String s3=new String(bytes);
        System.out.println(s3);//ed*/

       /* int len4 = f.read(bytes);
        System.out.println(len4);//-1
        String s4=new String(bytes);
        System.out.println(s4);//ed*/


        //b中有a,b,c,d,e
        //[a,b]->(a,b被c,d覆盖)->[c,d]->(只读取到了一个e,e把c给覆盖了,但d没有)->[e,d],现在是c中是没有让你去读取的了,然后返回-1,还是->[e,d]


        //但很明显我希望我的最后只打印e,而不是ed,我可以利用String 里面的一个构造方法 String s4 =new String(bytes,0,len),从第0个开始读取,读取len个长度


        int len3 = f.read(bytes);
        System.out.println(len3);//1
        String s3=new String(bytes,0,len3);
        System.out.println(s3);//ed

        f.close();
    }
}

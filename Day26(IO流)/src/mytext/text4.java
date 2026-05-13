package mytext;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class text4 {

    public static void main(String[] args) throws IOException {

        //这是text3的另外一种写法
        //需求:
        //把aa.txt文件中的2-4-3-1-5,进行排序后1-2-3-4-5,在bb.txt文件中进行输出
        //细节1：
        //文件中的数据不要换行
        //
        //细节2：
        //bom头

        //一.创建对象
        FileReader fis=new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aa.txt");
        int len;
        StringBuilder sb = new StringBuilder();
        while((len=fis.read())!=-1){
            sb.append((char)len );
        }

        //二.排序
        Integer[] arr = Arrays.stream(sb.toString().split("-")).
                map(Integer::parseInt).sorted().toArray(Integer[]::new);

        //三.写出
        FileWriter fw=new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\bb.txt");
        String s=Arrays.toString(arr).replace(",","-");
        String result=s.substring(1,s.length()-1);
        fw.write(result);
        fw.close();
        fis.close();

        //现在b中的运行结果是:1-2-3-4-5

    }

}

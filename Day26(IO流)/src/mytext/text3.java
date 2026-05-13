package mytext;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class text3 {

    public static void main(String[] args) throws IOException {

        //需求:
        //把aa.txt文件中的2-4-3-1-5,进行排序后1-2-3-4-5,在bb.txt文件中进行输出

        //创建对象
        FileReader fis=new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\aa.txt");
        int len;
        StringBuilder sb = new StringBuilder();
        while((len=fis.read())!=-1){
            sb.append((char)len );
        }

        ArrayList<Integer>list=new ArrayList<>();
        String s = sb.toString();
        String[] sp = s.split("-");
        for (String s1 : sp) {
            list.add(Integer.parseInt(s1));
        }
        Collections.sort(list);

        //这力要去写入,要用到FileWriter
        FileWriter fw=new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\bb.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                fw.write(list.get(i)+"");
            }
            else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();

    }
}

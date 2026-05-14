package mytext;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class text6 {
    public static void main(String[] args) throws IOException {


        //这是出师表的第二种写法是直接,直接利用treemap,因为会自动按照键的顺序进行排序
        //需求:把csb.txt的出诗表按照顺序进行排序
        BufferedReader bfr=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\csb.txt"));
        TreeMap<Integer,String> tm=new TreeMap<>();


        //一次性去读取一整行
        String len;
        while((len=bfr.readLine())!=null){
            tm.put(Integer.parseInt(len.split("\\.")[0]),len);
        }


        //这里是直接写在mm.txt
        BufferedWriter bfw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\mm.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bfw.write(entry.getValue());
            bfw.newLine();
        }

        bfw.close();



    }
}

package mytext;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class text5 {

    public static void main(String[] args) throws IOException {

        //需求:把csb.txt的出诗表按照顺序进行排序
        BufferedReader bfr=new BufferedReader(new FileReader("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\csb.txt"));
        ArrayList<String>list=new ArrayList<>();

        //一次性去读取一整行
        String len;
        while((len=bfr.readLine())!=null){
            list.add(len);
        }


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //这里的o1和o2代表string中的每个元素
             int O1=Integer.parseInt(o1.split("\\.")[0]);
             int O2=Integer.parseInt(o2.split("\\.")[0]);

             return  O1-O2;
            }
        });


        //放在m.txt中
        BufferedWriter bfw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day26(IO流)\\src\\m.txt"));
        for (int i = 0; i < list.size(); i++) {
            bfw.write(list.get(i));
            bfw.newLine();
        }
        bfw.close();

















    }
}

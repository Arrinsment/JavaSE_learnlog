package Love2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        String res="";
        int count=0;

        //先把所有数据读在一行,然后我在去找连续的数
        while (sc.hasNextLine()){
            count++;
            String s =sc.nextLine();
            res+=s;
        }
        list.add(count);

        if(res.charAt(0)=='1'){
            list.add(0);
        }
        char a=res.charAt(0);
        int cnt=0;
        for (int i = 0; i < res.length(); i++) {
           if(res.charAt(i)==a){
               cnt++;
           }
           else{
               list.add(cnt);
               a=res.charAt(i);
               cnt=1;
           }
        }
        list.add(cnt);

        for (int i : list) {
            System.out.print(i+" ");
        }


    }
}


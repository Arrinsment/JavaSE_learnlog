package Love2;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static  Scanner sc=  new Scanner(System.in);
    static  int []arr=new int[1];
    static  ArrayList<Integer>a=new ArrayList<>();
    static  int mid1=0;
    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr[0]; i++) {
            int s=sc.nextInt();
            a.add(s);
            mid1+=s;
        }
        mid1=(int)Math.ceil(mid1*1.0/2);
        System.out.println(mid1);
        }
    }


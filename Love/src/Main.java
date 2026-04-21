import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
      for (int i=0;i<7;i++){
          int a=sc.nextInt();
          int b=sc.nextInt();
          list1.add(a);
          list2.add(b);
      }

      int max=8;int index =0;
        for (int i = 0; i < 7; i++) {
            if((list1.get(i)+list2.get(i))>max){
                max=list1.get(i)+list2.get(i);
                index=i;
            }
        }

        if (max==8){
            System.out.println(0);
        }
        else{
            System.out.println(index+1);
        }


    }
}
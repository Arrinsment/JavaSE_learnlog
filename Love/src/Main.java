import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner SC=new Scanner(System.in);
     int a=SC.nextInt();
     int b=SC.nextInt();
     int c=SC.nextInt();

     int getApple=(int) Math.ceil((double)(c/b));
     if(b==0){
         System.out.println(0);
     }
     else{
         System.out.println(a-getApple);
     }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //然后如果你想保留小数(),这里是四舍五入的方式
        //double a=3.1415926
        //可以用System.out.printf("%.2f",a),3.14

       double a;int b;
        Scanner sc = new Scanner(System.in);
       a= sc.nextDouble();
       b=sc.nextInt();
       double res1=a/b;
        System.out.printf("%.3f",res1);
        System.out.println();
        System.out.println(b*2);

    }
}

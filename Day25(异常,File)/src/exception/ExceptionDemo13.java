package exception;

import java.util.Scanner;

public class ExceptionDemo13 {

    public static void main(String[] args) {
        /* 需求：
         键盘录入自己心仪的女朋友姓名和年龄。
         姓名的长度在3-10之间，
         年龄的范围为18-40岁，
         超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
         提示：
         需要考虑用户在键盘录入时的所有情况。
         比如：录入年龄时超出范围，录入年龄时录入了abc等情况*/

        Scanner sc = new Scanner(System.in);
        GirlFriend g = new GirlFriend();

        while(true){
            try{

                System.out.println("请输入你的女朋友名字");
                g.setName(sc.nextLine());
                System.out.println("请输入你的女朋友的年龄");
                String ageStr=sc.nextLine();
                int age=Integer.parseInt(ageStr);// parse报错解析:NumberFormatException
                g.setAge(age);
                 break;
            }

            catch (ageException e){
                e.printStackTrace();
            }
            catch (nameException e){
                e.printStackTrace();
            }
            catch (RuntimeException e){
                System.out.println("名字或者年龄范围输入错误,请重新去输入");
            }

        }
        System.out.println(g);

    }
    //这里为了让命名更加清晰,可以去使用自定义异常
    //自定义异常:
    //定义异常类
    //写继承关系
    //空参构造
    //带参构造
    //意义： 就是为了让控制台的报错信息更加的见名之意

    //为从我单独去创建了2个类 ageException / nameException
}

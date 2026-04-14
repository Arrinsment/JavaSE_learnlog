package InnerDemo4;

public class Outer {
    //这里讲讲静态内部类,
    // 1.静态内部类,只能访问外部类中的静态方法和静态变量
    // 2.如果要访问外部类中非静态的需要创建外部类的对象
   int a=10;
   static int b=10;

   public void show2(){}
   public static void show3(){}


    //这里我们先定义一个静态内部类
    static class inner{
        public void show(){
          //  System.out.println(a);//这里报错了,不能访问非静态的
            System.out.println(b);

            //如果静态内部类想要访问外部类的对象必须要先创建外部类的对象

            Outer S=new Outer();
            System.out.println(S.a);//现在就没有报错了
            System.out.println("非静态的方法被调用了");
        }


        public static  void show2(){
            System.out.println("静态的方法被调用了");
        }


    }

}

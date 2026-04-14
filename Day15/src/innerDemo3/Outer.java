package innerDemo3;


//讲解一道面试题目
public class Outer {
    int a = 30;
    //创建一个内部类

    public class Inner {
        int a = 20;

        public void method() {
            int a = 10;

            System.out.println(a);            //运行结果是10
            System.out.println(this.a);       //运行结果是20
            System.out.println(Outer.this.a); //运行结果是30 //这里的outer.this,是堆内存图中Inner创建的时候便有的,他会直接访问外部类中的this

            //然后你注意这里的内部类是成员内部类是没有用static去修饰的!用static去修饰的是静态内部类


        }
    }
}

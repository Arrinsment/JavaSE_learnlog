package InnerDemo2;

public class test {

    public static void main(String[] args) {
        //假如我要创建对象直接访问 内部类

        //方法一,然后直接去访问即可
        Outer.inner OI=new Outer().new inner();
        OI.sb();


        Outer O =new Outer();
       //我们这里用 O 创建了一个对象,调用了getInstance,然后返回值应该是一个内部类的对象
                        //为了方便我们可以使用多态的思想去接收这个内部类的对象,当然你也可以直接去调用
            //多态 =  O.getInstance(); //然后直接利用这个多态去掉用即可了


        //以上这种方法对于内部类被私有很有效,当然你可以直接把内部类前面的private改为public


        //jdk16以后可以内部类 可应用static去定义静态变量,jdk16前不可以(如:static int a=10)

    }
}

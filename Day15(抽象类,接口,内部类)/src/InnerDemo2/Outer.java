package InnerDemo2;

//一.在外面写一个Outer 外部类
public class Outer {
      private String name;
      private  int age;
    //这里主要讲讲成员内部类,就是在成员方法上面,外部类成员变量下面的类
     //你无论是内部类还是外部类的本质,不也是一个类吗?
    //成员内部类可以用  private ,默认,protected,public 去修饰

    //然后创建对像 可以使用 外部类.内部类 s=new 外部类.new 内部类()去创建对象
    //也可以在外部类定义一个方法 ,让他直接返回内部类的对象,然后我们直接创建对象利用多态去调用即可


     //二.我们在这里定义一个内部类
        public class inner{
            int age;
            public  void sb(){
                System.out.println("我是sb");
            }
     }

     //这里我们是直接创建了一个对象,然后直接返回的是内部类的对象,然后我们就可以直接去调用了
     public inner getInstance(){
            return new inner();
     }

}

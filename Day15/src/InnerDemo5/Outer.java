package InnerDemo5;

public class Outer {
    //这里我们讲讲局部内部类,就是定义在方法内部的的类就是局部内部类
        int b=20;
    public void  s(){
        //这里面我在定义一个内部类
        class Inner{
           int a=10;//外界是无法直接使用这个a的如果要用的话,要先创建对象

            public void s(){
                System.out.println(b); //这里可以直接打印外部类的b
            }
        }
        //创建对象是在定义内部类的方法内部进行打印的,你怎么可能在本类中去创建对象
        Inner s= new Inner ();
        System.out.println(s.a);
      //此时就可以用s 去调用局部内部的方法了

    }



}

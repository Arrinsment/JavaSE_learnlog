package InnerDemo1;

public class car {

    //今天我们开始学习内部类了,内部类外面的那个类叫外部类,而除了这几个外的其他类叫外部其他类
    //内部类像细胞,脱离了外部类(人),是没有意义的,

    private int age;
    private  String color;

    //在外部类定义一个方法,尝试对内部类进行访问
    public void method2(){
      //  System.out.println(engin);发现engin报错了,说明没有办法直接去访问

      //但我在外部类中创建了一个内部类的对象就可以直接访问l

        engin e=new engin();
        System.out.println(e.name);//发现这就可以了

      //但你换句话来想想,假如我在测试类中创建了一个外部类的对象(car s=new car()  ),我命名为s,那么你只是method2 里面有个car this
        // 而这个 s的地址也就是this 调用本类的age 和color ,所以你要调用内部类的你要先创建对象

    }

    //我们定义一个内部类,发动机
     public class engin{
         String name;

         //这里创建一个方法 对外部类进行访问
        public void method(){
            System.out.println(age);//发现内部类,可以直接对外部类进行访问
            System.out.println(name);//也可以直接对内部访问
        }
    }

    //这里有个细节,内部类可以直接访问外部类的 成员,包括私有的
    //而外部类无法直接访问内部类的成员 ,要先创建对象
}

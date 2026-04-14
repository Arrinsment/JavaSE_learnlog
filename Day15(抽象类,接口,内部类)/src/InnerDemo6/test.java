package InnerDemo6;

public class test {
    public static void main(String[] args) {
        //这里我们讲讲 匿名内部类
        //  基本格式
        //  new 接口/父类(){
        //     重写方法
        // };

       new swim()      {

           //这里面是方法的重写 ,重写的方法名是 接口/父类的名字
           //其实这个创建的整体是个对象 又叫实现类,而这个{}内部才是真正的类
           //这个swim只是代表的是接口/父类的名字
           //而new 就是把这个整体创建为一个对象
           @Override
           public void swim() {
               System.out.println("I love swim");
           }

                     };

       //这里我们在创建一个 父类Animal 而中间真正的类,其实是Animal 的子类,
        //
        // 我们本质上创建的是个  匿名内部类的对象!!!,而不是匿名内部类


        //所以我们完全可以使用多态的知识去使用 Fu fu=new zi

        //我们现在这里定义一个method 方法,方法参数是 Animal类型的
        //然后因为我们 这里的本质上创建的是 匿名内部类的对象,而这个对象有本质上是前面父类的子类 或者 接口 的实现类
        //既然是这样 我们当然可以使用多态的知识去使用 我直接往父类或者接口里面去放 那它根据对象的不同(当然这对象是同类型的) 最后直接表现出不同的形态 即可

        method(


                new Animal() {

                    @Override
                    public void eat() {
                        System.out.println("I love meal");
                    }
                }
        );

    }


    public static void method(Animal E){

        E.eat();
    }

}

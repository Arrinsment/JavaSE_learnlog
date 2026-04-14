package polymorphisDemo2;

public class test {
    public static void main(String[] args) {


        //多态调用成员的特点:
        //注意这里创建对象的方式是多态的方式
         // FU fi=new zi();
        Animal a=new Dog();
        //然后调用成员变量的方式:编译看左边,运行也看左边
        // 这里编译看左边的含义:先看左边的父类有没有这个成员变量比如这里是Animal中的name,有则编译成功,无则编译失败
        //运行也看左边指的是最后运行的结果是父类的结果,比如这里的父类的结果是Animal
        System.out.println(a.name);//运行结果是动物

        //然后调用成员方法的方式:编译看左边,运行看右边
        //编译看左边:先看左边Animal的对象是是不是存在,如果存在那么我们就看右边,右边是Dog对象,我们直接调用Dog对象的方法即可
        a.show();//运行结果Dog---show方法


        //然后这里的具体原因:
        //成员变量:调用的时候会把父类的成员变量继承下来 fu:name,zi:name
        //成员方法:调用的时候,子类会在虚方法表中把父类的进行覆盖,所以最后方法的结果和父类的一样


    }
}

package InnerDemo4;

public class test {
    public static void main(String[] args) {

        //如何去创建静态内部类的对象
        Outer.inner S=new Outer.inner();//这里和成员内部类不一样,不用在inner前面加new
        S.show();//这里是调用的是 静态内部类的非静态方法         的idea会给提示
        S.show2();//这里是静态的idea 不会给提示,但这样写绝对不会报错

        //当然对于 静态内部类的静态方法        的你也可以去类名调用
        Outer.inner.show2();

    }
}

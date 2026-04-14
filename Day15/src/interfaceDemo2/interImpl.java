package interfaceDemo2;

public class interImpl implements  inter,infer2,inter3{

    //接口3继承了接口1,2
    //所以如果你interImpl接入了接口3,你就要把接口1,2,3所有的抽象方法全部重写
    @Override
    public void method2() {

    }

    @Override
    public void method() {

    }

    @Override
    public void method3() {

    }
}

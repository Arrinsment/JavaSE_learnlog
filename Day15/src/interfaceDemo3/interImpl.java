package interfaceDemo3;

public class interImpl implements interA,interB{

    //这里因为前面的interA和interB中的show方法重名了


    @Override
    public void show() {
        System.out.println("默认方法");
    }
}

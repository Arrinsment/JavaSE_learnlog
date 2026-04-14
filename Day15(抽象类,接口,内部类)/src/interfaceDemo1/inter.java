package interfaceDemo1;

public interface inter {

    //在接口中的成员变量默认用public static final去修饰的
    // 所以你可以在测试类中直接用 inter加方法名去调用
     public static final int a=10;

     //无构造方法

     //然后在接口中创建成员方法的时候默认会加上 public abstrct 记得在()的末尾加上;

    public abstract void method();


}


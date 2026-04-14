package interfaceDemo1;

public class test {
    public static void main(String[] args) {
        //在接口中的成员变量默认用public static final去修饰的
        // 所以你可以在测试类中直接用 inter加方法名去调用
        System.out.println(inter.a);//运行结果是10
    }
}

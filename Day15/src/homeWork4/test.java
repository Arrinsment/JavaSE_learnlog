package homeWork4;

public class test {
    public static void main(String[] args) {
        Outer.method().show(); //这里完全是链式运行

        // interA A=   Outer.method() 先用一个接口A去接收实现类,然后在用实现类去调用 show方法即可;

        //
    }
}

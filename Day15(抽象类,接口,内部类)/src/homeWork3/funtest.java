package homeWork3;

public class funtest {
    public static void main(String[] args) {
        //方法一:创建对象 类型去调用
        funSon s=new funSon();
        s.fun();

        //方法二直接使用 匿名内部类对象去调用
        new Fun(){
            @Override
            public void fun() {
                System.out.println("前程坦途!");
            }
        }.fun();

        //方法二的另外的一种写法
        Fun f=new Fun() {
            @Override
            public void fun() {
                System.out.println("1314520");
            }
        };
        f.fun();
    }
}

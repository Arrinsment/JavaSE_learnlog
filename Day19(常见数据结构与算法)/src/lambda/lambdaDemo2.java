package lambda;

public class lambdaDemo2 {
    public static void main(String[] args) {


        //这里讲讲lambda表达式本身
        //这里主要用到的思想是函数式编程本身


        //lambda表达式的注意点
        //lambada表达式可以用来简化匿名内部类的书写
        //lambada表达式只能用来简化函数式接口的匿名内部类的书写
        //3.函数式接口:
        //有且仅有一个抽象方法的接口叫函数式接口,然后这个接口上方可以加@FunctionInterface注解

       /* method(new swim() {
            @Override
            public void swimming() {
                System.out.println("是去成功游泳的");
            }
        });
*/
        //在去写一遍 这个不是匿名内部类,而是匿名内部类的对象,这个是去实现swim这个接口的,所以又叫接口的实现类
        //然后这里使用lambda的本质上是去简化匿名内部类


        /*new swim() {
            @Override
            public void swimming*/ //把这些全部都删除

        //基本格式是 ()->{}

        method( () ->{
                System.out.println("是去成功游泳的");
            }
        );

    }

    public static void method(swim m){
        m.swimming();
    }
}

interface  swim{

    public abstract void swimming();

}
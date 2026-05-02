package Function;

public class FunctionDemo {

    //这里主要讲讲方法引用
    //定义： 把已经存在的方法拿过来用，作为函数式接口中抽象方法的方法体。
    //使用条件:
    //引用处必须是函数式接口。

    //被引用的方法必须已经存在。
    //被引用方法的形参和返回值需要跟抽象方法保持一致。
    //被引用方法的功能要满足当前需求。
    //示例对比
    //匿名内部类写法：
    //Arrays.sort(arr, new Comparator<Integer>() {
    //    @Override
    //    public int compare(Integer o1, Integer o2) {
    //        return o2 - o1;
    //    }
    //});

    //已有方法：
    //java
    //public int subtraction(int n1, int n2) {
    //    return n2 - n1;
    //}
    //可以用方法引用来简化代码，将 subtraction 方法直接作为 compare 的方法体


    //方法引用的分类
    //1. 引用静态方法

    //2. 引用成员方法:
    //引用其他类的成员方法
    //引用本类的成员方法
    //引用父类的成员方法
    //3. 引用构造方法

    //4. 其他调用方式:
    //使用类名引用成员方法
    //引用数组的构造方法

    public static void main(String[] args) {



    }
}

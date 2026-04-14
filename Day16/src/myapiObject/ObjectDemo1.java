package myapiObject;

public class ObjectDemo1 {
    public static void main(String[] args) {

        //这里我们新建一个Object类 去做代码演示
        //Object是所有类的父类,默认只有空参构造没有,有参数构造

        //一.toString
        Object obj=new Object();
        System.out.println(obj.toString());//java.lang.Object@b4c966a//这里是包名+类名+@(固定格式)+地址值
        //我们要注意一下,这里的Object是所有类的父类,我的意思是,无论你是任何类,只要你创建了,都可以去使用toString
        //1.细节
        //如果我们直接用 System.out.println();去打印一下对象名比如这里的 obj,他的结果也是java.lang.Object@b4c966a
        //对System.out.println()进行简单讲解
        //System:类名
        //out:静态变量
        //System.out:获取打印的对象
        //println是一个方法,如果你调用了这个方法,他会在底层使用toString()进行字符串输出,然后返回字符串
        //当他在控制台上输出完毕后,然后会换行
        //1.1 这里有个小问题
        //我们在打印的时候打印的是对象的地址值,但这个地址值对我们本身来说是没有任何屌用的我该怎么办?

        //处理方案重写父类!
        //我们直接把父类当中把toString进行方法重写即可,这里我们看看我在这个包类的Student类即可,
        student s=new student("baishiyun",16);
        System.out.println(s);//这里不是地址值了,而是name:baishiyun,age:16,父类方法重写确实有用

        //toString:的结论
        //1.如果我们想要获取对象的属性值,而不只是单纯的打印一下地址值,那么我们直接在类中对方法重写即可
        //2.然后我们可以在重写的方法中对属性值进行拼接即可




    }
}

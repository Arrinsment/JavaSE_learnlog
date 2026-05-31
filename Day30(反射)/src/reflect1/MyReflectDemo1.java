package reflect1;

public class MyReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {

        //源代码-->字节码文件-->Clss对象

        //这里取获取Class对象的目的就是为了取获取类里面的各种东西(成员方法,成员变量,构造方法)

        /*
         * 获取class对象的三种方式：
         * 1. Class.forName("全类名");
         * 2. 类名.class
         * 3. 对象.getClass();
         */

        //去获取Student这个类的字节码文件对象

        //1.第一种方式
        //全类名:包名+类名
        //这个是最长用的
        Class clazz = Class.forName("reflect1.Student");


        //2.第二种方式
        //一般我们都是当作参数去传递的
       Class clazz2 = Student.class;


       //3.第三种方式
        Student s = new Student();
        Class  clazz3=s.getClass();


        System.out.println(clazz==clazz2);//true
        System.out.println(clazz2==clazz3);//true
    }
}

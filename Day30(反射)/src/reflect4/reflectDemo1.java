package reflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class reflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        // 利用反射获取成员方法

        // Class类中用于获取成员方法的方法
        // Method[] getMethods(): 返回所有公共成员方法对象的数组，包括继承的
        // Method[] getDeclaredMethods(): 返回所有成员方法对象的数组，不包括继承的
        // Method getMethod(String name, Class<?>... parameterTypes): 返回单个公共成员方法对象
        // Method getDeclaredMethod(String name, Class<?>... parameterTypes): 返回单个成员方法对象

        // 获取方法的修饰符
        // 获取方法的名字
        // 获取方法的形参
        // 获取方法的抛出的异常


        // Method类中用于创建对象的方法
        // Object invoke(Object obj, Object... args): 运行方法
        // 参数一：用 obj 对象调用该方法
        // 参数二：调用方法的传递的参数（如果没有就不写）
        // 返回值：方法的返回值（如果没有就不写）


        //一.去获取字节码文件
        Class clazz = Class.forName("reflect4.Student");


       /* //一.Method[] getMethods(): 返回所有公共成员方法对象的数组，包括继承的
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/



      /*  //二. Method[] getDeclaredMethods(): 返回所有成员方法对象的数组，不包括继承的
        Field[] methods= clazz.getDeclaredFields();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }*/


        //三.获取单一指定的方法
        // Method getMethod(String name, Class<?>... parameterTypes): 返回单个公共成员方法对象,第一个是变量名,第二个是数据类型的字节码
        Method eat = clazz.getDeclaredMethod("eat", String.class, int.class);


        //获取方法修饰符:
        System.out.println(eat.getModifiers());//2


        // 获取方法的名字
        System.out.println(eat.getName());//eat


       //获取方法的形参
        Parameter[] P = eat.getParameters();
        for (Parameter p1 : P) {
            System.out.println(p1);
        }
        //java.lang.String arg0
        //int arg1
        //arg0、arg1 不是错误，是反射给参数的“默认编号”，代表第1个、第2个参数。
        //说白了,就是参数名

        //获取方法的返抛出的异常
        Class[] e = eat.getExceptionTypes();
        for (Class e1 : e) {
            System.out.println(e1);//class java.io.IOException
        }


        // Method类中用于创建对象的方法
        // Object invoke(Object obj, Object... args): 运行方法
        // 参数一：用 obj 对象调用该方法
        // 参数二：调用方法的传递的参数（如果没有就不写）
        // 返回值：方法的返回值（如果没有就不写）

        //一.创建一个Student对象
        Student s=new Student();

        //因为这里的eat方法是私有的,所以要去暴力反射
        eat.setAccessible(true);

        //假如这里有返回值,直接去用一个变量去接收即可,接收到的就是返回值
        eat.invoke(s,"汉堡",2);


    }
}

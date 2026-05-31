package reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class reflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        // 利用反射获取构造方法
        //Constructor :是指构造方法,Declare:声明,Declared:被声明的


        // Class类中用于获取构造方法的方法：
        // - Constructor<?>[] getConstructors()：返回所有公共构造方法对象的数组
        // - Constructor<?>[] getDeclaredConstructors()：返回所有构造方法对象的数组(包括私有与公有的,受保护(本包,其他包的子类( 默认被protect修饰的就是父类了,被protected 修饰父类的成员，不同包的子类继承后就能访问它。这就是 protected 的主要设计目的。)))
        // - Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个公共构造方法对象
        // - Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造方法对象
        //
        // Constructor类中用于创建对象的方法：
        // - T newInstance(Object... initargs)：根据指定的构造方法创建对象
        // - setAccessible(boolean flag)：设置为true，表示取消访问检查（可以调用private构造方法）



        //一.创造一个字节码对象
        Class Clazz = Class.forName("reflect2.Student");


       /* // - Constructor<?>[] getConstructors()：返回所有公共构造方法对象的数组
        Constructor[] cons = Clazz.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i]);
           r //public reflect2.Student()
            //public reflect2.Student(int)
            //public reflect2.Student(java.lang.String)
        }*/




      /*  // - Constructor<?>[] getDeclaredConstructors()：返回所有构造方法对象的数组
        // (包括私有与公有的,受保护的,默认的(本包,其他包的子类( 默认被protect修饰的就是父类了,被protected 修饰父类的成员，不同包的子类继承后就能访问它。这就是 protected 的主要设计目的。)))
        Constructor[] cons = Clazz.getDeclaredConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i]);
           //public reflect2.Student()
            //private reflect2.Student(java.lang.String,int)
            //protected reflect2.Student(int)
            //public reflect2.Student(java.lang.String)
        }*/



     /*   // - Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个公共构造方法对象
        Constructor cons = Clazz.getConstructor();
        //传递的参数要完全一样
        //传入的是字节码
        Constructor cons1 = Clazz.getConstructor(String.class);
        System.out.println(cons);//public reflect2.Student()
        System.out.println(cons1);//public reflect2.Student(java.lang.String)*/


/*

        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造方法对象
        Constructor cons1  = Clazz.getDeclaredConstructor();
        Constructor cons2  = Clazz.getDeclaredConstructor(int.class);
        Constructor cons3  = Clazz.getDeclaredConstructor(String.class);


        */
/*System.out.println(cons1);//public reflect2.Student()
        System.out.println(cons2);//protected reflect2.Student(int)
        System.out.println(cons3);//public reflect2.Student(java.lang.String)
        System.out.println(cons4);//private reflect2.Student(java.lang.String,int)*//*


*/

        Constructor cons4  = Clazz.getDeclaredConstructor(String.class,int.class);

        //然后利用这个反射获取到的构造方法,去解析细节
        //Modifiers是修饰的含义,返回值是数字

        int modifiers = cons4.getModifiers();
        System.out.println(modifiers);//2 代表private的含义


        Parameter[] p = cons4.getParameters();
        //Parameter是参数的意思
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
            //java.lang.String arg0
            //int arg1

            //这个arg0和arg1 是反射给基本数据类型取的名字
        }


        //我们现在可以利用反射得到得构造方法去直接获取对象
        //注意这里是私有的,被private修饰的,必须要去取消权限修饰
        //利用暴力反射即可:这里这个setAccessible(true)就代表取消权限修饰


        cons4.setAccessible(true);
        Student student = (Student) cons4.newInstance("张三", 23);
        System.out.println(student);//Student{name = 张三, age = 23}


    }
}

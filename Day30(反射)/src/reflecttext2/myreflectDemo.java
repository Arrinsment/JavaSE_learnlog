package reflecttext2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class myreflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //配置文件
        //上面的那个全类名对象
        //下面的方法


        //classname=com.itheima.myreflect6.Student
        //method=study

        //1.读取文件配置的信息
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("D:\\Javacode\\JavaSE_learnlog\\Day30(反射)\\src\\prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);//{classname=com.itheima.myreflect6.Student, method=study}


        //properties本质是Map集合
        //2.获取全类名和方法名
         String classname=(String) prop.get("classname");
         String method=(String) prop.get("method");


       //3.利用反射对象并去获取方法
        Class clazz = Class.forName(classname);


        //获取构造方法
        Constructor cons = clazz.getConstructor();
        Object o = cons.newInstance();


        //获取成员方法
        Method dm = clazz.getDeclaredMethod(method);
        dm.setAccessible(true);
        dm.invoke(o);//这里必须要先去传递一个对象,因为方法不能脱离对象存在
        //学生在学习



        //关于反射你要和普通Studnet类对比来看
    }
    // 1. 反射的作用
// 1. 获取任意一个类中的所有信息
// 2. 结合配置文件动态创建对象

// 2. 获得class字节码文件对象的三种方式
// 1. class.forName("全类名");
// 2. 类名.class
// 3. 对象.getClass();

// 3. 如何获取构造方法、成员方法、成员变量

// get: 获取
// set: 设置
// Constructor: 构造方法
// Parameter: 参数
// Field: 成员变量
// Modifiers: 修饰符
// Method: 方法
// Declared: 私有的
}

/*
一句话
        cons.newInstance() = 执行这个构造方法，创建对象。就是创建出来的有构造方法那个对象。*/
//无参构造
//java
// 获取无参构造
//Constructor cons = clazz.getConstructor();
// 创建对象（不传参数）
//Object o = cons.newInstance();
// 等价于正常代码
//Student s = new Student();


//有参构造
//java
// 获取有参构造（参数类型要匹配）
//Constructor cons = clazz.getConstructor(int.class);
// 创建对象（传入参数）
//Object o = cons.newInstance(23);
//// 等价于正常代码
//Student s = new Student(23);

/*
逐行详细解释
        第1行：获取类的字节码对象
        Class clazz = Class.forName("reflect4.Student");
        问题	答案
        做了什么？	把 reflect4.Student 这个类的字节码文件加载到内存，返回一个 Class 对象
        clazz 是什么？	Student 类的“说明书”，里面记录了类名、方法、字段等所有信息
        等价普通代码？	没有直接等价。普通代码是编译时就知道 Student 类，反射是运行时通过字符串去找

        第2行：获取指定的方法
        Method eat = clazz.getDeclaredMethod("eat", String.class, int.class);
        问题	答案
        做了什么？	从 clazz（Student的说明书）里，找到名字叫 "eat"、参数是 String 和 int 的那个方法
        Method eat 是什么？	代表 Student 类里的 eat(String, int) 这个方法本身（还没执行）
        String.class 是什么？	表示 String 类型的字节码，用来告诉反射“第一个参数是 String 类型”
        getDeclaredMethod vs getMethod	getDeclaredMethod 能拿到 private 方法，getMethod 只能拿 public
等价普通代码？	普通代码没有这一步。普通代码直接写 s.eat(...)，编译器自动知道是哪个方法


        第3行：暴力反射（打破封装）
        eat.setAccessible(true);
        问题	答案
        为什么要写？	因为 eat 方法是 private 的，Java 默认不允许外部调用
        做了什么？	撕掉 private 标签，告诉 JVM：允许调用这个私有方法
        不写会怎样？	第5行 invoke 会报错 IllegalAccessException
        等价普通代码？	普通代码根本不能在类外面调用 private 方法，所以没有等价操作

        第4行：创建对象
        Student s = new Student();
        问题	答案
        做了什么？	创建了一个 Student 对象
        为什么需要？	方法必须通过对象来调用（除非是 static 方法）
        等价普通代码？	完全一样

        第5行：执行方法
        eat.invoke(s, "汉堡", 2);
        问题	答案
        invoke 是什么意思？	执行/调用方法
        第一个参数 s	用哪个对象来调用这个方法（相当于 s. 点前面的部分）
        后面参数 "汉堡", 2	传给方法的实际参数
        返回值	如果方法有返回值，invoke 会返回；void 方法返回 null
        等价普通代码	s.eat("汉堡", 2)
        完整对照表

        反射代码	等价普通代码	说明
        Class.forName("reflect4.Student")	—	加载类，普通代码不需要
        getDeclaredMethod("eat", String.class, int.class)	—	找到方法，普通代码不需要
        setAccessible(true)	—	撕掉 private，普通代码没有（因为普通代码根本不能跨类调用 private）
        new Student()	new Student()	✅ 一样
        invoke(s, "汉堡", 2)	s.eat("汉堡", 2)	✅ 一样，只是写法不同

        一句话
        反射 = 把普通代码里的 对象.方法名(参数) 拆成了 4 步：加载类 → 找到方法 → 打破封装（如果需要）→ 创建对象 → invoke(对象, 参数)。

        你的反射代码，最后执行的就是 s.eat("汉堡", 2)。
*/



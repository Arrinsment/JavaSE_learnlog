package reflect3;

import java.lang.reflect.Field;

public class reflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


        /*
         * Class类中用于获取成员变量的方法
         * Field[] getFields()                : 返回所有公共成员变量对象的数组
         * Field[] getDeclaredFields()        : 返回所有成员变量对象的数组
         * Field getField(String name)        : 返回单个公共成员变量对象
         * Field getDeclaredField(String name): 返回单个成员变量对象
         *
         * Field类中用于创建对象的方法
         * void set(Object obj, Object value) : 赋值
         * Object get(Object obj)             : 获取值
         */


         //一.* Field[] getFields()                : 返回所有公共成员变量对象的数组
        //创建一个字节码对象
        Class  clazz= Class.forName("reflect3.Student");


     /*   //一.Field[] getFields()                : 返回所有公共成员变量对象的数组
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);//public java.lang.String reflect3.Student.gender
        }*/



      /*  //二.Field[] getDeclaredFields()        : 返回所有成员变量对象的数组
        Field[] f = clazz.getDeclaredFields();
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
            //private java.lang.String reflect3.Student.name
            //private int reflect3.Student.age
            //public java.lang.String reflect3.Student.gender
        }
*/



       /* // 三. Field getField(String name)        : 返回单个公共成员变量对象
        //这里传入的是变量名,但如果是被private修饰的会被报错
        Field gender = clazz.getField("gender");
        System.out.println(gender);//public java.lang.String reflect3.Student.gender
*/



     /*   //四. Field getDeclaredField(String name): 返回单个成员变量对象
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);//private java.lang.String reflect3.Student.name
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);//private int reflect3.Student.age
        Field gender1 = clazz.getDeclaredField("gender");
        System.out.println(gender1);//public java.lang.String reflect3.Student.gender
    */


        Field name = clazz.getDeclaredField("name");


        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);//2  (private)


        //获取成员变量的名字
        String name1 = name.getName();
        System.out.println(name1);//name


        //获取成员变量的数据类型
        Class type = name.getType();
        System.out.println(type);//class java.lang.String


        //获取成员变量的值
        //这里是利用反射去获取成员变量的值,如果参数被私有化就会报错
        //利用暴力反射即可忽略修饰符:name.setAccessible();
        name.setAccessible(true);
        Student stu = new Student("张三", 23, "男");
        String value =(String) name.get(stu);
        System.out.println(value);//张三


        //修改对象记录的值
        name.set(stu,"王五");
        System.out.println(stu);//Student{name = 王五, age = 23, gender = 男}

        //存取 private 字段的值才需要 setAccessible(true),获取“描述信息”不报错(操作符,数据类型.变量名那些)，操作“实际数据”才报错。

    }

}

package reflecttext1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class myreflectDemo {

    public static void main(String[] args) throws IllegalAccessException, IOException {

        //对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        //就是利用反射去把成员变量都去获取出来,然后去上传文件

        Student s=new  Student("小A",23,"女",167.5,"睡觉");
        Teacher t=new Teacher("波妞",10000);
        saveObject(s);
        saveObject(t);


    }

     public  static  void  saveObject(Object obj) throws IllegalAccessException, IOException {

        //获取字节码对象
         Class  clazz = obj.getClass();

         Field[] f = clazz.getDeclaredFields();

         BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day30(反射)\\src\\reflecttext1\\a.txt",true));

         for (Field f1 : f) {
             //因为你并不知道有没有被private修饰,全部都先去暴力修饰
             f1.setAccessible(true);
             Object o = f1.get(obj);
             //这里是无法把Object的,强转为String
              bw.write(f1.getName()+" "+o);
              bw.newLine();
             System.out.println(o);
         }
         bw.close();

         //小A
         //23
         //女
         //167.5
         //睡觉
         //波妞
         //10000
     }
}

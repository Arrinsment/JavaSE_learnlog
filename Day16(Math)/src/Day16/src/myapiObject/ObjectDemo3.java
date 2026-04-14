package Day16.src.myapiObject;

import com.google.gson.Gson;

public class ObjectDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //一.Object当中的克隆,clone
        //然后Object的克隆是浅克隆,就是直接把他所有的地址拷贝过来,基本数据类型就是值本身,引用数据类型就是地址值
        //这里的clone(克隆又叫对象拷贝),主要把一个对象拷贝到另外一个对象

        //创建一个user对象
        user u=new user(001,"zhangsan","123qwer","boy11",new int[]{1,2,3,4,5,6});

        //这里是没有办法直接调用 u.clone的,因为clone是被protected的只能被本包的类,或者其他包的子类才可以调用的
        //但我们可以在user中直接进行clone方法重写
        //相当于调用父类的clone方法,就是让java给我们克隆一个对象,并把克隆的对象返回出去
        //还要在上面接入一个接口 implements cloneable

        //现在开始克隆
          user u2= (user) u.clone();//克隆的对象还要先强制转换成user类型
        System.out.println(u);//当我们重写了toString的方法后,现在就可以直接把属性值打印出来,而不是地址值
        System.out.println(u2);


        //克隆对象的细节
        //java会在底层给我们写一个方法,并在底层把对象拷贝过去
        //步骤:
        //1.要在类中重写Object中的 clone 方法
        //2.然后我们要接入一个 cloneable的接口
        //3.使用完clone后记得转换成相关的类


        //二.深克隆:基本数据类型就是值本身,引用数据类型就是地址值,把这些值拷贝过去,但引用数据类型如果在
        //串池中没有,那就不是直接拷贝地址值过去了,而是新创建一个对象,把这个对象的地址值传递过去,但在传递之前
        //会把原来值赋值给给新对象,保证相同的



        //感觉自己写克隆太麻烦了,这里我们选择使用一个第三方工具

        //1.第三方写的代码导入到项目中
        //2.编写代码

        Gson gson=new Gson();
        //把对象变成一个字符串
        String s=gson.toJson(u);

        //在把字符串变回对象即可
        user u3=gson.fromJson(s,user.class);
        //打印对象
        System.out.println(u3);



    }

}

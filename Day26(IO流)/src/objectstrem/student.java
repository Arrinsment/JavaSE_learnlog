package objectstrem;


import java.io.Serial;
import java.io.Serializable;


    ///*
    //Serializable接口里面是没有抽象方法，标记型接口
    //一旦实现了这个接口，那么就表示当前的Student类可以被序列化
    //
    //理解：
    //一个物品的合格证
    //*/

public class student implements Serializable {

    //这里如果你后期去添加了一个新的javaBean 比如String location;
    //然后版本号会改变,然后你读取就会出现问题,所以我们要去固定版本号

    //关于版本号,可以光标停在student上面,然后alt+回车,它就会自动给你添加一个版本号
    @Serial
    private static final long serialVersionUID = -493480205416984249L;

    private  String name;
    private  int age;

    //假如你创建了一个location,然后你不想把它序列到本地中,可以用transient去修饰一下
    //transient :瞬态关键字

    private  transient  String location;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + "}";
    }


    //小结:
    ///*
    //# 序列化流/反序列化流的细节汇总
    //1. 使用序列化流将对象写到文件时，需要让javabean类实现Serializable接口。否则，会出现NotSerializableException异常。
    //2. 序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了。
    //3. 序列化对象后，修改了javabean类，再次反序列化，会不会有问题？
    //   会出问题，会抛出InvalidClassException异常。
    //   **解决方案：**给javabean类添加serialVersionUID（序列号、版本号）
    //4. 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
    //   **解决方案：**给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程。
    //*/
}
